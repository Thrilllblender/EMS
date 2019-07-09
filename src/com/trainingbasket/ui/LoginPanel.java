package com.trainingbasket.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JTextArea;

public class LoginPanel {

	private JFrame frame;
	private JTextField txtUserName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPanel window = new LoginPanel();
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
	public LoginPanel() {
		initialize();
	}

	String data = "";

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(93, 78, 89, 14);
		panel.add(lblUserName);

		txtUserName = new JTextField();
		txtUserName.setBounds(192, 75, 86, 20);
		panel.add(txtUserName);
		txtUserName.setColumns(10);
		Deque<String> deque = new LinkedList<String>();

		JButton btnAddHead = new JButton("AddHead");
		btnAddHead.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				data="";
				deque.add(txtUserName.getText());
				for (String string : deque) {
					data += string + "\n";
					textArea.setText(data);
				}

				/*
				 * if (txtUserName.getText().equals("admin") &&
				 * (txtPassword.getText().equals("123"))) {
				 * JOptionPane.showMessageDialog(btnLogin, "Yes Logged in"); } else {
				 * JOptionPane.showMessageDialog(btnLogin, "NO not  Logged in","Error",0); }
				 */

			}
		});
		btnAddHead.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

			}
		});
		btnAddHead.setBackground(new Color(0, 128, 0));
		btnAddHead.setBounds(202, 155, 89, 23);
		panel.add(btnAddHead);

		JButton btnAddTail = new JButton("AddTail");
		btnAddTail.setBackground(new Color(255, 69, 0));
		btnAddTail.setBounds(93, 155, 89, 23);
		panel.add(btnAddTail);

		textArea.setBounds(311, 11, 113, 239);
		panel.add(textArea);
	}

	JTextArea textArea = new JTextArea();
}
