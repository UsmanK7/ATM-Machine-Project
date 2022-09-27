
	package com.company;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	public class forgot implements ActionListener{
		JTextField txt_userid= new JTextField();
		JButton btn_login;
		JButton btn_cancel;
		JFrame frame;
		forgot(){
		JFrame frame=new JFrame();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		ImageIcon img=new ImageIcon("pic3.png");
		JLabel label=new JLabel();
		label.setIcon(img);
		label.setText("Find Your Account");
		label.setHorizontalTextPosition(label.CENTER);
		label.setVerticalTextPosition(label.BOTTOM);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Helvetica",Font.BOLD,20));
		p1.setBounds(0,20,500,150);
		p1.add(label);
		JLabel lbl_userid= new JLabel ("Enter Your Email:  ");
		txt_userid= new JTextField();
		txt_userid.setPreferredSize(new Dimension(250,20));
		JLabel label2= new JLabel ("Please enter your email address or mobile number to search for your account.");
		label2.setFont(new Font("Helvetica",Font.BOLD,12));
		btn_login = new JButton ("Search");
		btn_cancel = new JButton ("Cancel");
		btn_cancel.setBackground(Color.BLUE);
		btn_cancel.setForeground(Color.WHITE);
		
		btn_login.setBackground(Color.BLUE);
		btn_login.setForeground(Color.WHITE);
		btn_login.addActionListener(this);
		p2.setBounds(0,170,500,30);
		p3.setBounds(0,200,500,30);
		p4.setBounds(0,230,500,40);
		p2.add(label2);
		p3.add(lbl_userid);
		p3.add(txt_userid);
		p4.add(btn_login);
		p4.add(btn_cancel);
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);
		frame.add(p5);
		frame.setSize(500,310);
		frame.setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==btn_login) {
				JOptionPane.showMessageDialog(null,"Please check your emails for a message with your code. Your code is 6 numbers long.","Form",JOptionPane.PLAIN_MESSAGE);
			}
			}
			
		}

