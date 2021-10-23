package com.slokam.pojo;

public class Mobiles {
	private long mobileNo;
	private String netWork;
	public Mobiles(long mobileNo, String netWork) {
		super();
		this.mobileNo = mobileNo;
		this.netWork = netWork;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public String getNetWork() {
		return netWork;
	}
	@Override
	public String toString() {
		return "Mobiles [mobileNo=" + mobileNo + ", netWork=" + netWork + "]";
	}
	

}
