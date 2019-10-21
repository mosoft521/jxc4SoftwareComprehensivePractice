package com.gmail.mosoft521.cp.jxc.gui.iFrame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

public class GuanYu extends JInternalFrame {

	private static Logger LOGGER = LoggerFactory.getLogger(GuanYu.class);

	private ApplicationContext context;


	public GuanYu(ApplicationContext context) {
		this.context = context;
		setBackground(Color.LIGHT_GRAY);
		setNormalBounds(new Rectangle(50, 30, 0, 0));
		setLocation(50, 30);
		setBounds(100, 100, 355, 148);
		getContentPane().setLayout(null);
		
		JButton button = new JButton("确定");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setClosed(true);
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(257, 86, 72, 23);
		getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("制作人：张三");
		lblNewLabel.setBounds(39, 24, 145, 23);
		getContentPane().add(lblNewLabel);
		
		JLabel lblQq = new JLabel("QQ：1214585404");
		lblQq.setBounds(39, 57, 145, 23);
		getContentPane().add(lblQq);

	}
}
