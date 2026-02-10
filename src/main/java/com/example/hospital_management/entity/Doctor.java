package com.example.hospital_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long doctorId;

	    private String doctorName;
	    private String specialization;

	    public Long getDoctorId() {
	        return doctorId;
	    }

	    public void setDoctorId(Long doctorId) {
	        this.doctorId = doctorId;
	    }

	    public String getDoctorName() {
	        return doctorName;
	    }

	    public void setDoctorName(String doctorName) {
	        this.doctorName = doctorName;
	    }

	    public String getSpecialization() {
	        return specialization;
	    }

	    public void setSpecialization(String specialization) {
	        this.specialization = specialization;
	    }

}
