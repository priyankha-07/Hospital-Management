package com.hospitalManagement.HospitalManagement.repository;

import com.hospitalManagement.HospitalManagement.entity.DoctorsInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorsInfoRepository extends JpaRepository<DoctorsInfo , Integer> {
    Optional<DoctorsInfo> findByName(String username);

}
