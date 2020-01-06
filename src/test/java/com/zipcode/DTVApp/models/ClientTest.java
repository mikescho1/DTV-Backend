package com.zipcode.DTVApp.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.persistence.Entity;

class ClientTest {
    private Client testClient;

    @BeforeEach
    void setUp() {
        testClient = new Client("FirstName", "LastName", "1007 N. Orange St.", "456 Tatnall St.", "856-783-9450", "myemail@gmail.com");
    }

    @Test
    public void testClassSignatureAnnotations() {
        Assertions.assertTrue(Client.class.isAnnotationPresent(Entity.class));
    }

    @Test
    public void testCreateJson() throws JsonProcessingException {
        ObjectMapper jsonWriter = new ObjectMapper();
        Client client = new Client();
        String json = jsonWriter.writeValueAsString(client);
    }

    @Test
    void getFirstName() {
        String expected = "FirstName";
        String actual = testClient.getFirstName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getLastName() {
        String expected = "LastName";
        String actual = testClient.getLastName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getStreetAddress() {
        String expected = "1007 N. Orange St.";
        String actual = testClient.getOriginAddress();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getPhoneNumber() {
        String expected = "856-783-9450";
        String actual = testClient.getPhoneNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getEmail() {
        String expected = "myemail@gmail.com";
        String actual = testClient.getEmail();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getPassword() {
        String expected = "myPassword";
        String actual = testClient.getPassword();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setFirstName() {
        String expected = "NewFirstName";
        testClient.setFirstName(expected);
        String actual = testClient.getFirstName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setLastName() {
        String expected = "NewLastName";
        testClient.setLastName(expected);
        String actual = testClient.getLastName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStreetAddress() {
        String expected = "326 Tatnall St.";
        testClient.setOriginAddress(expected);
        String actual = testClient.getOriginAddress();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPhoneNumber() {
        String expected = "215-302-8891";
        testClient.setPhoneNumber(expected);
        String actual = testClient.getPhoneNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setEmail() {
        String expected = "myNewEmail@gmail.com";
        testClient.setEmail(expected);
        String actual = testClient.getEmail();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    void setPassword() {
        String expected = "NewPassWordCreated";
        testClient.setPassword(expected);
        String actual = testClient.getPassword();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getDestinationAddress() {
        String expected = "456 Tatnall St.";
        String actual = testClient.getDestinationAddress();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setDestinationAddress() {
        String expected = "8080 North Orange St.";
        testClient.setDestinationAddress(expected);
        String actual = testClient.getDestinationAddress();
        Assertions.assertEquals(expected, actual);
    }

}