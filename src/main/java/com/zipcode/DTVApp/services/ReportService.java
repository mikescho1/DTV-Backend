package com.zipcode.DTVApp.services;


import com.zipcode.DTVApp.models.ReportConcern;
import com.zipcode.DTVApp.repositories.ReportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Service
public class ReportService {

    @Autowired
    ReportRepo reportRepo;

    public Iterable<ReportConcern> displayAllConcerns (){
        return reportRepo.findAll();
    }

    public ReportConcern createConcern (ReportConcern submittedReport){
        submittedReport.setFirstName(submittedReport.getFirstName());
        submittedReport.setLastName(submittedReport.getLastName());
        submittedReport.setMessage(submittedReport.getMessage());
        submittedReport.setLocation(submittedReport.getLocation());
        submittedReport.setDate(submittedReport.getDate());
        return reportRepo.save(submittedReport);
    }

    public ReportConcern displayConcernByID (UUID reportID){
        if (reportRepo.findById(reportID).isPresent()) {
            return reportRepo.findById(reportID).get();
        }
        else{
            return null;
        }
    }

    public Boolean deleteConcern (UUID reportID) {
        if(reportRepo.findById(reportID).isPresent()) {
            reportRepo.deleteById(reportID);
            return true;
        }
        else {
            return false;
        }
    }
}
