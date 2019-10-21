package com.gmail.mosoft521.cp.jxc.gui.iFrame;

import com.gmail.mosoft521.cp.jxc.gui.iFrame.keHuGuanLi.KeHuTianJiaPanel;
import com.gmail.mosoft521.cp.jxc.gui.iFrame.keHuGuanLi.KeHuXiuGaiPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class KeHuGuanLi extends JInternalFrame {
	private static Logger LOGGER = LoggerFactory.getLogger(KeHuGuanLi.class);

	private ApplicationContext context;

	public KeHuGuanLi(ApplicationContext context) {
		this.context = context;
		setIconifiable(true);
		setClosable(true);
		setTitle("客户管理");
		JTabbedPane tabPane = new JTabbedPane();
		final KeHuXiuGaiPanel khxgPanel = new KeHuXiuGaiPanel();
		final KeHuTianJiaPanel khtjPanel = new KeHuTianJiaPanel();
		tabPane.addTab("客户添加", null, khtjPanel, "客户添加");
		tabPane.addTab("客户修改", null, khxgPanel, "客户修改");
		getContentPane().add(tabPane);
		tabPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				khxgPanel.initComboBox();
			}
		});
		pack();
		setVisible(true);
	}
}
