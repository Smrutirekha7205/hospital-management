package com.example.hospital_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital_management.entity.Doctor;
import com.example.hospital_management.entity.Patient;
import com.example.hospital_management.repository.DoctorRepository;
import com.example.hospital_management.repository.PatientRepository;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	@Autowired
    private DoctorRepository doctorRepo;

    @Autowired
    private PatientRepository patientRepo;

    // Add Doctor
    @PostMapping("/doctor")
    public Doctor saveDoctor(@RequestBody Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    // Get all Doctors
    @GetMapping("/doctors")
    public List<Doctor> getDoctors() {
        return doctorRepo.findAll();
    }
    @GetMapping("/doctor/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        return doctorRepo.findById(id).orElse(null);
    }

    // Update Doctor
    @PutMapping("/doctor/{id}")
    public Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor) {
        Doctor d = doctorRepo.findById(id).orElse(null);
        if (d != null) {
            d.setDoctorName(doctor.getDoctorName());
            d.setSpecialization(doctor.getSpecialization());
            return doctorRepo.save(d);
        }
        return null;
    }

    // Delete Doctor
    @DeleteMapping("/doctor/{id}")
    public String deleteDoctor(@PathVariable Long id) {
        doctorRepo.deleteById(id);
        return "Doctor deleted with id " + id;
    }


    // Add Patient with Doctor
    @PostMapping("/patient/{doctorId}")
    public Patient savePatient(@PathVariable Long doctorId, @RequestBody Patient patient) {
        Doctor doctor = doctorRepo.findById(doctorId).orElse(null);
        patient.setDoctor(doctor);
        return patientRepo.save(patient);
    }

    // Get all Patients
    @GetMapping("/patients")
    public List<Patient> getPatients() {
        return patientRepo.findAll();
    }
    @GetMapping("/patient/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientRepo.findById(id).orElse(null);
    }

    // Update Patient
    @PutMapping("/patient/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
        Patient p = patientRepo.findById(id).orElse(null);
        if (p != null) {
            p.setPatientName(patient.getPatientName());
            p.setAge(patient.getAge());
            p.setDisease(patient.getDisease());
            return patientRepo.save(p);
        }
        return null;
    }

    // Delete Patient
    @DeleteMapping("/patient/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientRepo.deleteById(id);
        return "Patient deleted with id " + id;
    }

}
