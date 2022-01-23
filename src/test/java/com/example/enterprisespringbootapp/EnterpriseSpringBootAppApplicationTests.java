package com.example.enterprisespringbootapp;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@org.springframework.boot.test.context.SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@org.springframework.boot.test.context.SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringRunner.class)
@IfProfileValue(name = "",value = "yes")
@AutoConfigureMockMvc
class EnterpriseSpringBootAppApplicationTests {

//    @LocalServerPort
//    private int port;
//    @Autowired
//    private TestRestTemplate testRestTemplate;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
    }


    @Test
    public void getCarTest() throws Exception {

        this.mockMvc
                .perform(get("/cars"))
                .andDo(System.out::println)
                .andExpect(status().isOk());;


    }

}
