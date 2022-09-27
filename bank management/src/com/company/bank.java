package com.company;


public class bank {
	double balance;
	public void deposit(double amt)
    {
   	 balance = balance + amt;
   	 System.out.println("Amount Deposited.");
    }
    
    public void withdraw(double amt) throws BankAccountException
    {
   	 try
   	 { 
   	    if(balance >= amt)
   	    {
   		    balance = balance - amt;
       	    System.out.println("Amount Withdrawn");
   	    }
   	    else
   	    {
   		    throw new BankAccountException("Could not Withdraw: Insufficent Amount.");
   	    }
   	 }
   	 catch(BankAccountException bae)
   	 {
             bae.printStackTrace();
        }
    }
    
    public void printBalance()
    {
   	 System.out.println("Current balance: " + balance);    	 
    }
    public double getBalance()
    {
        return balance;
    }
}
