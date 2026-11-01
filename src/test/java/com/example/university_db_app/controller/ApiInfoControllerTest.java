package com.example.university_db_app.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ApiInfoController.class)
class ApiInfoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void rootListsAvailableApiEndpoints() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("running"))
                .andExpect(jsonPath("$.endpoints[0]").value("GET /api/students"));
    }
}
