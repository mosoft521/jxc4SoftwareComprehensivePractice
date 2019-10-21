package com.gmail.mosoft521.cp.jxc.gui.mainFrame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class DesktopPanel extends JDesktopPane {
	private static Logger LOGGER = LoggerFactory.getLogger(DesktopPanel.class);

	private ApplicationContext context;
	
	private final Image img ;
	public DesktopPanel(ApplicationContext context){
		super();
		this.context = context;
		URL url = this.getClass().getResource("/res/back.jpg");
		img = new ImageIcon(url).getImage();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		//super.paintComponent(g);
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	}
	
}
