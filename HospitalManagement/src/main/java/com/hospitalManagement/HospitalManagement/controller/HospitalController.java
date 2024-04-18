package com.hospitalManagement.HospitalManagement.controller;

import com.hospitalManagement.HospitalManagement.entity.*;
import com.hospitalManagement.HospitalManagement.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    private HospitalService service;

    @PostMapping("/addDetailsOfAdmin")
    public Admin addAdminDetails(@RequestBody Admin admin) {
        return service.saveAdminDetail(admin);
    }

    @PostMapping("/addDetailOfCardioHead")
    public CardiologySpecialist addCardioHeadDetails(@RequestBody CardiologySpecialist cardiologySpecialist) {
        return service.saveCardioHeadDetail(cardiologySpecialist);
    }

    @PostMapping("/addDetailOfCardioIntern")
    public CardioInterns addCardioInternDetails(@RequestBody CardioInterns cardioIntern) {
        return service.saveCardioInternDetail(cardioIntern);
    }

    @PostMapping("/addDetailOfNeuroHead")
    public NeurologySpecialist addNeuroHeadDetail(@RequestBody NeurologySpecialist neurologySpecialist) {
        return service.saveNeuroHeadDetail(neurologySpecialist);
    }

    @PostMapping("/addDetailOfNeuroIntern")
    public NeuroInterns addNeuroInternDetail(@RequestBody NeuroInterns neuroIntern) {
        return service.saveNeuroInternDetail(neuroIntern);
    }

    @PostMapping("/addDetailOfNephroHead")
    public NephrologySpecialist addNephroHeadDetail(@RequestBody NephrologySpecialist nephrologySpecialist) {
        return service.saveNephroHeadDetail(nephrologySpecialist);
    }

    @PostMapping("/addDetailOfNephroIntern")
    public NephroInterns addNephroInternDetail(@RequestBody NephroInterns nephroIntern) {
        return service.saveNephroInternDetail(nephroIntern);
    }

    // ADD DETAILS AS LIST

    @PostMapping("/addListOfAdmins")
    public List<Admin> addAdminDetails(@RequestBody List<Admin> admins) {
        return service.saveAllAdmins(admins);
    }

    @PostMapping("/addListOfCardioHeads")
    public List<CardiologySpecialist> addCardioHeadsDetails(@RequestBody List<CardiologySpecialist> cardiologySpecialists) {
        return service.saveAllCardioHeads(cardiologySpecialists);
    }

    @PostMapping("/addListOfCardioInterns")
    public List<CardioInterns> addCardioInternsDetails(@RequestBody List<CardioInterns> cardioInterns) {
        return service.saveAllCardioInterns(cardioInterns);
    }

    @PostMapping("/addListOfNeuroHeads")
    public List<NeurologySpecialist> addNeuroHeadsDetails(@RequestBody List<NeurologySpecialist> neurologySpecialists) {
        return service.saveAllNeuroHeads(neurologySpecialists);
    }

    @PostMapping("/addListOfNeuroInterns")
    public List<NeuroInterns> addNeuroInternsDetails(@RequestBody List<NeuroInterns> neuroInterns) {
        return service.saveAllNeuroInterns(neuroInterns);
    }

    @PostMapping("/addListOfNephroHeads")
    public List<NephrologySpecialist> addNephroHeadsDetails(@RequestBody List<NephrologySpecialist> nephrologySpecialists) {
        return service.saveAllNephroHeads(nephrologySpecialists);
    }

    @PostMapping("/addListOfNephroInterns")
    public List<NephroInterns> addNephroInternsDetails(@RequestBody List<NephroInterns> nephroInterns) {
        return service.saveAllNephroInterns(nephroInterns);
    }

    @GetMapping("/displayAllAdmins")
    public List<Admin> findAllAdminDetails() {
        return service.getAllAdmins();
    }

    @GetMapping("/displayAllCardioHeads")
    public List<CardiologySpecialist> findAllCardioHeads() {
        return service.getAllCardioHeads();
    }

    @GetMapping("/displayAllCardioInterns")
    public List<CardioInterns> findAllCardioInterns() {
        return service.getAllCardioInterns();
    }

    @GetMapping("/displayAllNeuroHeads")
    public List<NeurologySpecialist> findAllNeuroHeads() {
        return service.getAllNeuroHeads();
    }

    @GetMapping("/displayAllNeuroInterns")
    public List<NeuroInterns> findAllNeuroInterns() {
        return service.getAllNeuroInterns();
    }

    @GetMapping("/displayAllNephroHeads")
    public List<NephrologySpecialist> findAllNephroHeads() {
        return service.getAllNephroHeads();
    }

    @GetMapping("/displayAllNephroInterns")
    public List<NephroInterns> findAllNephroInterns() {
        return service.getAllNephroInterns();
    }

    //GET DETAILS BY ID
    @GetMapping("/getAdminById/{id}")
    public Admin findAdminById(@PathVariable int id) {
        return service.getAdminDetailById(id);
    }

    @GetMapping("/getCardioHeadById/{id}")
    public CardiologySpecialist findCardioHeadById(@PathVariable int id) {
        return service.getCardioHeadById(id);
    }

    @GetMapping("/getCardioInternByid/{id}")
    public CardioInterns findCardioInternById(@PathVariable int id) {
        return service.getCardioInternById(id);
    }

    @GetMapping("/getNeuroHeadById/{id}")
    public NeurologySpecialist findNeuroHeadById(@PathVariable int id) {
        return service.getNeuroHeadById(id);
    }

    @GetMapping("/getNeuroInternById/{id}")
    public NeuroInterns findNeuroInternById(@PathVariable int id) {
        return service.getNeuroInternById(id);
    }

    @GetMapping("/getNephroHeadById/{id}")
    public NephrologySpecialist findNephroHeadById(@PathVariable int id) {
        return service.getNephroHeadById(id);
    }

    @GetMapping("/getNephroInternById/{id}")
    public NephroInterns findNephroInternById(@PathVariable int id) {
        return service.getNephroInterById(id);
    }

    //GET DETAILS BY NAME
    @GetMapping("/getAdminByName/{name}")
    public Admin findAdminByName(@PathVariable String name) {
        return service.getAdminByName(name);
    }

    @GetMapping("/getCardioHeadByName/{name}")
    public CardiologySpecialist findCardioHeadByName(@PathVariable String name) {
        return service.getCardioHeadByName(name);
    }

    @GetMapping("/getCardioInternByName/{name}")
    public CardioInterns findCardioInternByName(@PathVariable String name) {
        return service.getCardioInternByName(name);
    }

    @GetMapping("/getNeuroHeadByName/{name}")
    public NeurologySpecialist findNeuroHeadByName(@PathVariable String name) {
        return service.getNeuroHeadByName(name);
    }

    @GetMapping("/getNeuroInternByName/{name}")
    public NeuroInterns findNeuroInternByName(@PathVariable String name) {
        return service.getNeuroInternByName(name);
    }

    @GetMapping("/getNephroHeadByName/{name}")
    public NephrologySpecialist findNephroHeadByName(@PathVariable String name) {
        return service.getNephroHeadByName(name);
    }

    @GetMapping("/getNephroInternByName/{name}")
    public NephroInterns findNephroInternByName(@PathVariable String name) {
        return service.getNephroInternByName(name);
    }
