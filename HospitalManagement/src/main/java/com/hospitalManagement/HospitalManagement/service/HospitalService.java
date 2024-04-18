package com.hospitalManagement.HospitalManagement.service;

import com.hospitalManagement.HospitalManagement.entity.*;
import com.hospitalManagement.HospitalManagement.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private CardioInternsRepository cardioInternsRepository;
    @Autowired
    private CardiologySpecialistRepository cardiologySpecialistRepository;
    @Autowired
    private NephroInternsRepository nephroInternsRepository;
    @Autowired
    private NephrologySpecialistRepository nephrologySpecialistRepository;
    @Autowired
    private NeuroInternsRepository neuroInternsRepository;
    @Autowired
    private NeurologySpecialistRepository neurologySpecialistRepository;

//Get details as List
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }
    public List<CardioInterns> getAllCardioInterns() {
        return cardioInternsRepository.findAll();
    }
    public List<CardiologySpecialist> getAllCardioHeads() {
        return cardiologySpecialistRepository.findAll();
    }
    public List<NeuroInterns> getAllNeuroInterns() {
        return neuroInternsRepository.findAll();
    }
    public List<NeurologySpecialist> getAllNeuroHeads() {
        return neurologySpecialistRepository.findAll();
    }
    public List<NephroInterns> getAllNephroInterns() {
        return nephroInternsRepository.findAll();
    }
    public List<NephrologySpecialist> getAllNephroHeads() {
        return nephrologySpecialistRepository.findAll();
    }
