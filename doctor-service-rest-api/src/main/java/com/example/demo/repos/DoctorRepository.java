package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	//@Query(value = "from Doctor where doctorName=:name")  JPQL

	@Query(value = "select * from doctor_july_2023 where department=:dept",nativeQuery = true)
	List<Doctor> getByDept(@Param("dept") String dept);
	
	//List<Doctor> findByDepartment(String dept);   //DSL
	

}
