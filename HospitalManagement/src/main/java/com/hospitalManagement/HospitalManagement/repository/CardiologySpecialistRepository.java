package com.hospitalManagement.HospitalManagement.repository;

import com.hospitalManagement.HospitalManagement.entity.Admin;
import com.hospitalManagement.HospitalManagement.entity.CardiologySpecialist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardiologySpecialistRepository extends JpaRepository<CardiologySpecialist ,Integer > {

    CardiologySpecialist findByName(String name);
}
