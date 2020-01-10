package com.zipcode.DTVApp.controllers;


import com.zipcode.DTVApp.services.ReportService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import com.zipcode.DTVApp.models.ReportConcern;
import com.zipcode.DTVApp.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping
    public ResponseEntity<Iterable<ReportConcern>> displayAllRePorts (){
        return new ResponseEntity<>(reportService.displayAllConcerns(), HttpStatus.OK);
    }

    public ResponseEntity<ReportConcern> displayOneReport (Long reportId){
        return new ResponseEntity<>(reportService.displayConcernByID(reportId), HttpStatus.OK);
    }

}

