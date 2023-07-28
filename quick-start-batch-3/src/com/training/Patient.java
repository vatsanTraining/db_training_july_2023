package com.training;

public class Patient {

	private int patientId;
	private String patientName;
	private int age;
	private long phoneNumber;
	
	public Patient() {
		super();
	
	}
	public Patient(int patientId, String patientName, int age, long phoneNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + ", phoneNumber="
				+ phoneNumber + "]";
	}

	
}
