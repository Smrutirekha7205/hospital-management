# Hospital Management System – Spring Boot REST API

This is a backend REST API project developed using Spring Boot, Spring Data JPA, and PostgreSQL.
It manages Doctors and Patients with full CRUD operations.

## Features

Add, update, view, and delete Doctors

Add, update, view, and delete Patients

Each Patient is referred to a Doctor

RESTful APIs tested using Postman

Database integration with PostgreSQL

## Technologies Used

Java

Spring Boot

Spring Data JPA

PostgreSQL

Maven

Postman
## Project Structure
com.example.hospital
 ├── com.example.hospital.entity
 │     ├── Doctor.java
 │     └── Patient.java
 ├── com.example.hospital.repository
 │     ├── DoctorRepository.java
 │     └── PatientRepository.java
 ├── com.example.hospital.controller
 │     └── HospitalController.java
 └── HospitalManagementApplication.java
 
## DATABASE CONFIGURATION
spring.datasource.url=jdbc:postgresql://localhost:5432/hospitaldb
spring.datasource.username=postgres
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

## REST API Endpoints
### Doctor APIs

POST /hospital/doctor – Create a new doctor

GET /hospital/doctors – Retrieve all doctors

GET /hospital/doctor/{id} – Retrieve doctor by ID

PUT /hospital/doctor/{id} – Update doctor details

DELETE /hospital/doctor/{id} – Delete doctor

### Patient APIs

POST /hospital/patient/{doctorId} – Create a new patient and assign doctor

GET /hospital/patients – Retrieve all patients

GET /hospital/patient/{id} – Retrieve patient by ID

PUT /hospital/patient/{id} – Update patient details

DELETE /hospital/patient/{id} – Delete patient

## Sample Request Payloads
### Add Doctor
{
  "doctorName": "Dr. Anita Sharma",
  "specialization": "Dermatologist"
}
### Add Patient
{
  "patientName": "Rohit Verma",
  "age": 35,
  "disease": "Skin Allergy"
}
## How to Run the Project

1. Clone the repository from GitHub

2. Import the project into Eclipse as a Maven Project

3. Configure PostgreSQL credentials in application.properties

4. Run the main class HospitalManagementApplication.java

5. Test the APIs using Postman

## Key Learning Outcomes

- Developed RESTful APIs using Spring Boot

- Implemented CRUD operations with Spring Data JPA

- Established entity relationships (Many-to-One)

- Integrated PostgreSQL database

- Tested APIs using Postman

- Version control using Git and GitHub

## Author
### Smrutirekha Behera
Java Backend Developer

