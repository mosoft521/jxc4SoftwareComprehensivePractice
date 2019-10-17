package com.gmail.mosoft521.cp.jxc.gui.mainFrame;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class DesktopPanel extends JDesktopPane {
	
	private final Image img ;
	public DesktopPanel(){
		super();
		URL url = this.getClass().getResource("/res/back.jpg");
		img = new ImageIcon(url).getImage();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		//super.paintComponent(g);
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	}
	
}
