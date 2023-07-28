package com.training;

import java.util.Objects;

public class Patient implements Comparable<Patient> {

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
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, patientId, patientName, phoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return age == other.age && patientId == other.patientId && Objects.equals(patientName, other.patientName)
				&& phoneNumber == other.phoneNumber;
	}
	@Override
	public int compareTo(Patient o) {

		return patientName.compareTo(o.patientName);
	}

	
}
