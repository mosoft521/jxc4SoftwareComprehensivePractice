package com.gmail.mosoft521.cp.jxc.gui.iFrame;

import com.gmail.mosoft521.cp.jxc.entity.Jsr;
import com.gmail.mosoft521.cp.jxc.entity.KhInfo;
import com.gmail.mosoft521.cp.jxc.entity.Kucun;
import com.gmail.mosoft521.cp.jxc.entity.SellDetail;
import com.gmail.mosoft521.cp.jxc.entity.SpInfo;
import com.gmail.mosoft521.cp.jxc.gui.mainFrame.MainFrame;
import com.gmail.mosoft521.cp.jxc.javaBean.Item;
import com.gmail.mosoft521.cp.jxc.service.JsrService;
import com.gmail.mosoft521.cp.jxc.service.KhInfoService;
import com.gmail.mosoft521.cp.jxc.service.KucunService;
import com.gmail.mosoft521.cp.jxc.service.SellService;
import com.gmail.mosoft521.cp.jxc.service.SpInfoService;
import com.gmail.mosoft521.cp.jxc.vo.SellVO;
import com.gmail.mosoft521.cp.jxc.vo.SpInfoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class XiaoShouDan extends JInternalFrame {
    private static Logger LOGGER = LoggerFactory.getLogger(XiaoShouDan.class);

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //时间格式
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private ApplicationContext context;
    private SellService sellService;
    private JsrService jsrService;
    private KhInfoService khInfoService;
    private KucunService kucunService;
    private SpInfoService spInfoService;

    private final JTable table;

    private final JTextField sellDate = new JTextField();

    private JComboBox jsr = null; //经手人

    private final JComboBox jsfs = new JComboBox();

    private final JTextField lian = new JTextField();

    private final JComboBox kehu = new JComboBox();

    private final JTextField piaoHao = new JTextField();

    private final JTextField pzs = new JTextField("0");

    private final JTextField hpzs = new JTextField("0");

    private final JTextField hjje = new JTextField("0");

    private final JTextField ysjl = new JTextField();

    private final JTextField czy = new JTextField();

    private Date jhsjDate;

    private JComboBox sp;

    public XiaoShouDan(ApplicationContext context) {
        super();
        this.context = context;
        this.sellService = context.getBean("sellService", SellService.class);
        this.jsrService = context.getBean("jsrService", JsrService.class);
        this.khInfoService = context.getBean("khInfoService", KhInfoService.class);
        this.kucunService = context.getBean("kucunService", KucunService.class);
        this.spInfoService = context.getBean("spInfoService", SpInfoService.class);
        setMaximizable(true);
        setIconifiable(true);
        setClosable(true);
        getContentPane().setLayout(new GridBagLayout());
        setTitle("销售单");
        setBounds(50, 50, 700, 400);

        setupComponet(new JLabel("销售票号"), 0, 0, 1, 0, false);
        piaoHao.setFocusable(false);
        setupComponet(piaoHao, 1, 0, 1, 140, true);

        setupComponet(new JLabel("客户"), 2, 0, 1, 0, false);
        kehu.setPreferredSize(new Dimension(160, 21));
        kehu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                doKhSelectAction();
            }
        });
        setupComponet(kehu, 3, 0, 1, 1, true);

        setupComponet(new JLabel("联系人"), 4, 0, 1, 0, false);
        lian.setFocusable(false);
        lian.setPreferredSize(new Dimension(80, 21));
        setupComponet(lian, 5, 0, 1, 0, true);

        setupComponet(new JLabel("结算方式"), 0, 1, 1, 0, false);
        jsfs.addItem("支付宝");
        jsfs.addItem("微信");
        jsfs.setEditable(true);
        setupComponet(jsfs, 1, 1, 1, 1, true);

        setupComponet(new JLabel("销售时间"), 2, 1, 1, 0, false);
        sellDate.setFocusable(false);
        setupComponet(sellDate, 3, 1, 1, 1, true);

        setupComponet(new JLabel("经手人"), 4, 1, 1, 0, false);
        setupComponet(getJsrComboBox(), 5, 1, 1, 1, true);

        sp = new JComboBox();
        sp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SpInfo info = (SpInfo) sp.getSelectedItem();
                if (info != null && info.getId() != null) {
                    updateTable();
                }
            }
        });

        table = new JTable();
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        initTable();
        table.addContainerListener(new computeInfo());
        JScrollPane scrollPanel = new JScrollPane(table);
        scrollPanel.setPreferredSize(new Dimension(380, 200));
        setupComponet(scrollPanel, 0, 2, 6, 1, true);

        setupComponet(new JLabel("品种数"), 0, 3, 1, 0, false);
        pzs.setFocusable(false);
        setupComponet(pzs, 1, 3, 1, 1, true);

        setupComponet(new JLabel("货品总数"), 2, 3, 1, 0, false);
        hpzs.setFocusable(false);
        setupComponet(hpzs, 3, 3, 1, 1, true);

        setupComponet(new JLabel("hj金额"), 4, 3, 1, 0, false);
        hjje.setFocusable(false);
        setupComponet(hjje, 5, 3, 1, 1, true);

        setupComponet(new JLabel("验收结论"), 0, 4, 1, 0, false);
        setupComponet(ysjl, 1, 4, 1, 1, true);

        setupComponet(new JLabel("操作员"), 2, 4, 1, 0, false);
        czy.setFocusable(false);
        czy.setText(MainFrame.getCzyStateLabel().getText());
        setupComponet(czy, 3, 4, 1, 1, true);

        JButton tjButton = new JButton("添加");
        tjButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                initPiaoHao();
                stopTableCellEditing();
                for (int i = 0; i < table.getRowCount(); i++) {
                    SpInfo info = (SpInfo) table.getValueAt(i, 0);
                    if (table.getValueAt(i, 0) == null)
                        return;
                }
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.addRow(new Vector());
            }
        });
        setupComponet(tjButton, 4, 4, 1, 1, false);

        JButton sellButton = new JButton("销售");
        sellButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopTableCellEditing();
                clearEmptyRow();
                String hpzsStr = hpzs.getText();
                Float pzsStr = Float.valueOf(pzs.getText());
                String jeStr = hjje.getText();
                String jsfsStr = jsfs.getSelectedItem().toString();
                String jsrStr = jsr.getSelectedItem() + "";
                String czyStr = czy.getText();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String rkDate = df.format(jhsjDate); // ����ʱ��
                String ysjlStr = ysjl.getText().trim(); // ���ս���
                String id = piaoHao.getText(); // Ʊ��
                String kehuName = kehu.getSelectedItem().toString();// ��Ӧ������
                if (jsrStr == null || jsrStr.isEmpty()) {
                    JOptionPane.showMessageDialog(XiaoShouDan.this, "经手人为空！");
                    return;
                }
                if (ysjlStr == null || ysjlStr.isEmpty()) {
                    JOptionPane.showMessageDialog(XiaoShouDan.this, "验收结论为空");
                    return;
                }
                if (table.getRowCount() <= 0) {
                    JOptionPane.showMessageDialog(XiaoShouDan.this, "销售表为空");
                    return;
                }
                SellVO sellVO = new SellVO();
                sellVO.setSellid(id);
                sellVO.setPzs(pzsStr);
                sellVO.setJe(jeStr);
                sellVO.setYsjl(ysjlStr);
                sellVO.setKhname(kehuName);
                sellVO.setXsdate(jhsjDate);
                sellVO.setCzy(czyStr);
                sellVO.setJsr(jsrStr);
                sellVO.setJsfs(jsfsStr);

                List<SellDetail> sellDetailList = new ArrayList<>();
                sellVO.setSellDetailList(sellDetailList);
                int rows = table.getRowCount();
                for (int i = 0; i < rows; i++) {
                    SpInfo spinfo = (SpInfo) table.getValueAt(i, 0);
                    String djStr = (String) table.getValueAt(i, 6);
                    String slStr = (String) table.getValueAt(i, 7);
                    Float dj = Float.valueOf(djStr);
                    Float sl = Float.valueOf(slStr);
                    SellDetail detail = new SellDetail();
                    detail.setSpid(spinfo.getId());
                    detail.setSellid(sellVO.getSellid());
                    detail.setDj(dj);
                    detail.setSl(sl);
                    sellDetailList.add(detail);
                }
                boolean rs = sellService.insertSellInfo(sellVO);
                if (rs) {
                    JOptionPane.showMessageDialog(XiaoShouDan.this, "销售成功！");
                    DefaultTableModel dftm = new DefaultTableModel();
                    table.setModel(dftm);
                    initTable();
                    pzs.setText("0");
                    hpzs.setText("0");
                    hjje.setText("0");
                }

            }
        });
        setupComponet(sellButton, 5, 4, 1, 1, false);
        // ��Ӵ������������ɳ�ʼ��
        addInternalFrameListener(new initTasks());
    }

    private JComboBox getJsrComboBox() {
        if (jsr == null) {
            jsr = new JComboBox();
            List<Jsr> czyList = jsrService.getJsrs();
            for (Jsr tmpJsr : czyList) {
                String id = tmpJsr.getId().toString();
                String name = tmpJsr.getName();
                Item item = new Item(id, name);
                item.setId(id + "");
                item.setName(name);
                jsr.addItem(item);
            }
        }
        return jsr;
    }

    private void initTable() {
        String[] columnNames = {"名称", "id", "供应商", "产地", "单位", "规格", "单价",
                "库存数量", "包装", "批号", "批准文号"};
        ((DefaultTableModel) table.getModel())
                .setColumnIdentifiers(columnNames);
        TableColumn column = table.getColumnModel().getColumn(0);
        final DefaultCellEditor editor = new DefaultCellEditor(sp);
        editor.setClickCountToStart(2);
        column.setCellEditor(editor);
    }

    //
    private void initSpBox() {
        List list = new ArrayList();
        List<SpInfoVO> spInfoList = spInfoService.selectExistKucun();
        sp.removeAllItems();
        sp.addItem(new SpInfo());
        for (int i = 0; table != null && i < table.getRowCount(); i++) {
            SpInfo tmpInfo = (SpInfo) table.getValueAt(i, 0);
            if (tmpInfo != null && tmpInfo.getId() != null)
                list.add(tmpInfo.getId());
        }
        for(SpInfo spInfo:spInfoList){
            sp.addItem(spInfo);
        }
    }

    // �������λ�ò���ӵ�������
    private void setupComponet(JComponent component, int gridx, int gridy,
                               int gridwidth, int ipadx, boolean fill) {
        final GridBagConstraints gridBagConstrains = new GridBagConstraints();
        gridBagConstrains.gridx = gridx;
        gridBagConstrains.gridy = gridy;
        if (gridwidth > 1)
            gridBagConstrains.gridwidth = gridwidth;
        if (ipadx > 0)
            gridBagConstrains.ipadx = ipadx;
        gridBagConstrains.insets = new Insets(5, 1, 3, 1);
        if (fill)
            gridBagConstrains.fill = GridBagConstraints.HORIZONTAL;
        getContentPane().add(component, gridBagConstrains);
    }

    //
    private void doKhSelectAction() {
        Item item = (Item) kehu.getSelectedItem();
        KhInfo khInfo = khInfoService.getKhInfo(item);
        lian.setText(khInfo.getLian());
    }

    //
    private final class computeInfo implements ContainerListener {
        public void componentRemoved(ContainerEvent e) {
            clearEmptyRow();
            int rows = table.getRowCount();
            int count = 0;
            double money = 0.0;
            SpInfo column = null;
            if (rows > 0)
                column = (SpInfo) table.getValueAt(rows - 1, 0);
            if (rows > 0 && (column == null || column.getId().isEmpty()))
                rows--;
            for (int i = 0; i < rows; i++) {
                String column7 = (String) table.getValueAt(i, 7);
                String column6 = (String) table.getValueAt(i, 6);
                int c7 = (column7 == null || column7.isEmpty()) ? 0 : Integer
                        .valueOf(column7);
                Double c6 = (column6 == null || column6.isEmpty()) ? 0 : Double
                        .valueOf(column6);
                count += c7;
                money += c6 * c7;
            }
            pzs.setText(rows + "");
            hpzs.setText(count + "");
            hjje.setText(money + "");
            //
        }

        public void componentAdded(ContainerEvent e) {

        }
    }

    // ����ĳ�ʼ������
    private final class initTasks extends InternalFrameAdapter {
        public void internalFrameActivated(InternalFrameEvent e) {
            super.internalFrameActivated(e);
            initTimeField();
            initKehuField();
            initPiaoHao();
            initSpBox();
        }

        private void initKehuField() {//
            List<KhInfo> khInfoList = khInfoService.getKhInfos();
            for (KhInfo khInfo : khInfoList) {
                Item item = new Item();
                item.setId(khInfo.getId());
                item.setName(khInfo.getKhname());
                kehu.addItem(item);
            }
            doKhSelectAction();
        }

        private void initTimeField() {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        while (true) {
                            jhsjDate = new Date();
                            sellDate.setText(jhsjDate.toLocaleString());
                            Thread.sleep(100);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    private void initPiaoHao() {
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        String maxId = sellService.getSellMainMaxId(date);
        piaoHao.setText(maxId);
    }


    private synchronized void updateTable() {
        SpInfo spinfo = (SpInfo) sp.getSelectedItem();
        Item item = new Item();
        item.setId(spinfo.getId());
        Kucun kucun = kucunService.getKucun(item);
        int row = table.getSelectedRow();
        if (row >= 0 && spinfo != null) {
            table.setValueAt(spinfo.getId(), row, 1);
            table.setValueAt(spinfo.getGysname(), row, 2);
            table.setValueAt(spinfo.getCd(), row, 3);
            table.setValueAt(spinfo.getDw(), row, 4);
            table.setValueAt(spinfo.getGg(), row, 5);
            table.setValueAt(kucun.getDj() + "", row, 6);
            table.setValueAt(kucun.getKcsl().intValue() + "", row, 7);
            table.setValueAt(spinfo.getBz(), row, 8);
            table.setValueAt(spinfo.getPh(), row, 9);
            table.setValueAt(spinfo.getPzwh(), row, 10);
            table.editCellAt(row, 7);
        }
    }

    // �������
    private synchronized void clearEmptyRow() {
        DefaultTableModel dftm = (DefaultTableModel) table.getModel();
        for (int i = 0; i < table.getRowCount(); i++) {
            SpInfo info2 = (SpInfo) table.getValueAt(i, 0);
            if (info2 == null || info2.getId() == null
                    || info2.getId().isEmpty()) {
                dftm.removeRow(i);
            }
        }
    }

    // ֹͣ���Ԫ�ı༭
    private void stopTableCellEditing() {
        TableCellEditor cellEditor = table.getCellEditor();
        if (cellEditor != null)
            cellEditor.stopCellEditing();
    }
}
