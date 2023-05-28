package com.cisco.client;
import com.cisco.model.*;

public class TestBanking {
	public static void main(String[] args) {
		System.out.println("Welcome to banking Application !");
		
		Account account;
		account= new Account(500);
		
		account.balance=500.00;
		
		account.deposit(1000);
		
		account.withdraw(2000.00);
		
		System.out.println("The final balance is: "+ account.balance);
	}
}
