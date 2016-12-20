package com.faikturan;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements Database_Interface, ActionListener{
	private JLabel logoLbl;
	private JLabel userNameLbl;
	private JLabel passwordLbl;
	private JTextField usernameTf;
	private JPasswordField passwordTf;
	private JButton loginBtn;
	public static String user = "";
	private String password = "";
	
	public Login() {
		super("Login Screen");
		
		//Initialize connection
		ConnectionHelper.DBConnect();
		
		//construct compenents
		userNameLbl = new JLabel("Username:");
		passwordLbl = new JLabel("Password:");
		usernameTf = new JTextField(5);
		passwordTf = new JPasswordField(5);
		loginBtn = new JButton("Login");
		
		//Add logo image to label
		ImageIcon image = new ImageIcon
				("/AirlineSWG/resources/airline.jpg");
		logoLbl = new JLabel("", image, JLabel.CENTER);
		
		//adjust size and set layout
		setSize(450, 250);
		setLayout(null);
		
		//add compenents
		add(userNameLbl);
		add(passwordLbl);
		add(usernameTf);
		add(passwordTf);
		add(loginBtn);
		add(logoLbl);
		
		//set compenent bounds (only needed by Absolute Positioning)
		userNameLbl.setBounds(100, 105, 75, 25);
		passwordLbl.setBounds(100, 135, 75, 25);
		usernameTf.setBounds(170, 105, 130, 25);
		passwordTf.setBounds(170, 135, 130, 25);
		loginBtn.setBounds(170, 170, 100, 25);
		logoLbl.setBounds(60, 10, 300, 75);
		
		//add actionListener to Login Button
		loginBtn.addActionListener(this);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	
	
	public static void main(String[] args) {
		JFrame myLogin = new Login();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialise() {
		// TODO Auto-generated method stub
		
	}

}
