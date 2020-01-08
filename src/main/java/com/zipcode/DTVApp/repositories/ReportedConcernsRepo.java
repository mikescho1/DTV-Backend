package com.zipcode.DTVApp.repositories;

import com.zipcode.DTVApp.models.ReportedConcern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportedConcernsRepo extends JpaRepository <ReportedConcern, Long> {
}
