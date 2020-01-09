package com.zipcode.DTVApp.repositories;

import com.zipcode.DTVApp.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Long> {
    Admin findByUsername(String username);
    Admin findByUsernameAndPassword(String username, String password);
}
