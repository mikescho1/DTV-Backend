package com.zipcode.DTVApp.services;

import com.zipcode.DTVApp.repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    private ClientRepo clientRepo;

    @Autowired
    public RequestService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }
}
