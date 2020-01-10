package com.zipcode.controllers;

import com.zipcode.models.ReportConcern;
import org.springframework.beans.factory.annotation.Autowired;
import com.zipcode.services.ReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{reportId}")
    public ResponseEntity<ReportConcern> displayOneReport (@PathVariable Long reportId){
        return new ResponseEntity<>(reportService.displayConcernByID(reportId), HttpStatus.OK);
    }

}

