package com.example.demo.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Patient {

	 int patientId;
	 String patientName;
	 int age;
	 long phoneNumber;
	
}
