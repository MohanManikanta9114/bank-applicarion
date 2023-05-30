package com.cisco.client;
import com.cisco.model.*;

public class TestBanking {
	public static void main(String[] args) {
		System.out.println("Welcome to banking APP !");
		
		//create a customer
		Customer customer   = new Customer ( "Bhavya" , "Mani" );
		
		// create a CheckingBalance with initial balance of 500.00
		CheckingAccount checkingAccount = new CheckingAccount( 500.00 , 50);
		
		customer.setAccount(checkingAccount);
		
		Account account;
		
		account = customer.getAccount();
		
		account.deposit(200.00);
		account.withdraw(150.00);
		
		System.out.println(" Customer [" + customer.getLastName() + " , " + customer.getFirstName() + " ]");
		System.out.println("Final Balance in Checking Account : "+account.getBalance());
		
		SavingsAccount savingsAccount = new SavingsAccount(500.00,3.0);
		customer.setAccount(savingsAccount);
		
		account = customer.getAccount();
		account.deposit(200.00);
		savingsAccount.addInterestRate();
		System.out.println(" Customer [" + customer.getLastName() + " , " + customer.getFirstName() + " ]");
		System.out.println("Final Balance in Savings Account : "+account.getBalance());

		
	}
}
