package com.zipcode.DTVApp.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
public class Client {
    //Client Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
    private Long id;
    @NotBlank(message = "Please enter a valid first name")
    private String firstName;
    @NotBlank(message = "Please enter a valid last name")
    private String lastName;

    //The city, state, and zip will all be in Wilmington.  We need a way to double check people are in the designated zone.

    @NotNull
    private String originAddress;
    @NotBlank(message = "PLease enter a valid destination address")
    @NotNull
    private String destinationAddress;
    @NotNull
    @NotBlank(message = "Please enter a valid phone number")
    private String phoneNumber;
    @Email
    @NotNull
    @NotBlank(message = "Please enter a valid email")
    private String email;
    @NotBlank(message = "Please enter a valid password")
    @Size(min=8, message = "Password must be at least 8 characters long")
    private String password;



    //Client constructors
    public Client() {}


    public Client(Long id, String firstName, String lastName, String originAddress, String destinationAddress, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

    public Client(String firstName, String lastName, String originAddress, String destinationAddress, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
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

    public String getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(String originAddress) {
        this.originAddress = originAddress;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDestinationAddress () {
        return destinationAddress;
    }

    public void setDestinationAddress (String destinationAddress){
        this.destinationAddress = destinationAddress;
    }
}
