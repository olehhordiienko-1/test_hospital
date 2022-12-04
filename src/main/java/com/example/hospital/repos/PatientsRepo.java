package com.example.hospital.repos;

import com.example.hospital.tables.Patients;
import org.springframework.data.repository.CrudRepository;



public interface PatientsRepo extends CrudRepository<Patients,Integer> {
}
