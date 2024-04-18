package com.hospitalManagement.HospitalManagement.repository;

import com.hospitalManagement.HospitalManagement.entity.NeurologySpecialist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NeurologySpecialistRepository extends JpaRepository < NeurologySpecialist, Integer > {
    NeurologySpecialist findByName(String name);
}
