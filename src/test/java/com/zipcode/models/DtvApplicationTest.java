package com.zipcode.models;

import com.zipcode.repositories.AdminRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;



@RunWith(SpringRunner.class)
@WebMvcTest
public class DtvApplicationTest {

//    @Autowired
//    private MockMvc mockMvc;

//    @MockBean
//    private AdminRepo adminRepo;
//
//    @Test
//    public void contextLoad() throws Exception {
//        when(adminRepo.findAll()).thenReturn(
//                Collections.emptyList()
//        );
//
//        MvcResult mvcResult =  mockMvc.perform(
//                MockMvcRequestBuilders.get("/admins").accept(MediaType.APPLICATION_JSON)
//        ).andReturn();
//
//        System.out.println(mvcResult.getResponse());
//
//        verify(adminRepo).findAll();
//    }
}