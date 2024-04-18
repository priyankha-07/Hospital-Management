package com.hospitalManagement.HospitalManagement.repository;

import com.hospitalManagement.HospitalManagement.entity.NephrologySpecialist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NephrologySpecialistRepository extends JpaRepository <NephrologySpecialist , Integer> {
    NephrologySpecialist findByName(String name);
}
