package com.gmail.mosoft521.cp.jxc.gui.iFrame;

import com.gmail.mosoft521.cp.jxc.gui.iFrame.shangPinGuanLi.ShangPinTianJiaPanel;
import com.gmail.mosoft521.cp.jxc.gui.iFrame.shangPinGuanLi.ShangPinXiuGaiPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;


public class ShangPinGuanLi extends JInternalFrame {
    private static Logger LOGGER = LoggerFactory.getLogger(ShangPinGuanLi.class);

    private ApplicationContext context;

    public ShangPinGuanLi(ApplicationContext context) {
        this.context = context;
        setIconifiable(true);
        setClosable(true);
        setTitle("商品管理");
        JTabbedPane tabPane = new JTabbedPane();
        final ShangPinXiuGaiPanel spxgPanel = new ShangPinXiuGaiPanel(context);
        final ShangPinTianJiaPanel sptjPanel = new ShangPinTianJiaPanel(context);
        tabPane.addTab("商品添加", null, sptjPanel, "商品添加&&");
        tabPane.addTab("商品修改", null, spxgPanel, "商品修改&&");
        getContentPane().add(tabPane);
        tabPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                spxgPanel.initComboBox();
                spxgPanel.initGysBox();
            }
        });

        addInternalFrameListener(new InternalFrameAdapter() {
            public void internalFrameActivated(InternalFrameEvent e) {
                super.internalFrameActivated(e);
                sptjPanel.initGysBox();
            }
        });
        pack();
        setVisible(true);
    }
}
