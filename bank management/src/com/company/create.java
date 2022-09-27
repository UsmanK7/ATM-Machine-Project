package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class create implements ActionListener{
	JTextField txt_userid= new JTextField();
	JPasswordField txt_password= new JPasswordField();
	JButton btn_login;
	JFrame frame;
	create(){
	JFrame frame=new JFrame();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();
	ImageIcon img=new ImageIcon("pic3.png");
	JLabel label=new JLabel();
	label.setIcon(img);
	label.setText("Create an Account");
	label.setHorizontalTextPosition(label.CENTER);
	label.setVerticalTextPosition(label.BOTTOM);
	label.setFont(new  	Font("Helvetica",Font.BOLD,20));
	p1.setBounds(0,20,500,150);
	p1.add(label);
	JLabel lbl_userid= new JLabel ("Enter Your Email:  ");
	txt_userid= new JTextField();
	txt_userid.setPreferredSize(new Dimension(250,20));
	JLabel lbl_password= new JLabel ("Enter a Password:");
	txt_password= new JPasswordField();
	txt_password.setPreferredSize(new Dimension(250,20));
	txt_password.setEchoChar('*');
	btn_login = new JButton ("Sign Up");
	btn_login.setBackground(Color.BLUE);
	btn_login.setForeground(Color.WHITE);
	btn_login.addActionListener(this);
	p2.setBounds(0,170,500,30);
	p3.setBounds(0,200,500,30);
	p4.setBounds(0,230,500,40);
	p2.add(lbl_userid);
	p2.add(txt_userid);
	p3.add(lbl_password);
	p3.add(txt_password);
	p4.add(btn_login);
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
			JOptionPane.showMessageDialog(null,"Your Account has been created!","Form",JOptionPane.PLAIN_MESSAGE);
		}
		}
		
	}

