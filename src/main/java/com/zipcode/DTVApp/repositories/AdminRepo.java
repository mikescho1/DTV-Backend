package com.zipcode.DTVApp.repositories;

import com.zipcode.DTVApp.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Long> {
    Admin findByUsername(String username);
    Boolean existsByUsername(String username);
}
