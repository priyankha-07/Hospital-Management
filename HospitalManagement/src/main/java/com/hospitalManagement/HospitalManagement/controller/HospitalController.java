package com.hospitalManagement.HospitalManagement.controller;

import com.hospitalManagement.HospitalManagement.entity.*;
import com.hospitalManagement.HospitalManagement.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private HospitalService service;

    @PostMapping("/add/DoctorsInfo")
    public  String addDetailsOfDoctor(@RequestBody DoctorsInfo doctorsInfo){
        return service.addDoctorInfo(doctorsInfo);
    }
    @PostMapping("/add/DetailsOfAdmin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN")
    public Admin addAdminDetails(@RequestBody Admin admin) {
        return service.saveAdminDetail(admin);

    }

    @PostMapping("/add/DetailOfCardioHead")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public CardiologySpecialist addCardioHeadDetails(@RequestBody CardiologySpecialist cardiologySpecialist) {
        return service.saveCardioHeadDetail(cardiologySpecialist);
    }

    @PostMapping("/add/DetailOfCardioIntern")
    @PreAuthorize("hasAuthority('ROLE_ADMIN)")
    public CardioInterns addCardioInternDetails(@RequestBody CardioInterns cardioIntern) {
        return service.saveCardioInternDetail(cardioIntern);
    }

    @PostMapping("/add/DetailOfNeuroHead")
    @PreAuthorize("hasAuthority('ROLE_ADMIN)")
    public NeurologySpecialist addNeuroHeadDetail(@RequestBody NeurologySpecialist neurologySpecialist) {
        return service.saveNeuroHeadDetail(neurologySpecialist);
    }

    @PostMapping("/add/DetailOfNeuroIntern")
    @PreAuthorize("hasAuthority('ROLE_ADMIN)")
    public NeuroInterns addNeuroInternDetail(@RequestBody NeuroInterns neuroIntern) {
        return service.saveNeuroInternDetail(neuroIntern);
    }

    @PostMapping("/add/DetailOfNephroHead")
    @PreAuthorize("hasAuthority('ROLE_ADMIN)")
    public NephrologySpecialist addNephroHeadDetail(@RequestBody NephrologySpecialist nephrologySpecialist) {
        return service.saveNephroHeadDetail(nephrologySpecialist);
    }

    @PostMapping("/add/DetailOfNephroIntern")
    @PreAuthorize("hasAuthority('ROLE_ADMIN)")
    public NephroInterns addNephroInternDetail(@RequestBody NephroInterns nephroIntern) {
        return service.saveNephroInternDetail(nephroIntern);
    }

    // ADD DETAILS AS LIST

    @PostMapping("/add/ListOfAdmins")
    @PreAuthorize("hasAuthority('ROLE_ADMIN)")
    public List<Admin> addAdminDetails(@RequestBody List<Admin> admins) {
        return service.saveAllAdmins(admins);
    }

    @PostMapping("/add/ListOfCardioHeads")
    @PreAuthorize("hasAuthority('ROLE_ADMIN)")
    public List<CardiologySpecialist> addCardioHeadsDetails(@RequestBody List<CardiologySpecialist> cardiologySpecialists) {
        return service.saveAllCardioHeads(cardiologySpecialists);
    }

    @PostMapping("/add/ListOfCardioInterns")
    @PreAuthorize("hasAuthority('ROLE_ADMIN)")
    public List<CardioInterns> addCardioInternsDetails(@RequestBody List<CardioInterns> cardioInterns) {
        return service.saveAllCardioInterns(cardioInterns);
    }

    @PostMapping("/add/ListOfNeuroHeads")
    @PreAuthorize("hasAuthority('ROLE_ADMIN)")
    public List<NeurologySpecialist> addNeuroHeadsDetails(@RequestBody List<NeurologySpecialist> neurologySpecialists) {
        return service.saveAllNeuroHeads(neurologySpecialists);
    }

    @PostMapping("/add/ListOfNeuroInterns")
    @PreAuthorize("hasAuthority('ROLE_ADMIN)")
    public List<NeuroInterns> addNeuroInternsDetails(@RequestBody List<NeuroInterns> neuroInterns) {
        return service.saveAllNeuroInterns(neuroInterns);
    }

    @PostMapping("/add/ListOfNephroHeads")
    @PreAuthorize("hasAuthority('ROLE_ADMIN)")
    public List<NephrologySpecialist> addNephroHeadsDetails(@RequestBody List<NephrologySpecialist> nephrologySpecialists) {
        return service.saveAllNephroHeads(nephrologySpecialists);
    }

    @PostMapping("/add/ListOfNephroInterns")
    @PreAuthorize("hasAuthority('ROLE_ADMIN)")
    public List<NephroInterns> addNephroInternsDetails(@RequestBody List<NephroInterns> nephroInterns) {
        return service.saveAllNephroInterns(nephroInterns);
    }

    @GetMapping("/Welcome")
    public String welcome() {
        return "Welcome to Hospital Management System ";
    }
    @GetMapping("/display/AllDoctors")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")

    public List<DoctorsInfo> findAllDoctorsDetails() {
        return service.getAllDoctorsInfo();
    }
    @GetMapping("/display/AllAdmins")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")

    public List<Admin> findAllAdminDetails() {
        return service.getAllAdmins();
    }

    @GetMapping("/display/AllHeadsOfCardio")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_CARDIOHEAD')")

    public List<CardiologySpecialist> findAllCardioHeads() {
        return service.getAllCardioHeads();
    }

    @GetMapping("/display/AllInternsOfCardio")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_CARDIOHEAD')or hasAuthority('ROLE_CARDIOINTERN')")
    public List<CardioInterns> findAllCardioInterns() {
        return service.getAllCardioInterns();
    }

    @GetMapping("/display/AllHeadsOfNeuro")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_NEUROHEAD')")

    public List<NeurologySpecialist> findAllNeuroHeads() {
        return service.getAllNeuroHeads();
    }

    @GetMapping("/display/AllInternsOfNeuro")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_NEUROHEAD')or hasAuthority('ROLE_NEUROINTERN')")
    public List<NeuroInterns> findAllNeuroInterns() {
        return service.getAllNeuroInterns();
    }

    @GetMapping("/display/AllHeadsOfNephro")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_NEPHROHEAD')")

    public List<NephrologySpecialist> findAllNephroHeads() {
        return service.getAllNephroHeads();
    }

    @GetMapping("/display/AllInternsOfNephro")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_NEPHROHEAD')or hasAuthority('ROLE_NEPHROINTERN')")
    public List<NephroInterns> findAllNephroInterns() {
        return service.getAllNephroInterns();
    }

    //GET DETAILS BY ID
    @GetMapping("/display/AdminById/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")

    public Admin findAdminById(@PathVariable int id) {
        return service.getAdminDetailById(id);
    }

    @GetMapping("/display/HeadOfCardioById/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_CARDIOHEAD')")
    public CardiologySpecialist findCardioHeadById(@PathVariable int id) {
        return service.getCardioHeadById(id);
    }

    @GetMapping("/display/InternOfCardioById/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_CARDIOHEAD')or hasAuthority('ROLE_CARDIOINTERN')")
    public CardioInterns findCardioInternById(@PathVariable int id) {
        return service.getCardioInternById(id);
    }

    @GetMapping("/display/HeadOfNeuroById/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_NEUROHEAD')")

    public NeurologySpecialist findNeuroHeadById(@PathVariable int id) {
        return service.getNeuroHeadById(id);
    }

    @GetMapping("/display/InternOfNeuroById/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_NEUROHEAD')or hasAuthority('ROLE_NEUROINTERN')")

    public NeuroInterns findNeuroInternById(@PathVariable int id) {
        return service.getNeuroInternById(id);
    }

    @GetMapping("/display/HeadOfNephroById/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_NEPHROHEAD')")

    public NephrologySpecialist findNephroHeadById(@PathVariable int id) {
        return service.getNephroHeadById(id);
    }

    @GetMapping("/display/InternOfNephroById/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_NEPHROHEAD')or hasAuthority('ROLE_NEPHROINTERN')")

    public NephroInterns findNephroInternById(@PathVariable int id) {
        return service.getNephroInterById(id);
    }

    //GET DETAILS BY NAME
    @GetMapping("/display/AdminByName/{name}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")

    public Admin findAdminByName(@PathVariable String name) {
        return service.getAdminByName(name);
    }

    @GetMapping("/display/HeadOfCardioByName/{name}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_CARDIOHEAD')")


    public CardiologySpecialist findCardioHeadByName(@PathVariable String name) {
        return service.getCardioHeadByName(name);
    }

    @GetMapping("/display/InternOfCardioByName/{name}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_CARDIOHEAD')or hasAuthority('ROLE_CARDIOINTERN')")

    public CardioInterns findCardioInternByName(@PathVariable String name) {
        return service.getCardioInternByName(name);
    }

    @GetMapping("/display/HeadOfNeuroByName/{name}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_NEUROHEAD')")

    public NeurologySpecialist findNeuroHeadByName(@PathVariable String name) {
        return service.getNeuroHeadByName(name);
    }

    @GetMapping("/display/InternOfNeuroByName/{name}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_NEUROHEAD')or hasAuthority('ROLE_NEUROINTERN')")

    public NeuroInterns findNeuroInternByName(@PathVariable String name) {
        return service.getNeuroInternByName(name);
    }

    @GetMapping("/display/HeadOfNephroByName/{name}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_NEPHROHEAD')")

    public NephrologySpecialist findNephroHeadByName(@PathVariable String name) {
        return service.getNephroHeadByName(name);
    }

    @GetMapping("/display/InternIfNephroByName/{name}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_NEPHROHEAD')or hasAuthority('ROLE_NEPHROINTERN')")

    public NephroInterns findNephroInternByName(@PathVariable String name) {
        return service.getNephroInternByName(name);
    }
