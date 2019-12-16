package com.zipcode.DTVApp.repositories;

import com.zipcode.DTVApp.models.Ambassador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmbassadorRepo extends JpaRepository <Ambassador, Long> {
}
