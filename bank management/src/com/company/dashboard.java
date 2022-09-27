package com.company;
import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class dashboard implements ActionListener{
	JFrame frame;
	JButton b1_check;
	JButton	b2_withdraw;
	JButton b3_deposit;
	JButton b4_logout;
	bank acc=new bank();
	dashboard(){
		JFrame frame=new JFrame();
		JPanel p1_blue=new JPanel();
		JPanel p2_yellow=new JPanel();
		JPanel p3_green=new JPanel();
		p1_blue.setBackground(Color.blue);
		p1_blue.setBounds(0,0,200,461);
		p2_yellow.setBounds(200,40,500,150);
		p3_green.setBounds(200,190,500,50);
		b1_check=new JButton("Check Balance");
		b1_check.setBackground(Color.BLUE);
		b1_check.setForeground(Color.WHITE);
		b1_check.setFocusable(false);
		b1_check.setLayout(new FlowLayout(FlowLayout.LEFT));
		b1_check.addActionListener(this);
		b2_withdraw=new JButton("Withdraw Money");
		b2_withdraw.setBackground(Color.BLUE);
		b2_withdraw.setForeground(Color.WHITE);
		b2_withdraw.setFocusable(false);
		b2_withdraw.addActionListener(this);
		b2_withdraw.setLayout(new FlowLayout(FlowLayout.CENTER));
		b3_deposit=new JButton("Deposit Money");
		b3_deposit.setBackground(Color.BLUE);
		b3_deposit.setForeground(Color.WHITE);
		b3_deposit.setFocusable(false);
		b3_deposit.addActionListener(this);
		
		b3_deposit.setLayout(new FlowLayout(FlowLayout.RIGHT));
		b4_logout=new JButton("Log out");
		b4_logout.setBackground(Color.BLUE);
		b4_logout.setForeground(Color.WHITE);
		b4_logout.setFocusable(false);
		b4_logout.addActionListener(this);
		ImageIcon img=new ImageIcon("pic1.png");
		ImageIcon img2=new ImageIcon("pic2.png");
		JLabel label=new JLabel("UAH Bank");
		JLabel label2=new JLabel("Pakistan's No1 Banking System");
		JLabel label3=new JLabel("WELCOME TO YOUR DASHBOARD");
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
		p1_blue.add(b4_logout);
		p2_yellow.add(label3);
		p3_green.add(b1_check);
		p3_green.add(b2_withdraw);
		p3_green.add(b3_deposit);
		frame.add(p2_yellow);
		frame.add(p3_green);
		frame.setTitle("Dashboard");
		frame.setSize(700,500);
		frame.add(p1_blue);
		frame.setLayout(null);
		frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b3_deposit) {
			try
	        {
	           String num;
	           num = JOptionPane.showInputDialog(null, "Enter a Value To Deposit:", "Deposit Amount", 1);
	           double num1 = Double.parseDouble(num);
	           acc.deposit(num1);
	        }
	        catch(NumberFormatException | NullPointerException nfe1)
	        {
	            JOptionPane.showMessageDialog(null, nfe1, "Error", 2);
	        }
	    }
			  
		if(e.getSource()==b2_withdraw) {
			try
	           {
	               String num;
	               num = JOptionPane.showInputDialog(null, "Enter a Amount To Withdraw:", "Withdraw Amount", 1);
	               double num1 = Double.parseDouble(num);
	               acc.withdraw(num1);
	           }
	           catch(BankAccountException | NumberFormatException | NullPointerException ex)
	           {
	               JOptionPane.showMessageDialog(null, ex, "Error", 2);
	           }
		  
		}
		if(e.getSource()==b1_check) {
			try
		       {
		         double num = acc.getBalance();
		         JOptionPane.showMessageDialog(null, "Current Balance: " + num, "Current Balance", 1);
		       }
		       catch(NullPointerException npe)
		       {
		           JOptionPane.showMessageDialog(null, npe, "Error", 2);
		       }
		    }
		if(e.getSource()==b4_logout) {
			System.exit(0);
		}
			
		
	}
}

