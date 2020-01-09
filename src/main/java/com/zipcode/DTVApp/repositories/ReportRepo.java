package com.zipcode.DTVApp.repositories;

import com.zipcode.DTVApp.models.ReportConcern;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepo extends CrudRepository<ReportConcern, Long> {
}
