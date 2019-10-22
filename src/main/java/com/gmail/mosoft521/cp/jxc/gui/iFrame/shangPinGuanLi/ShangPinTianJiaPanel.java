package com.gmail.mosoft521.cp.jxc.gui.iFrame.shangPinGuanLi;

import com.gmail.mosoft521.cp.jxc.entity.GysInfo;
import com.gmail.mosoft521.cp.jxc.entity.SpInfo;
import com.gmail.mosoft521.cp.jxc.javaBean.Item;
import com.gmail.mosoft521.cp.jxc.service.GysInfoService;
import com.gmail.mosoft521.cp.jxc.service.SpInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ShangPinTianJiaPanel extends JPanel {
    private static Logger LOGGER = LoggerFactory.getLogger(ShangPinTianJiaPanel.class);

    private ApplicationContext context;
    private SpInfoService spInfoService;
    private GysInfoService gysInfoService;

    private JComboBox gysQuanCheng;
    private JTextField beiZhu;
    private JTextField wenHao;
    private JTextField piHao;
    private JTextField baoZhuang;
    private JTextField guiGe;
    private JTextField danWei;
    private JTextField chanDi;
    private JTextField jianCheng;
    private JTextField quanCheng;
    private JButton resetButton;

    public ShangPinTianJiaPanel(ApplicationContext context) {
        this.context = context;
        this.spInfoService = context.getBean("spInfoService", SpInfoService.class);
        this.gysInfoService = context.getBean("gysInfoService", GysInfoService.class);
        setLayout(new GridBagLayout());
        setBounds(10, 10, 550, 400);
        setupComponent(new JLabel("全称"), 0, 0, 1, 1, false);
        quanCheng = new JTextField();
        setupComponent(quanCheng, 1, 0, 3, 1, true);
        setupComponent(new JLabel("简称"), 0, 1, 1, 1, false);
        jianCheng = new JTextField();
        setupComponent(jianCheng, 1, 1, 3, 10, true);
        setupComponent(new JLabel("产地"), 0, 2, 1, 1, false);
        chanDi = new JTextField();
        setupComponent(chanDi, 1, 2, 3, 300, true);
        setupComponent(new JLabel("单位"), 0, 3, 1, 1, false);
        danWei = new JTextField();
        setupComponent(danWei, 1, 3, 1, 130, true);
        setupComponent(new JLabel("规格"), 2, 3, 1, 1, false);
        guiGe = new JTextField();
        setupComponent(guiGe, 3, 3, 1, 1, true);
        setupComponent(new JLabel("包装"), 0, 4, 1, 1, false);
        baoZhuang = new JTextField();
        setupComponent(baoZhuang, 1, 4, 1, 1, true);
        setupComponent(new JLabel("票号"), 2, 4, 1, 1, false);
        piHao = new JTextField();
        setupComponent(piHao, 3, 4, 1, 1, true);
        setupComponent(new JLabel("文号"), 0, 5, 1, 1, false);
        wenHao = new JTextField();
        setupComponent(wenHao, 1, 5, 3, 1, true);
        setupComponent(new JLabel("供应商全称"), 0, 6, 1, 1, false);
        gysQuanCheng = new JComboBox();
        gysQuanCheng.setMaximumRowCount(5);
        setupComponent(gysQuanCheng, 1, 6, 3, 1, true);
        setupComponent(new JLabel("备注"), 0, 7, 1, 1, false);
        beiZhu = new JTextField();
        setupComponent(beiZhu, 1, 7, 3, 1, true);
        final JButton tjButton = new JButton();
        tjButton.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                if (baoZhuang.getText().equals("")
                        || chanDi.getText().equals("")
                        || danWei.getText().equals("")
                        || guiGe.getText().equals("")
                        || jianCheng.getText().equals("")
                        || piHao.getText().equals("")
                        || wenHao.getText().equals("")
                        || quanCheng.getText().equals("")) {
                    JOptionPane.showMessageDialog(ShangPinTianJiaPanel.this,
                            "有信息为空，请补全信息！", "提示信息", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                boolean existBySpname = spInfoService.existBySpname(quanCheng.getText().trim());
                if (existBySpname) {
                    System.out.println("error");
                    JOptionPane.showMessageDialog(
                            ShangPinTianJiaPanel.this, "已存在该商品",
                            "信息提示", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                String id = spInfoService.selectMaxId();
                SpInfo spInfo = new SpInfo();
                spInfo.setId(id);
                spInfo.setBz(baoZhuang.getText().trim());
                spInfo.setCd(chanDi.getText().trim());
                spInfo.setDw(danWei.getText().trim());
                spInfo.setGg(guiGe.getText().trim());
                spInfo.setGysname(gysQuanCheng.getSelectedItem().toString()
                        .trim());
                spInfo.setJc(jianCheng.getText().trim());
                spInfo.setMemo(beiZhu.getText().trim());
                spInfo.setPh(piHao.getText().trim());
                spInfo.setPzwh(wenHao.getText().trim());
                spInfo.setSpname(quanCheng.getText().trim());
                spInfoService.addSp(spInfo);
                JOptionPane.showMessageDialog(ShangPinTianJiaPanel.this,
                        "添加商品成功", "信息提示", JOptionPane.INFORMATION_MESSAGE);
                resetButton.doClick();
            }
        });
        tjButton.setText("添加");
        setupComponent(tjButton, 1, 8, 1, 1, false);
        final GridBagConstraints gridBagConstraints_20 = new GridBagConstraints();
        gridBagConstraints_20.weighty = 1.0;
        gridBagConstraints_20.insets = new Insets(0, 65, 0, 15);
        gridBagConstraints_20.gridy = 8;
        gridBagConstraints_20.gridx = 1;
        // 重置按钮
        resetButton = new JButton();
        setupComponent(tjButton, 3, 8, 1, 1, false);
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                baoZhuang.setText("");
                chanDi.setText("");
                danWei.setText("");
                guiGe.setText("");
                jianCheng.setText("");
                beiZhu.setText("");
                piHao.setText("");
                wenHao.setText("");
                quanCheng.setText("");
            }
        });
        resetButton.setText("重置信息");
    }

    // 布局
    private void setupComponent(JComponent component, int gridx, int gridy,
                                int gridwidth, int ipadx, boolean fill) {
        final GridBagConstraints gridBagConstrains = new GridBagConstraints();
        gridBagConstrains.gridx = gridx;
        gridBagConstrains.gridy = gridy;
        gridBagConstrains.insets = new Insets(5, 1, 3, 1);
        if (gridwidth > 1)
            gridBagConstrains.gridwidth = gridwidth;
        if (ipadx > 0)
            gridBagConstrains.ipadx = ipadx;
        if (fill)
            gridBagConstrains.fill = GridBagConstraints.HORIZONTAL;
        add(component, gridBagConstrains);
    }

    // 初始化供应商
    public void initGysBox() {
        List<GysInfo> gysInfoList = gysInfoService.getGysInfos();
        List<Item> items = new ArrayList<Item>();//做排重用的，待优化
        gysQuanCheng.removeAllItems();
        for (GysInfo gysInfo : gysInfoList) {
            Item item = new Item();
            item.setId(gysInfo.getId());
            item.setName(gysInfo.getName());
            if (items.contains(item))
                continue;
            items.add(item);
            gysQuanCheng.addItem(item);
        }
    }
}