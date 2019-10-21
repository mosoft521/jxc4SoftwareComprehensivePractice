package com.gmail.mosoft521.cp.jxc.gui.mainFrame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JToolBar {
	private static Logger LOGGER = LoggerFactory.getLogger(ToolBar.class);

	private ApplicationContext context;

	private MenuBar menuBar = null ;
	
	public ToolBar(ApplicationContext context, MenuBar frameMenuBar){
		super();
		this.context = context;
		this.menuBar = frameMenuBar ;
		initialize();
	}

	private void initialize() {
		setSize(new Dimension(600, 30));
		this.setBackground(Color.cyan);
		setBorder(BorderFactory.createBevelBorder(0));
		add(createToobarButton(menuBar.getJinhuoItem()));
		add(createToobarButton(menuBar.getXiaoshou_danItem()));
		add(createToobarButton(menuBar.getKucun_pandianItem()));
		add(createToobarButton(menuBar.getJiage_tiaozhengItem()));
		add(createToobarButton(menuBar.getShangpin_chaxunItem()));
		add(createToobarButton(menuBar.getShangpin_guanliItem()));
		add(createToobarButton(menuBar.getKehu_guanliItem()));
		add(createToobarButton(menuBar.getGys_guanliItem()));
		add(createToobarButton(menuBar.getExitItem()));
		
		
	}
	
	private JButton createToobarButton(JMenuItem menuItem){
		JButton button = new JButton(menuItem.getText());
		button.setToolTipText(menuItem.getText());
		button.setIcon(menuItem.getIcon());
		button.setFocusable(false);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				menuItem.doClick();
			}
		});
		return button ;
	}
}
