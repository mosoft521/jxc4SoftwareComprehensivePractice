package com.gmail.mosoft521.cp.jxc.gui.iFrame;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JsrGL extends JInternalFrame {
	private static Logger LOGGER = LoggerFactory.getLogger(JsrGL.class);

	private ApplicationContext context;

	public JsrGL(ApplicationContext context) {
		this.context = context;
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 491, 200);
		setTitle("经手人管理");
		JTabbedPane tabPane = new JTabbedPane();
		final TJJingShouRen tjPanel = new TJJingShouRen(context);
		final SetJSR setPanel = new SetJSR(context);
		tabPane.addTab("添加", null, tjPanel, "添加");
		tabPane.addTab("设置", null, setPanel, "设置");
		getContentPane().add(tabPane);
		tabPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				setPanel.initTable();
			}
		});
		pack();
		setVisible(true);
	}
}