// Get individual DetailsById

    public Admin  getAdminDetailById(int id){
        return adminRepository.findById(id).orElse(null);
    }
    public CardioInterns getCardioInternById(int id){
        return cardioInternsRepository.findById(id).orElse(null);
    }
    public CardiologySpecialist getCardioHeadById(int id){
        return cardiologySpecialistRepository.findById(id).orElse(null);
    }
    public NeuroInterns getNeuroInternById(int id){
        return neuroInternsRepository.findById(id).orElse(null);
    }
    public NeurologySpecialist getNeuroHeadById(int id){
        return neurologySpecialistRepository.findById(id).orElse(null);
    }
    public NephroInterns getNephroInterById(int id){
        return nephroInternsRepository.findById(id).orElse(null);
    }
    public NephrologySpecialist getNephroHeadById(int id){
        return nephrologySpecialistRepository.findById(id).orElse(null);
    }

 // Get individual details ByName

   public Admin getAdminByName(String name){
       return adminRepository.findByName(name);
   }
    public CardioInterns getCardioInternByName(String name){
        return cardioInternsRepository.findByName(name);
    }
    public CardiologySpecialist getCardioHeadByName(String name){
        return cardiologySpecialistRepository.findByName(name);
    }
    public NeuroInterns getNeuroInternByName(String name){
        return neuroInternsRepository.findByName(name);
    }
    public NeurologySpecialist getNeuroHeadByName(String name){
        return neurologySpecialistRepository.findByName(name);
    }
    public NephroInterns getNephroInternByName(String name){
        return  nephroInternsRepository.findByName(name);
    }
    public NephrologySpecialist getNephroHeadByName(String name){
        return nephrologySpecialistRepository.findByName(name);
    }

    //Save details as list

    public List<Admin> saveAllAdmins(List<Admin> admins){
        return adminRepository.saveAll(admins);
    }
    public List<CardioInterns> saveAllCardioInterns(List<CardioInterns> cardiointerns){
        return cardioInternsRepository.saveAll(cardiointerns);
    }
    public List<CardiologySpecialist> saveAllCardioHeads(List<CardiologySpecialist> cardiologySpecialists){
        return cardiologySpecialistRepository.saveAll(cardiologySpecialists);
    }
    public List<NeuroInterns> saveAllNeuroInterns(List<NeuroInterns> neuroInterns){
        return neuroInternsRepository.saveAll(neuroInterns);
    }
    public List<NeurologySpecialist> saveAllNeuroHeads(List<NeurologySpecialist> neurologySpecialists){
        return neurologySpecialistRepository.saveAll(neurologySpecialists);
    }
    public List<NephroInterns> saveAllNephroInterns(List<NephroInterns> nephroInterns){
        return nephroInternsRepository.saveAll(nephroInterns);
    }
    public List<NephrologySpecialist> saveAllNephroHeads(List<NephrologySpecialist> nephrologySpecialists){
        return nephrologySpecialistRepository.saveAll(nephrologySpecialists);
    }

    // Save individual details

    public Admin saveAdminDetail(Admin admin){
        return adminRepository. save(admin);
    }
    public CardioInterns saveCardioInternDetail(CardioInterns cardioIntern){
        return cardioInternsRepository. save(cardioIntern);
    }
    public CardiologySpecialist saveCardioHeadDetail(CardiologySpecialist cardiologySpecialist){
        return cardiologySpecialistRepository. save(cardiologySpecialist);
    }
    public NeuroInterns saveNeuroInternDetail(NeuroInterns neuroIntern){
        return neuroInternsRepository. save(neuroIntern);
    }
    public NeurologySpecialist saveNeuroHeadDetail(NeurologySpecialist neurologySpecialist){
        return neurologySpecialistRepository. save(neurologySpecialist);
    }
    public NephroInterns saveNephroInternDetail(NephroInterns nephroIntern){
        return nephroInternsRepository. save(nephroIntern);
    }
    public NephrologySpecialist saveNephroHeadDetail(NephrologySpecialist nephrologySpecialist){
        return nephrologySpecialistRepository. save(nephrologySpecialist);
    }

    //update

    public Admin updateAdminDetail (Admin admin){
        Admin a = adminRepository.findById(admin.getId()).orElse(null);
        a.setName(admin.getName());
        a.setEmail(admin.getEmail());
        a.setPassword(admin.getPassword());
        a.setRoles(admin.getRoles());
        return adminRepository.save(a);

    }

    public CardioInterns updateCardioInternDetail (CardioInterns cardioInterns){
        CardioInterns cardiointern  =cardioInternsRepository.findById(cardioInterns.getId()).orElse(null);
        cardiointern.setName(cardioInterns.getName());
        cardiointern.setEmail(cardioInterns.getEmail());
        cardiointern.setSal(cardioInterns.getSal());
        cardiointern.setRoles(cardioInterns.getRoles());
        return cardioInternsRepository.save(cardiointern);
    }

    public CardiologySpecialist updateCardioHeadDetail (CardiologySpecialist cardioHeads){
        CardiologySpecialist cardiohead  =cardiologySpecialistRepository.findById(cardioHeads.getId()).orElse(null);
        cardiohead.setName(cardioHeads.getName());
        cardiohead.setEmail(cardioHeads.getEmail());
        cardiohead.setSal(cardioHeads.getSal());
        cardiohead.setRoles(cardioHeads.getRoles());
        return cardiologySpecialistRepository.save(cardiohead);
    }

    public NeuroInterns updateNeuroInternDetail (NeuroInterns neuroInterns){
        NeuroInterns neurointern  =neuroInternsRepository.findById(neuroInterns.getId()).orElse(null);
        neurointern.setName(neuroInterns.getName());
        neurointern.setEmail(neuroInterns.getEmail());
        neurointern.setSal(neuroInterns.getSal());
        neurointern.setRoles(neuroInterns.getRoles());
        return neuroInternsRepository.save(neurointern);
    }
    public NeurologySpecialist updateNeuroHeadDetail (NeurologySpecialist neuroHeads){
        NeurologySpecialist neurohead =neurologySpecialistRepository.findById(neuroHeads.getId()).orElse(null);
        neurohead.setName(neuroHeads.getName());
        neurohead.setEmail(neuroHeads.getEmail());
        neurohead.setSal(neuroHeads.getSal());
        neurohead.setRoles(neuroHeads.getRoles());
        return neurologySpecialistRepository.save(neurohead);
    }

    public NephroInterns updateNephroInternDetail(NephroInterns nephroInterns) {
        NephroInterns nephrointern = nephroInternsRepository.findById(nephroInterns.getId()).orElse(null);
        nephrointern.setName(nephroInterns.getName());
        nephrointern.setEmail(nephroInterns.getEmail());
        nephrointern.setSal(nephroInterns.getSal());
        nephrointern.setRoles(nephroInterns.getRoles());
        return nephroInternsRepository.save(nephrointern);
    }
    public NephrologySpecialist updateNephroHeadDetail (NephrologySpecialist nephroHeads){
        NephrologySpecialist nephrohead =nephrologySpecialistRepository.findById(nephroHeads.getId()).orElse(null);
        nephrohead.setName(nephroHeads.getName());
        nephrohead.setEmail(nephroHeads.getEmail());
        nephrohead.setSal(nephroHeads.getSal());
        nephrohead.setRoles(nephroHeads.getRoles());
        return nephrologySpecialistRepository.save(nephrohead);
    }
    // delete

    public String deleteAdminDetails(int id){
        adminRepository.deleteById(id);
        return "deleted successfully"+id;
    }
    public String deleteCardioHeadDetails(int id){
        cardiologySpecialistRepository.deleteById(id);
        return "deleted successfully"+id;
    }
    public String deleteCardioInternDetails(int id){
        cardioInternsRepository.deleteById(id);
        return "deleted successfully"+id;
    }
    public String deleteNeuroHeadDetails(int id){
        neurologySpecialistRepository.deleteById(id);
        return "deleted successfully"+id;
    }
    public String deleteNeuroInternDetails(int id){
        neuroInternsRepository.deleteById(id);
        return "deleted successfully"+id;
    }
    public String deleteNephroHeadDetails(int id){
        nephrologySpecialistRepository.deleteById(id);
        return "deleted successfully"+id;
    }
    public String deleteNephroInternDetails(int id){
        nephroInternsRepository.deleteById(id);
        return "deleted successfully"+id;
    }

}
