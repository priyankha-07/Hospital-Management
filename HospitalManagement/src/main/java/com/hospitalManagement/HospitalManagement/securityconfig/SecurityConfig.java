package com.hospitalManagement.HospitalManagement.securityconfig;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;import org.springframework.http.HttpMethod;import org.springframework.http.HttpStatus;import org.springframework.security.authentication.AuthenticationProvider;import org.springframework.security.authentication.dao.DaoAuthenticationProvider;import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;import org.springframework.security.config.annotation.web.builders.HttpSecurity;import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;import org.springframework.security.core.userdetails.User;import org.springframework.security.core.userdetails.UserDetails;import org.springframework.security.core.userdetails.UserDetailsService;import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;import org.springframework.security.crypto.password.PasswordEncoder;import org.springframework.security.provisioning.InMemoryUserDetailsManager;import org.springframework.security.web.SecurityFilterChain;import java.util.ArrayList;import java.util.List;import static org.springframework.security.authorization.AuthenticatedAuthorizationManager.authenticated;@Configuration@EnableWebSecurity@EnableMethodSecuritypublic class SecurityConfig {    @Bean    public UserDetailsService userDetailsService() {//        List<UserDetails> users = new ArrayList<>();////        UserDetails admin1 = User//                .withUsername("jacob")//                .password(encoder.encode("jacob@123"))//                .roles("ADMIN")//                .build();////        UserDetails admin2 = User//                .withUsername("suba")//                .password(encoder.encode("suba@123"))//                .roles("ADMIN")//                .build();////        UserDetails cardioHead1 = User//                .withUsername("shalin")//                .password(encoder.encode("shalin@123"))//                .roles("USER")//                .build();//        UserDetails cardioHead2 = User//                .withUsername("bala")//                .password(encoder.encode("bala@123"))//                .roles("cardiohead")//                .build();////        UserDetails neuroHead1 = User//                .withUsername("sunil")//                .password(encoder.encode("sunil@123"))//                .roles("neurohead")//                .build();        // Add more users as needed for other roles//        users.add(admin1);//        users.add(admin2);//        users.add(cardioHead1);//        users.add(cardioHead2);//       // users.add(cardioIntern2);//        users.add(neuroHead1);       // return new InMemoryUserDetailsManager(admin1,admin2, cardioHead1);        return  new DoctorsInfoDoctorDetailsService();    }//    @Bean//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {//        return http.csrf().disable()//                .httpBasic()//                .and()//                .authorizeHttpRequests()//               // .requestMatchers(HttpMethod.POST, "/hospital/admin/**").hasRole("ADMIN")//               // .requestMatchers(HttpMethod.PUT, "/hospital/update/**").authenticated()//                .requestMatchers(HttpMethod.DELETE, "/hospital/delete/**").permitAll()//              //  .requestMatchers(HttpMethod.GET, "/hospital/display/**").hasAnyRole("ADMIN", "HEAD","INTERN")//                .anyRequest().authenticated()//                .and()//                .formLogin().and().build();//    }//    @Bean//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {//        http.csrf().disable()//                .httpBasic()//                .and()//                // .authorizeRequests(authorize -> authorize//                 .authorizeHttpRequests().requestMatchers(HttpMethod.POST, "/hospital/admin/add/*").hasRole("ADMIN")////                //.requestMatchers("/admin/*").hasRole("ADMIN")// Restrict access to /admin/* to users with role ADMIN//                .requestMatchers(HttpMethod.GET, "/user/*").hasRole("USER") // Allow only GET requests for /user/* to users with role USER//               // .requestMatchers("//Welcome").permitAll()//                .anyRequest().authenticated()//                .and()//                .formLogin(); // Use form-based login////        return http.build();//    }@Beanpublic SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {    return  http.csrf().disable()            .httpBasic()            .and()            .authorizeHttpRequests(authorize -> authorize                   // .requestMatchers(HttpMethod.POST, "/hospital/admin/add/**").hasRole("ADMIN")                    //.requestMatchers( "/hospital/deleteCardioHead").permitAll()                    .requestMatchers( "/hospital/Welcome","/hospital/addDoctorsInfo").permitAll()                    .requestMatchers( HttpMethod.GET,"/hospital/display/**").hasAnyRole("ADMIN","CARDIOHEAD","CARDIOINTERN")                            .requestMatchers( HttpMethod.POST,"/hospital/add/**").hasRole("ADMIN")                    // .anyRequest().authenticated()            )            .formLogin()            .and()            .build();}    @Bean    public PasswordEncoder passwordEncoder() {        return new BCryptPasswordEncoder();    }     @Bean    public AuthenticationProvider authenticationProvider(){      DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();      authenticationProvider.setUserDetailsService(userDetailsService());      authenticationProvider.setPasswordEncoder(passwordEncoder());      return authenticationProvider;}}