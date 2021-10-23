package com.slokam.pojo;

import java.util.List;

public class Employee {

	private int empId;
	private String empName;
	private String empEmail;
	private String gender;
	private String empDesg;
	private Account salAccount;

	private List<Mobiles> empMoblies;

	public Employee(int empId, String empName, String empEmail, String gender, String empDesg, Account salAccount,
			List<Mobiles> empMobiles) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.gender = gender;
		this.empDesg = empDesg;
		this.salAccount = salAccount;
		this.empMoblies = empMobiles;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public String getGender() {
		return gender;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public Account getSalAccount() {
		return salAccount;
	}

	public List<Mobiles> getEmpMobiles() {
		return empMoblies;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", gender=" + gender
				+ ", empDesg=" + empDesg + ", salAccount=" + salAccount + ", empMobiles=" + empMoblies + "]";
	}

}
