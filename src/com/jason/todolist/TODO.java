package com.jason.todolist;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollBar;
import org.jb2011.lnf.beautyeye.resources.beautyeye;
import javax.swing.JPanel;

public class TODO {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//引入外部样式文件
		
		try
	    {
			System.setProperty("sun.java2d.noddraw", "true");
	        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
	    }
	    catch(Exception e)
	    {
	        //TODO exception
	    }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TODO window = new TODO();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TODO() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u5C0F\u6E05\u5355");
		label.setFont(new Font("宋体", Font.BOLD, 17));
		label.setBounds(166, 0, 72, 18);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(14, 29, 255, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(305, 28, 72, 27);
		frame.getContentPane().add(btnNewButton);
		
		DefaultListModel<String> listM = new DefaultListModel<String>();
		
		JList list = new JList(listM);
		list.setBounds(14, 84, 255, 158);
		frame.getContentPane().add(list);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 432, 255);
		frame.getContentPane().add(panel);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String tmp = textField.getText();
				listM.addElement(tmp);
			}
		});
		
	}
}
