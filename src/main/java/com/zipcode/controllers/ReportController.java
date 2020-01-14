package com.zipcode.controllers;

import com.zipcode.models.ReportConcern;
import org.springframework.beans.factory.annotation.Autowired;
import com.zipcode.services.ReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create")
    public ResponseEntity<ReportConcern> createConcern (@RequestBody ReportConcern reportConcern) {
        return new ResponseEntity<>(reportService.createConcern(reportConcern), HttpStatus.CREATED);
    }

    @DeleteMapping("/remove/{reportIdToDelete}")
    public ResponseEntity<Boolean> deleteOneReport (@PathVariable Long reportIdToDelete){
        return new ResponseEntity<>(reportService.deleteConcern(reportIdToDelete), HttpStatus.OK);
    }


}

