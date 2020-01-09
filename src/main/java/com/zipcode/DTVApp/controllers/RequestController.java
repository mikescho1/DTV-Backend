package com.zipcode.DTVApp.controllers;

import com.zipcode.DTVApp.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @Autowired
    private RequestService requestService;
}
