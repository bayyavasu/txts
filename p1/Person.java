package com.slokam.hasa;

public class Person {
	private Passport passport;

	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(Passport passport) {
		super();
		this.passport = passport;
	}

	public Passport getPassport() {
		return passport;
	}
	@Override
	public String toString() {
		return "Person [passport=" + passport + "]";
	}

}
