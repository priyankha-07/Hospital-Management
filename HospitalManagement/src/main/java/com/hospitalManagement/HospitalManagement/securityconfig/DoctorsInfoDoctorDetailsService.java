package com.hospitalManagement.HospitalManagement.securityconfig;

import com.hospitalManagement.HospitalManagement.entity.DoctorsInfo;
import com.hospitalManagement.HospitalManagement.repository.DoctorsInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DoctorsInfoDoctorDetailsService implements UserDetailsService {

    @Autowired
    private DoctorsInfoRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
     Optional<DoctorsInfo> doctorsInfo =repository.findByName(username);
    return doctorsInfo.map(DoctorsInfoDoctorDetails :: new)
             .orElseThrow(()->new UsernameNotFoundException("user not found"+ username));

    }
}
