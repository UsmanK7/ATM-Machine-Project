package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginFrame implements ActionListener{
	JButton btn_login;
	JButton btn_forgot;
	JButton btn_create;
	JButton btn_exit;
	JTextField txt_userid;
	JPasswordField txt_password;
	Dialog d;
	Login obj;
	JLabel lbl_result;
	LoginFrame(){
		JFrame frame=new JFrame();
		frame.setTitle("Bank Management System");
		obj=new Login();
		JPanel p1_blue=new JPanel();
		JPanel p1_blue1=new JPanel();
		JPanel p1_blue2=new JPanel();
		JPanel p1_blue3=new JPanel();
		JPanel p1_blue4=new JPanel();
		JPanel p2_yellow=new JPanel();
		JPanel p3_green=new JPanel();
		JPanel p4_grey=new JPanel();
		JPanel p3_green2=new JPanel();
		p1_blue1.setBackground(Color.blue);
		p1_blue2.setBackground(Color.blue);
		p1_blue3.setBackground(Color.blue);
		p1_blue4.setBackground(Color.blue);
		p1_blue.setBackground(Color.blue);
		ImageIcon img=new ImageIcon("pic1.png");
		ImageIcon img2=new ImageIcon("pic2.png");
		JLabel label=new JLabel("UAH Bank");
		JLabel label2=new JLabel("Pakistan's No1 Banking System");
		JLabel label3=new JLabel("WELCOME");
		label.setHorizontalTextPosition(label.CENTER);
		label.setVerticalTextPosition(label.BOTTOM);
		label3.setHorizontalTextPosition(label3.CENTER);
		label3.setVerticalTextPosition(label3.BOTTOM);
		label.setForeground(Color.WHITE);
		label2.setForeground(Color.WHITE);
		label3.setForeground(Color.BLUE);
		label.setFont(new Font("Helvetica",Font.BOLD,20));
		label3.setFont(new Font("Helvetica",Font.BOLD,20));
		label.setIcon(img);
		label3.setIcon(img2);
		p1_blue.add(label);
		p1_blue.add(label2);
		p2_yellow.add(label3);
		
		JLabel lbl_userid= new JLabel   ("Enter Username:");
		txt_userid= new JTextField();
		txt_userid.setPreferredSize(new Dimension(200,30));
		JLabel lbl_password= new JLabel ("Enter Password:");
		txt_password= new JPasswordField();
		txt_password.setPreferredSize(new Dimension(200,30));
		txt_password.setEchoChar('*');
		lbl_result=new JLabel();
		p3_green.add(lbl_userid);
		p3_green.add(txt_userid);
		p3_green2.add(lbl_password);
		p3_green2.add(txt_password);
		btn_login = new JButton ("Sign In");
		btn_login.setBackground(Color.BLUE);
		btn_login.setForeground(Color.WHITE);
		btn_login.addActionListener(this);
		btn_create=new JButton("Create Account");
		btn_create.setBackground(Color.BLUE);
		btn_create.setForeground(Color.WHITE);
		btn_create.setFocusable(false);
		btn_create.addActionListener(this);
		btn_forgot=new JButton("Forgot Password");
		btn_forgot.setFocusable(false);
		btn_forgot.setBackground(Color.BLUE);
		btn_forgot.setForeground(Color.WHITE);
		btn_forgot.addActionListener(this);
		btn_exit=new JButton("Exit");
		btn_exit.setFocusable(false);
		btn_exit.setBackground(Color.BLUE);
		btn_exit.setForeground(Color.WHITE);
		btn_exit.addActionListener(this);
		p4_grey.setLayout(new FlowLayout(FlowLayout.CENTER));
		p4_grey.add(lbl_result);
		p4_grey.add(btn_login);
		p1_blue1.add(btn_create);
		p1_blue2.add(btn_forgot);
		p1_blue3.add(btn_exit);
		
		
		p1_blue.setBounds(0,0,200,200);  //461
		p1_blue1.setBounds(0,200,200,50);
		p1_blue2.setBounds(0,250,200,50);
		p1_blue3.setBounds(0,300,200,50);
		p1_blue4.setBounds(0,350,200,115);
		p2_yellow.setBounds(200,40,500,150);
		
		p3_green.setBounds(200,190,500,50);
		p3_green2.setBounds(200,240,500,50);
		p4_grey.setBounds(200,290,500,50);
		frame.add(p3_green2);
		frame.add(p4_grey);
		frame.add(p2_yellow);
		frame.add(p1_blue);
		frame.add(p1_blue1);
		frame.add(p1_blue2);
		frame.add(p1_blue3);
		frame.add(p1_blue4);
		frame.add(p3_green);
		frame.setLayout(null);
		frame.setSize(700,500);
		frame.setTitle("Bank Management System");
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn_login) {
			char p[]= txt_password.getPassword();
			String password = new String (p);
			String userid= txt_userid.getText();
			boolean result= obj.validate(userid, password);
			if (result)
			{
			lbl_result.setForeground(Color.GREEN);
			lbl_result.setText("Login Successful.");
			dashboard d=new dashboard();
			}
			else {
				lbl_result.setForeground(Color.RED);
				lbl_result.setText("Invalid username or password.");
				}
				}
		if (e.getSource()==btn_create) {
			create c=new create();
			
		}
		if (e.getSource()==btn_forgot) {
			forgot f=new forgot();
		}
		if (e.getSource()==btn_exit) {
			System.exit(0);
		}
		
		
		}
	}

