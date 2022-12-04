package com.example.hospital.repos;

import com.example.hospital.tables.Doctors;
import org.springframework.data.repository.CrudRepository;

public interface DoctorsRepo extends CrudRepository<Doctors,Integer> {
}
