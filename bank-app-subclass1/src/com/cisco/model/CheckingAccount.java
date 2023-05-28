package com.cisco.model;

public class CheckingAccount extends Account {

	private double overdraft_limit;

	
	public CheckingAccount(double initialBalance , double overdraft_limit) {
		super(initialBalance);
		this.overdraft_limit=overdraft_limit;
	}
	@Override		
	public void withdraw( double amount) {
		
		if ( amount <= 0 ) {
			System.out.println("Amount to be withdrawn should be positive");
		}else if ( getBalance() - amount < -overdraft_limit ) {
			System.out.println("Withdrawl should be exceed your overdraft limit ");
			
		}else {
			double newBalance = getBalance() - amount;
			setBalance( newBalance );
		}
		
	}
	@Override	
	public boolean isSufficientBalance( double amount ) {
		return getBalance() + overdraft_limit >= amount;
	}
}