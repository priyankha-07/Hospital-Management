package com.hospitalManagement.HospitalManagement.repository;

import com.hospitalManagement.HospitalManagement.entity.NeuroInterns;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NeuroInternsRepository extends JpaRepository<NeuroInterns, Integer> {
    NeuroInterns findByName(String name);
}
