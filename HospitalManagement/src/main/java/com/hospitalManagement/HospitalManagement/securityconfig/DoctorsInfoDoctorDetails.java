package com.hospitalManagement.HospitalManagement.securityconfig;

import com.hospitalManagement.HospitalManagement.entity.DoctorsInfo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DoctorsInfoDoctorDetails implements UserDetails {

    private String name;
    private String password;
    private List <GrantedAuthority>authorities;


    public DoctorsInfoDoctorDetails(DoctorsInfo doctorsInfo) {
        name= doctorsInfo.getName();
        password=doctorsInfo.getPassword();
        authorities= Arrays.stream(doctorsInfo.getRoles() .split(" ,"))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