//update
    @PutMapping("/updateAdmin")
    public Admin updateAdminDetails(@RequestBody Admin admin) {
        return service. updateAdminDetail(admin);
    }
    @PutMapping("/updateCardioHead")
    public CardiologySpecialist updateCardioHead(@RequestBody CardiologySpecialist cardiologySpecialist){
        return service.updateCardioHeadDetail(cardiologySpecialist);
    }
    @PutMapping("/updateCardioIntern")
    public CardioInterns updateCardioIntern(@RequestBody CardioInterns cardioIntern){
        return service.updateCardioInternDetail(cardioIntern);
    }
    @PutMapping("/updateNeuroHead")
    public NeurologySpecialist updateNeuroHead(@RequestBody NeurologySpecialist neurologySpecialist){
        return service.updateNeuroHeadDetail(neurologySpecialist);
    }
    @PutMapping("/updateNeuroIntern")
    public NeuroInterns updateNeuroIntern(@RequestBody NeuroInterns neuroIntern){
        return service.updateNeuroInternDetail(neuroIntern);
    }
    @PutMapping("/updateNephroHead")
    public NephrologySpecialist updateNephroHead(@RequestBody NephrologySpecialist nephrologySpecialist){
        return service.updateNephroHeadDetail(nephrologySpecialist);
    }
    @PutMapping("/updateNephroIntern")
    public NephroInterns updateNeuroIntern(@RequestBody NephroInterns nephroIntern){
        return service.updateNephroInternDetail(nephroIntern);
    }
    //delete
    @DeleteMapping("/deleteAdmin/{id}")
    public String deleteAdminDetailById(@PathVariable int id){
        service.deleteAdminDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/deleteCardioHead/{id}")
    public String deleteCardioHeadDetailById(@PathVariable int id){
        service.deleteCardioHeadDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/deleteCardioIntern/{id}")
    public String deleteCardioInternDetailById(@PathVariable int id){
        service.deleteCardioInternDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/deleteNeuroHead/{id}")
    public String deleteNeuroHeadDetailById(@PathVariable int id){
        service.deleteNeuroHeadDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/deleteNeuroIntern/{id}")
    public String deleteNeuroInternDetailById(@PathVariable int id){
        service.deleteNeuroInternDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/deleteNephroHead/{id}")
    public String deleteNephroDetailById(@PathVariable int id){
        service.deleteNephroHeadDetails(id);
        return "Successfully deleted";
    }
    @DeleteMapping("/deleteNephroIntern/{id}")
    public String deleteNephroInternDetailById(@PathVariable int id){
        service.deleteNephroInternDetails(id);
        return "Successfully deleted";
    }
}