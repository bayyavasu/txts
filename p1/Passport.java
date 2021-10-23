package com.slokam.hasa;

public class Passport {
	private Adhhar adhaar;

	public Passport(Adhhar adhaar) {
		super();
		this.adhaar = adhaar;
	}

	public Adhhar getAdhaar() {
		return adhaar;
	}

	@Override
	public String toString() {
		return "Passport [adhaar=" + adhaar + "]";
	}

}
