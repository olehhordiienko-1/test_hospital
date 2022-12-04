package com.example.hospital.repos;

import com.example.hospital.tables.Appointments;
import org.springframework.data.repository.CrudRepository;



public interface AppointmentsRepo extends CrudRepository<Appointments,Integer> {
}
