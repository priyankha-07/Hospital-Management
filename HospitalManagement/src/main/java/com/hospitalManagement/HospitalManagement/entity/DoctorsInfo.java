package com.hospitalManagement.HospitalManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctorsinfo")
public class DoctorsInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private  String name;
    private String email;
    private String password;
    private String roles;
}
