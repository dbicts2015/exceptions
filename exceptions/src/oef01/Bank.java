package oef01;

import exception07.BankException;

public class Bank {

	private String naam;
	private double saldo;

	public Bank(String naam, double saldo) {
		this.naam = naam;
		this.saldo = saldo;
	}

	public void stortGeld(double bedrag) throws BankException {
		if (bedrag < 0) {
			throw new BankException("negatief bedrag");
		}
		saldo += bedrag;
	}

	public void haalGeldAf(double bedrag) throws BankException {
		if (bedrag < 0) {
			throw new BankException("negatief bedrag");
		}
		saldo -= bedrag;
	}

	@Override
	public String toString() {
		return "Bank [naam=" + naam + ", saldo=" + saldo + "]";
	}

}