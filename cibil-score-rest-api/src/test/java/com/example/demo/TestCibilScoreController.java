package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.controllers.CibilScoreController;
import com.example.demo.entity.CibilScore;
import com.example.demo.ifaces.CibilScoreRepository;
import com.example.demo.services.CibilScoreService;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
public class TestCibilScoreController {


	  @Autowired
	  private MockMvc mockMvc;

	  @Autowired
	  private ObjectMapper objectMapper;

	  @Test
	  void shouldCreateScore() throws Exception {
	    CibilScore entity = new CibilScore("AXC234JJ","Jagan", 230);

	    mockMvc.perform(post("/api/v1/cibilscores").contentType(MediaType.APPLICATION_JSON)
	        .content(objectMapper.writeValueAsString(entity)))
	        .andExpect(status().isCreated())
	        .andDo(print());
	  }

}
