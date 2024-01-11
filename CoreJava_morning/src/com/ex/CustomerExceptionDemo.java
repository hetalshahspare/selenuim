package com.ex;

import java.util.Scanner;

class HetalException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double amount;

	public HetalException(double amount) {
		this.amount = amount;
	}
}

class ATM {
	double balance;

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println(amount + "rs deposited...");
	}

	public void withdrawal(double amount) throws HetalException {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println(amount + "rs withdrawalsuccessfully..");
		} else {
			double needs = amount - balance;
			throw new HetalException(needs);
		}
	}
}

public class CustomerExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM a1 = new ATM();
		System.out.println("Enter amount for deposit");
		double amount = sc.nextDouble();
		a1.deposit(amount);

		System.out.println("Enter amount for withdrawal");
		amount = sc.nextDouble();
		try {
			a1.withdrawal(amount);
		} catch (HetalException e) {
			System.out.println("If you deposit " + e.amount + " rs deposited, then you can withdraw " + amount + "rs");
		}

	}
}
 


