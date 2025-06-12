package com.example.doctorService.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorId;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "specialization",nullable = false)
    private String specialization;
    @Column(name = "departmentId",nullable = false)
    private int departmentId;
    @Column(name = "contactInformation",nullable = false)
    private int contactInformation;

}
