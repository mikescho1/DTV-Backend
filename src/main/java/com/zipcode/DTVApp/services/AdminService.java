package com.zipcode.DTVApp.services;

import com.zipcode.DTVApp.models.Admin;
import com.zipcode.DTVApp.repositories.AdminRepo;
import com.zipcode.DTVApp.utility.authentication.PasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;



    //new
    public Boolean newAdmin (Admin admin){
        if(!adminRepo.existsByUsername(admin.getUsername()) && PasswordValidator.validatePassword(admin.getPassword())){
            Admin newAdmin = new Admin();
            newAdmin.setFirstName(admin.getFirstName());
            newAdmin.setLastName(admin.getLastName());
            newAdmin.setUsername(admin.getUsername());

            newAdmin.setPassword(passwordEncoder.encode(admin.getPassword()));
            adminRepo.save(newAdmin);
            return true;
        }else
            return false;
    }

    //update
    public Boolean updateAdmin(Long id, Admin admin){
        if(adminRepo.existsById(id)){
            Admin updateAdmin = findById(id);
            updateAdmin.setFirstName(admin.getFirstName());
            updateAdmin.setLastName(admin.getLastName());
            updateAdmin.setUsername(admin.getUsername());
            updateAdmin.setPassword(admin.getPassword());
            adminRepo.save(updateAdmin);
            return true;
        }
        return false;
    }

    //delete
    public Boolean deleteAdmin(Long id){
        if(adminRepo.existsById(id)){
            adminRepo.deleteById(id);
            return true;
        }
        return false;
    }

    //get methods
    public Admin findById(Long id){
        return adminRepo.findById(id).get();
    }

    public Iterable<Admin> findAll(){
        return adminRepo.findAll();
    }
}
