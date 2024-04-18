package com.hospitalManagement.HospitalManagement.repository;

import com.hospitalManagement.HospitalManagement.entity.CardioInterns;
import com.hospitalManagement.HospitalManagement.entity.CardiologySpecialist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardioInternsRepository extends JpaRepository<CardioInterns ,Integer > {
    CardioInterns findByName(String name);
}
