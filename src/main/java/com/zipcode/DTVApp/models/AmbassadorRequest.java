package com.zipcode.DTVApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AmbassadorRequest {

    @Id
    @GeneratedValue
    Long id;

}