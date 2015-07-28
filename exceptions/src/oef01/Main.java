package oef01;

import exception07.BankException;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("hallo", 100);
		System.out.println(bank);
		try {
			bank.stortGeld(-100);
		} catch (BankException e) {
			e.printStackTrace();
		}
	}

}