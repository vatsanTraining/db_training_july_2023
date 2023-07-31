package com.training.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "doctor_july_2023")
@Entity
public class Doctor  {

	@Id
	@Column(name="doctor_id")
	private int doctorId;

	@Column(name="doctor_name",length = 45)
	private String doctorName;
	
	@Column(name = "department", length=45)
	private String department;
	
	@Column(name = "phone_number")
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
