package com.example.doctorService.controller;

import com.example.doctorService.entity.Doctor;
import com.example.doctorService.entity.DoctorDTO;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DoctorController {

    @PostMapping("/doctors")
    @ResponseBody
    public String createDoctor(@RequestBody DoctorDTO doctor){
        return "New Doctor created";
    }

    @GetMapping("/doctors")
    @ResponseBody
    public List<Doctor> getDoctors(){
        return new ArrayList<Doctor>();
    }

    @GetMapping("/doctors/{id}")
    @ResponseBody
    public Doctor getDoctors(@PathVariable int id){
        return new Doctor();
    }

    @PutMapping("/doctors/{id}")
    @ResponseBody
    public Doctor updateDoctors(@RequestBody DoctorDTO doctor, @PathVariable int id){
        return new Doctor();
    }

    @DeleteMapping("doctors/{id}")
    @ResponseBody
    public String deleteDoctor(@PathVariable int id){
        return "Doctor deleted";
    }

    @GetMapping("/doctors/specialization/{name}")
    @ResponseBody
    public List<Doctor> searchDoctorsBySpecialization(@PathVariable String specialization){
        return new ArrayList<Doctor>();
    }

    @GetMapping("/doctors/department/{departmentId}")
    @ResponseBody
    public List<Doctor> searchDoctorsByDepartment(@PathVariable int departmentID){
        return new ArrayList<Doctor>();
    }



}
