package com.gmail.mosoft521.cp.jxc.gui.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LoginPanel extends JPanel {
	private static Logger LOGGER = LoggerFactory.getLogger(LoginPanel.class);

	private ApplicationContext context;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(img, 0, 0, this);
	}
	private Image img ;
	public LoginPanel(ApplicationContext context){
		super();
		this.context = context;
		URL url = this.getClass().getResource("/res/login.jpg");
		//System.out.println(url);
		img = new ImageIcon(url).getImage();
	}

}
