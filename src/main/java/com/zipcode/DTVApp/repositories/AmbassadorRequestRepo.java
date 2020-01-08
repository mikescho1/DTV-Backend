package com.zipcode.DTVApp.repositories;

import com.zipcode.DTVApp.models.AmbassadorRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmbassadorRequestRepo extends JpaRepository<AmbassadorRequest, Long> {
}
