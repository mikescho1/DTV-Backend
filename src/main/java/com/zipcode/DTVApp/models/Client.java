package com.zipcode.DTVApp.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class Client {
    //Client Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    //The city, state, and zip will all be in Wilmington.  We need a way to double check people are in the designated zone.
    @NotNull
    private String streetAddress;
    @NotNull
    private String phoneNumber;
    private String email;

    //Client constructors
    public Client() {}

    public Client(Long id, String firstName, String lastName, String streetAddress, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Client(String firstName, String lastName, String streetAddress, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
