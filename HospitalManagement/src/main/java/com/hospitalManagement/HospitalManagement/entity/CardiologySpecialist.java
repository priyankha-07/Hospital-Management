package com.hospitalManagement.HospitalManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cardiohead")
public class CardiologySpecialist {
    @Id
    @GeneratedValue
   private int id;
   private String name;
   private String email;
   private double sal;
   private String roles;
}
