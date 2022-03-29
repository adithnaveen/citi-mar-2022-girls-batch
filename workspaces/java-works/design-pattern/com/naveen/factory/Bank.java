package com.naveen.factory;

public abstract class Bank {

	public static Bank getBankAccount(Types type) {
		if (type == Types.SB) {
			return new SBAccount();
		} else if (type == Types.CA) {
			return new CAAccount();
		} else if (type == Types.RD) {
			return new RDAccount();
		}

		return null;
	}

	public abstract void transaction();

}

class SBAccount extends Bank {
	public SBAccount() {
		System.out.println("Creating sb account");
	}

	@Override
	public void transaction() {
		System.out.println("You are transacting in SB ");
	}

}

class CAAccount extends Bank {
	public CAAccount() {
		System.out.println("Creating CA Account");
	}

	@Override
	public void transaction() {
		System.out.println("You are transacting in CA ");
	}

}

class RDAccount extends Bank {
	public RDAccount() {
		System.out.println("Creating RD Account");
	}

	@Override
	public void transaction() {
		System.out.println("You are transacting in RD ");
	}

}