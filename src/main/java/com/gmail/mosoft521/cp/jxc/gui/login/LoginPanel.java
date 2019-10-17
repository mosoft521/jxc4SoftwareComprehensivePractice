package com.gmail.mosoft521.cp.jxc.gui.login;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LoginPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(img, 0, 0, this);
	}
	private Image img ;
	public LoginPanel(){
		super();
		URL url = this.getClass().getResource("/res/login.jpg");
		//System.out.println(url);
		img = new ImageIcon(url).getImage();
	}

}
