package com.zipcode.DTVApp.controllers;

import com.zipcode.DTVApp.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;
}
