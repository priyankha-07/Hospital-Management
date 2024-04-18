package com.hospitalManagement.HospitalManagement.repository;

import com.hospitalManagement.HospitalManagement.entity.NephroInterns;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NephroInternsRepository extends JpaRepository<NephroInterns ,Integer > {
    NephroInterns findByName(String name);
}
