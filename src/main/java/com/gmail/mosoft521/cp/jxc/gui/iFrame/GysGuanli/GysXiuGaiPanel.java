package com.gmail.mosoft521.cp.jxc.gui.iFrame.GysGuanli;

import com.gmail.mosoft521.cp.jxc.entity.GysInfo;
import com.gmail.mosoft521.cp.jxc.gui.KeyListener.InputKeyListener;
import com.gmail.mosoft521.cp.jxc.javaBean.Item;
import com.gmail.mosoft521.cp.jxc.service.GysInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GysXiuGaiPanel extends JPanel {
    private static Logger LOGGER = LoggerFactory.getLogger(GysXiuGaiPanel.class);

    private ApplicationContext context;
    private GysInfoService gysInfoService;

    private JTextField EMailF;
    private JTextField yinHangF;
    private JTextField lianXiRenDianHuaF;
    private JTextField lianXiRenF;
    private JTextField chuanZhenF;
    private JTextField dianHuaF;
    private JTextField diZhiF;
    private JTextField bianMaF;
    private JTextField jianChengF;
    private JTextField quanChengF;
    private JButton resetButton;
    private JComboBox gys;

    public GysXiuGaiPanel(ApplicationContext context) {
        this.context = context;
        this.gysInfoService = context.getBean("gysInfoService", GysInfoService.class);
        setLayout(new GridBagLayout());
        setBounds(10, 10, 510, 302);

        setupComponet(new JLabel("全称"), 0, 0, 1, 1, false);
        quanChengF = new JTextField();
        quanChengF.setEditable(false);
        setupComponet(quanChengF, 1, 0, 3, 400, true);

        setupComponet(new JLabel("简称"), 0, 1, 1, 1, false);

        jianChengF = new JTextField();
        setupComponet(jianChengF, 1, 1, 1, 160, true);

        setupComponet(new JLabel("邮政编码"), 2, 1, 1, 1, false);
        bianMaF = new JTextField();
        bianMaF.addKeyListener(new InputKeyListener());
        setupComponet(bianMaF, 3, 1, 1, 0, true);

        setupComponet(new JLabel("地址"), 0, 2, 1, 1, false);
        diZhiF = new JTextField();
        setupComponet(diZhiF, 1, 2, 3, 0, true);

        setupComponet(new JLabel("电话"), 0, 3, 1, 1, false);
        dianHuaF = new JTextField();
        dianHuaF.addKeyListener(new InputKeyListener());
        setupComponet(dianHuaF, 1, 3, 1, 0, true);

        setupComponet(new JLabel("传真"), 2, 3, 1, 1, false);
        chuanZhenF = new JTextField();
        chuanZhenF.addKeyListener(new InputKeyListener());
        setupComponet(chuanZhenF, 3, 3, 1, 0, true);

        setupComponet(new JLabel("联系人"), 0, 4, 1, 1, false);
        lianXiRenF = new JTextField();
        setupComponet(lianXiRenF, 1, 4, 1, 0, true);

        setupComponet(new JLabel("联系人电话"), 2, 4, 1, 1, false);
        lianXiRenDianHuaF = new JTextField();
        lianXiRenDianHuaF.addKeyListener(new InputKeyListener());
        setupComponet(lianXiRenDianHuaF, 3, 4, 1, 0, true);

        setupComponet(new JLabel("银行"), 0, 5, 1, 1, false);
        yinHangF = new JTextField();
        setupComponet(yinHangF, 1, 5, 1, 0, true);

        setupComponet(new JLabel("邮箱"), 2, 5, 1, 1, false);
        EMailF = new JTextField();
        setupComponet(EMailF, 3, 5, 1, 0, true);

        setupComponet(new JLabel("供应商"), 0, 7, 1, 0, false);
        gys = new JComboBox();
        gys.setPreferredSize(new Dimension(230, 21));
        initComboBox();

        gys.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                doGysSelectAction();
            }
        });

        setupComponet(gys, 1, 7, 2, 0, true);
        JButton modifyButton = new JButton("修改");
        JButton delButton = new JButton("删除");
        JPanel panel = new JPanel();
        panel.add(modifyButton);
        panel.add(delButton);

        setupComponet(panel, 3, 7, 1, 0, false);

        delButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Item item = (Item) gys.getSelectedItem();
                if (item == null || !(item instanceof Item))
                    return;
                int confirm = JOptionPane.showConfirmDialog(
                        GysXiuGaiPanel.this, "确认修改？");
                if (confirm == JOptionPane.YES_OPTION) {
                    int rs = gysInfoService.deleteByPrimaryKey(item.getId());
                    if (rs > 0) {
                        JOptionPane.showMessageDialog(GysXiuGaiPanel.this,
                                "供应商" + item.getName() + "删除成功！");
                        gys.removeItem(item);
                    } else {
                        JOptionPane.showMessageDialog(GysXiuGaiPanel.this,
                                "供应商" + item.getName() + "删除失败");
                    }
                }
            }
        });

        modifyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Item item = (Item) gys.getSelectedItem();
                GysInfo gysInfo = new GysInfo();
                gysInfo.setId(item.getId());
                gysInfo.setAddress(diZhiF.getText().trim());
                gysInfo.setBianma(bianMaF.getText().trim());
                gysInfo.setFax(chuanZhenF.getText().trim());
                gysInfo.setYh(yinHangF.getText().trim());
                gysInfo.setJc(jianChengF.getText().trim());
                gysInfo.setName(quanChengF.getText().trim());
                gysInfo.setLian(lianXiRenF.getText().trim());
                gysInfo.setLtel(lianXiRenDianHuaF.getText().trim());
                gysInfo.setMail(EMailF.getText().trim());
                gysInfo.setTel(dianHuaF.getText().trim());
                if (gysInfoService.updateGys(gysInfo) == 1)
                    JOptionPane.showMessageDialog(GysXiuGaiPanel.this, "更新成功");
                else
                    JOptionPane.showMessageDialog(GysXiuGaiPanel.this, "更新失败");
            }
        });
    }

    public void initComboBox() {
        List<GysInfo> gysInfoList = gysInfoService.getGysInfos();
        List<Item> items = new ArrayList<Item>();
        gys.removeAllItems();
        for (GysInfo gysInfo:gysInfoList) {
            Item item = new Item();
            item.setId(gysInfo.getId());
            item.setName(gysInfo.getName());
            if (items.contains(item))
                continue;
            items.add(item);
            gys.addItem(item);
        }
        doGysSelectAction();
    }

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
        add(component, gridBagConstrains);
    }

    private void doGysSelectAction() {
        Item selectedItem;
        if (!(gys.getSelectedItem() instanceof Item)) {
            return;
        }
        selectedItem = (Item) gys.getSelectedItem();
        GysInfo gysInfo = gysInfoService.getGysInfo(selectedItem);
        quanChengF.setText(gysInfo.getName());
        diZhiF.setText(gysInfo.getAddress());
        jianChengF.setText(gysInfo.getJc());
        bianMaF.setText(gysInfo.getBianma());
        dianHuaF.setText(gysInfo.getTel());
        chuanZhenF.setText(gysInfo.getFax());
        lianXiRenF.setText(gysInfo.getLian());
        lianXiRenDianHuaF.setText(gysInfo.getLtel());
        EMailF.setText(gysInfo.getMail());
        yinHangF.setText(gysInfo.getYh());
    }
}
