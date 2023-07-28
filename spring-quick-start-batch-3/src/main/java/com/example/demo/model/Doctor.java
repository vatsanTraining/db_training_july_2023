package com.example.demo.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Doctor {

	private int doctorId;
	private String doctorName;
	private String department;
	private long phoneNumber;

}
