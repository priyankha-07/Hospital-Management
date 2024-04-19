package com.hospitalManagement.HospitalManagement.securityconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        List<UserDetails> users = new ArrayList<>();

        UserDetails admin1 = User
                .withUsername("jacob")
                .password(encoder.encode("jacob@123"))
                .roles("admin")
                .build();

        UserDetails admin2 = User
                .withUsername("suba")
                .password(encoder.encode("suba@123"))
                .roles("admin")
                .build();

        UserDetails cardioHead1 = User
                .withUsername("shalin")
                .password(encoder.encode("shalin@123"))
                .roles("cardiohead")
                .build();

        UserDetails cardioHead2 = User
                .withUsername("bala")
                .password(encoder.encode("bala@123"))
                .roles("cardiohead")
                .build();
        //UserDetails cardioIntern1 = User
             //   .withUsername("madhan")
             //   .password(encoder.encode("madhan@123"))
             //   .roles("cardiointern")
             //   .build();
//        UserDetails cardioIntern2 = User
//                .withUsername("mani")
//                .password(encoder.encode("mani@123"))
//                .roles("cardiointern")
//                .build();
        UserDetails neuroHead1 = User
                .withUsername("sunil")
                .password(encoder.encode("sunil@123"))
                .roles("neurohead")
                .authorities("neurohead")
                .build();


        // Add more users as needed for other roles

        users.add(admin1);
        users.add(admin2);
        users.add(cardioHead1);
        users.add(cardioHead2);
       // users.add(cardioIntern2);
        users.add(neuroHead1);


        return new InMemoryUserDetailsManager(users);
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .httpBasic()
                .and()
                 .authorizeHttpRequests().requestMatchers(HttpMethod.POST, "/admin/*").authenticated()
                .requestMatchers(HttpMethod.GET, "/displayAllHeadsOfCardio").hasAuthority("cardiohead ,admin")// Allow only GET requests for /user/* to users with role USER
                .requestMatchers(HttpMethod.GET, "/displayAllHeadsOfNeuro").hasAuthority("neurohead") // Allow only GET requests for /user/* to users with role USER
                .anyRequest().authenticated()
                .and()
                .formLogin(); // Use form-based login

        return http.build();
    }



    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}