package com.zipcode.DTVApp.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class ReportConcern {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    private String message;
    @NotNull
    private String location;
    private Date date;
    //optional image upload


    public ReportConcern() {
    }

    public ReportConcern(@NotNull String name, String message, String location, Date date) {
        this.name = name;
        this.message = message;
        this.location = location;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
