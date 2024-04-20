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
    @PostMapping("/addDoctorsInfo")
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

    @GetMapping("/display/AllAdmins")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")

    public List<Admin> findAllAdminDetails() {
        return service.getAllAdmins();
    }
    @GetMapping("/Welcome")

    public String welcome() {
        return "hello";
    }

    @GetMapping("/display/AllHeadsOfCardio")
    @PreAuthorize("hasAuthority('ROLE_ADMIN','ROLE_CARDIOHEAD')")

    public List<CardiologySpecialist> findAllCardioHeads() {
        return service.getAllCardioHeads();
    }

    @GetMapping("/display/AllInternsOfCardio")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_CARDIOHEAD')")
    public List<CardioInterns> findAllCardioInterns() {
        return service.getAllCardioInterns();
    }

    @GetMapping("/displayAllHeadsOfNeuro")
    @PreAuthorize("hasRole('admin','neurohead')")
    public List<NeurologySpecialist> findAllNeuroHeads() {
        return service.getAllNeuroHeads();
    }

    @GetMapping("/displayAllInternsOfNeuro")
    @PreAuthorize("hasRole('admin','neurohead','neurointern')")
    public List<NeuroInterns> findAllNeuroInterns() {
        return service.getAllNeuroInterns();
    }

    @GetMapping("/displayAllHeadsOfNephro")
    @PreAuthorize("hasRole('admin','nephrohead')")
    public List<NephrologySpecialist> findAllNephroHeads() {
        return service.getAllNephroHeads();
    }

    @GetMapping("/displayAllInternsOfNephro")
    @PreAuthorize("hasRole('admin','nephrohead','nephrointern')")
    public List<NephroInterns> findAllNephroInterns() {
        return service.getAllNephroInterns();
    }

    //GET DETAILS BY ID
    @GetMapping("/displayAdminById/{id}")
    @PreAuthorize("hasRole('admin')")
    public Admin findAdminById(@PathVariable int id) {
        return service.getAdminDetailById(id);
    }

    @GetMapping("/displayHeadOfCardioById/{id}")
    @PreAuthorize("hasRole('admin','cardiohead')")
    public CardiologySpecialist findCardioHeadById(@PathVariable int id) {
        return service.getCardioHeadById(id);
    }

    @GetMapping("/displayInternOfCardioByid/{id}")
    @PreAuthorize("hasRole('admin','cardiohead','cardiointern')")
    public CardioInterns findCardioInternById(@PathVariable int id) {
        return service.getCardioInternById(id);
    }

    @GetMapping("/displayHeadOfNeuroById/{id}")
    @PreAuthorize("hasRole('admin','neurohead')")

    public NeurologySpecialist findNeuroHeadById(@PathVariable int id) {
        return service.getNeuroHeadById(id);
    }

    @GetMapping("/displayInternOfNeuroById/{id}")
    @PreAuthorize("hasRole('admin','neurohead','neurointern')")

    public NeuroInterns findNeuroInternById(@PathVariable int id) {
        return service.getNeuroInternById(id);
    }

    @GetMapping("/displayHeadOfNephroById/{id}")
    @PreAuthorize("hasRole('admin','nephrohead')")

    public NephrologySpecialist findNephroHeadById(@PathVariable int id) {
        return service.getNephroHeadById(id);
    }

    @GetMapping("/displayInternOfNephroById/{id}")
    @PreAuthorize("hasRole('admin','nephrohead','nephrointern')")

    public NephroInterns findNephroInternById(@PathVariable int id) {
        return service.getNephroInterById(id);
    }

    //GET DETAILS BY NAME
    @GetMapping("/displayAdminByName/{name}")
    @PreAuthorize("hasRole('admin')")

    public Admin findAdminByName(@PathVariable String name) {
        return service.getAdminByName(name);
    }

    @GetMapping("/displayHeadOfCardioByName/{name}")
    @PreAuthorize("hasRole('admin','cardiohead')")

    public CardiologySpecialist findCardioHeadByName(@PathVariable String name) {
        return service.getCardioHeadByName(name);
    }

    @GetMapping("/displayInternOfCardioByName/{name}")
    @PreAuthorize("hasRole('ADMIN','cardiohead','cardiointern')")

    public CardioInterns findCardioInternByName(@PathVariable String name) {
        return service.getCardioInternByName(name);
    }

    @GetMapping("/displayHeadOfNeuroByName/{name}")
    @PreAuthorize("hasRole('ADMIN','neurohead')")

    public NeurologySpecialist findNeuroHeadByName(@PathVariable String name) {
        return service.getNeuroHeadByName(name);
    }

    @GetMapping("/displayInternOfNeuroByName/{name}")
    @PreAuthorize("hasRole('ADMIN','neurohead','neurointern')")

    public NeuroInterns findNeuroInternByName(@PathVariable String name) {
        return service.getNeuroInternByName(name);
    }

    @GetMapping("/displayHeadOfNephroByName/{name}")
    @PreAuthorize("hasRole('ADMIN','nephrohead')")

    public NephrologySpecialist findNephroHeadByName(@PathVariable String name) {
        return service.getNephroHeadByName(name);
    }

    @GetMapping("/displayInternIfNephroByName/{name}")
    @PreAuthorize("hasRole('ADMIN','nephrohead','nephrointern')")

    public NephroInterns findNephroInternByName(@PathVariable String name) {
        return service.getNephroInternByName(name);
    }
