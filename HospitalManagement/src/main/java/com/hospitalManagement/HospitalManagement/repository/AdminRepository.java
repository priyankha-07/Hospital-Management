package com.hospitalManagement.HospitalManagement.repository;

import com.hospitalManagement.HospitalManagement.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin , Integer> {
    Admin findByName(String name);
}
