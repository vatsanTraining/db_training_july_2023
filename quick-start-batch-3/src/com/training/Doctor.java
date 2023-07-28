package com.training;

public class Doctor  {

	private int doctorId;
	private String doctorName;
	private String department;
	private long phoneNumber;

	public Doctor() {
		super();
	}
	public Doctor(int doctorId, String doctorName, String department, long phoneNumber) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.department = department;
		this.phoneNumber = phoneNumber;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	@Override
	public String toString() {
		return this.doctorName + ","+this.department+"," +this.phoneNumber;
	}

	
}
