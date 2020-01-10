package com.zipcode.services;

import com.zipcode.models.ReportConcern;
import com.zipcode.repositories.ReportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired

    private ReportRepo reportRepo;

    //new

    //update

    //delete

    //get methods

    public Iterable<ReportConcern> displayAllConcerns (){
        return reportRepo.findAll();
    }

    public ReportConcern displayConcernByID (Long reportID){
        if (reportRepo.findById(reportID).isPresent()) {
            return reportRepo.findById(reportID).get();
        }
        else{
            return null;
        }
    }

    public ReportConcern createConcern (ReportConcern submittedReport){
        submittedReport.setFirstName(submittedReport.getFirstName());
        submittedReport.setLastName(submittedReport.getLastName());
        submittedReport.setMessage(submittedReport.getMessage());
        submittedReport.setLocation(submittedReport.getLocation());
        submittedReport.setDate(submittedReport.getDate());
        return reportRepo.save(submittedReport);
    }

    public Boolean deleteConcern (Long reportID) {
        if(reportRepo.findById(reportID).isPresent()) {
            reportRepo.deleteById(reportID);
            return true;
        }
        else {
            return false;
        }
    }

}
