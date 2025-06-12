package com.example.doctorService.service;

import com.example.doctorService.entity.Doctor;
import com.example.doctorService.entity.DoctorDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {
    public Doctor creatDoctor(DoctorDTO patient){
        //jpa save - repo.save(patient)
        return new Doctor();
    }

    public List<Doctor> listDoctors(){
        // repo.listDoctors;
        return new ArrayList<>();
    }

    public Doctor getDoctor(int id){
        //patient find by id
        return new Doctor();
    }

    public Doctor updateDoctor(int id, DoctorDTO patient){
        return new Doctor();
    }

    public int deleteDoctor(int id){
        return 0;
    }

    public List<Doctor> searchDoctorsBySpecialization(String name){
        return new ArrayList<Doctor>();
    }

    public List<Doctor> searchDoctorByDepartment(int departmentId){
        return new ArrayList<Doctor>();
    }
}
