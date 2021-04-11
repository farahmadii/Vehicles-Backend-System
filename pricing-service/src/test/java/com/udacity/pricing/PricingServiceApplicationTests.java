package com.udacity.pricing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.hamcrest.Matchers.isA;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PricingServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

	// a test written to test the pricing RESTful API (includes 19 vehicle prices)
	@Test
	public void getPrice() throws Exception {
		this.mockMvc.perform(get("/services/price").param("vehicleId", "19"))
				.andExpect(status().isOk());
	}

	// a test written to test the pricing microservice (includes 20 vehicle prices)
	@Test
	public void getALlPrices() throws Exception {
		this.mockMvc.perform(get("/prices"))
				.andExpect(status().isOk())
				// since the response is a json object and not a json array
				.andExpect(jsonPath("$.*", isA(ArrayList.class)));
	}

}
