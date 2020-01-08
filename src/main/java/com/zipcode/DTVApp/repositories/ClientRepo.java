package com.zipcode.DTVApp.repositories;

import com.zipcode.DTVApp.models.RequestAmbassador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository <RequestAmbassador, Long> {
}
