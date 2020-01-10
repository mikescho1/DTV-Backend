package com.zipcode.DTVApp.repositories;

import com.zipcode.DTVApp.models.ReportConcern;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReportRepo extends CrudRepository<ReportConcern, UUID> {
}