//update
    @PutMapping("/updateAdmin")
    @PreAuthorize("hasRole('ADMIN')")

    public Admin updateAdminDetails(@RequestBody Admin admin) {
        return service. updateAdminDetail(admin);
    }
    @PutMapping("/updateCardioHead")
    @PreAuthorize("hasRole('ADMIN')")

    public CardiologySpecialist updateCardioHead(@RequestBody CardiologySpecialist cardiologySpecialist){
        return service.updateCardioHeadDetail(cardiologySpecialist);
    }
    @PutMapping("/updateCardioIntern")
    @PreAuthorize("hasRole('ADMIN')")

    public CardioInterns updateCardioIntern(@RequestBody CardioInterns cardioIntern){
        return service.updateCardioInternDetail(cardioIntern);
    }
    @PutMapping("/updateNeuroHead")
    @PreAuthorize("hasRole('ADMIN')")

    public NeurologySpecialist updateNeuroHead(@RequestBody NeurologySpecialist neurologySpecialist){
        return service.updateNeuroHeadDetail(neurologySpecialist);
    }
    @PutMapping("/updateNeuroIntern")
    @PreAuthorize("hasRole('ADMIN')")

    public NeuroInterns updateNeuroIntern(@RequestBody NeuroInterns neuroIntern){
        return service.updateNeuroInternDetail(neuroIntern);
    }
    @PutMapping("/updateNephroHead")
    @PreAuthorize("hasRole('ADMIN')")

    public NephrologySpecialist updateNephroHead(@RequestBody NephrologySpecialist nephrologySpecialist){
        return service.updateNephroHeadDetail(nephrologySpecialist);
    }
    @PutMapping("/updateNephroIntern")
    @PreAuthorize("hasRole('ADMIN')")

    public NephroInterns updateNeuroIntern(@RequestBody NephroInterns nephroIntern){
        return service.updateNephroInternDetail(nephroIntern);
    }

    //delete
    @DeleteMapping("/deleteAdmin/{id}")
    @PreAuthorize("hasRole('ADMIN')")

    public String deleteAdminDetailById(@PathVariable int id){
        service.deleteAdminDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/deleteCardioHead/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")

    public String deleteCardioHeadDetailById(@PathVariable int id){
        service.deleteCardioHeadDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/deleteCardioIntern/{id}")
    @PreAuthorize("hasRole('ADMIN')")

    public String deleteCardioInternDetailById(@PathVariable int id){
        service.deleteCardioInternDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/deleteNeuroHead/{id}")
    @PreAuthorize("hasRole('ADMIN')")

    public String deleteNeuroHeadDetailById(@PathVariable int id){
        service.deleteNeuroHeadDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/deleteNeuroIntern/{id}")
    @PreAuthorize("hasRole('ADMIN')")

    public String deleteNeuroInternDetailById(@PathVariable int id){
        service.deleteNeuroInternDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/deleteNephroHead/{id}")
    @PreAuthorize("hasRole('ADMIN')")

    public String deleteNephroDetailById(@PathVariable int id){
        service.deleteNephroHeadDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/deleteNephroIntern/{id}")
    @PreAuthorize("hasRole('ADMIN')")

    public String deleteNephroInternDetailById(@PathVariable int id){
        service.deleteNephroInternDetails(id);
        return "Successfully deleted";
    }
}