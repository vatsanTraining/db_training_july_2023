package com.example.utils;

import com.example.stereotypes.Table;
import com.training.entity.Doctor;

public class AnnotationProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Doctor doc =new Doctor();
		 
		 Class<?> cls = doc.getClass();
		 
		Table annoRef = cls.getAnnotation(Table.class);
		
		System.out.println(annoRef.name());
		    
	}

}
