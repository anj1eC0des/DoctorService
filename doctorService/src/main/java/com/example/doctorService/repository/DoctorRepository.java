package com.example.doctorService.repository;


import com.example.doctorService.entity.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor ,Integer> {
    //add custom queries for querying by department and specialisation
    //check how to sync ids while using different dbs
}