//update
@PutMapping("/update/Doctors")
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public DoctorsInfo updateDoctorDetails(@RequestBody DoctorsInfo doctorsInfo) {
    return service. updateDoctorsDetail(doctorsInfo);
}
    @PutMapping("/update/Admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Admin updateAdminDetails(@RequestBody Admin admin) {
        return service. updateAdminDetail(admin);
    }
    @PutMapping("/update/CardioHead")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public CardiologySpecialist updateCardioHead(@RequestBody CardiologySpecialist cardiologySpecialist){
        return service.updateCardioHeadDetail(cardiologySpecialist);
    }
    @PutMapping("/update/CardioIntern")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")

    public CardioInterns updateCardioIntern(@RequestBody CardioInterns cardioIntern){
        return service.updateCardioInternDetail(cardioIntern);
    }
    @PutMapping("/update/NeuroHead")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public NeurologySpecialist updateNeuroHead(@RequestBody NeurologySpecialist neurologySpecialist){
        return service.updateNeuroHeadDetail(neurologySpecialist);
    }
    @PutMapping("/update/NeuroIntern")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")

    public NeuroInterns updateNeuroIntern(@RequestBody NeuroInterns neuroIntern){
        return service.updateNeuroInternDetail(neuroIntern);
    }
    @PutMapping("/update/NephroHead")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public NephrologySpecialist updateNephroHead(@RequestBody NephrologySpecialist nephrologySpecialist){
        return service.updateNephroHeadDetail(nephrologySpecialist);
    }
    @PutMapping("/update/NephroIntern")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public NephroInterns updateNeuroIntern(@RequestBody NephroInterns nephroIntern){
        return service.updateNephroInternDetail(nephroIntern);
    }

    //delete
    @DeleteMapping("/delete/Doctors/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String deleteDoctorDetailById(@PathVariable int id){
        service.deleteDoctorDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/delete/Admin/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String deleteAdminDetailById(@PathVariable int id){
        service.deleteAdminDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/delete/CardioHead/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String deleteCardioHeadDetailById(@PathVariable int id){
        service.deleteCardioHeadDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/delete/CardioIntern/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")

    public String deleteCardioInternDetailById(@PathVariable int id){
        service.deleteCardioInternDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/delete/NeuroHead/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String deleteNeuroHeadDetailById(@PathVariable int id){
        service.deleteNeuroHeadDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/delete/NeuroIntern/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")

    public String deleteNeuroInternDetailById(@PathVariable int id){
        service.deleteNeuroInternDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/delete/NephroHead/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String deleteNephroDetailById(@PathVariable int id){
        service.deleteNephroHeadDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/delete/NephroIntern/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")

    public String deleteNephroInternDetailById(@PathVariable int id){
        service.deleteNephroInternDetails(id);
        return "Successfully deleted";
    }
}