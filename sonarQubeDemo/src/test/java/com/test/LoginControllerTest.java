package com.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@ExtendWith(SpringExtension.class)
//@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes=BeanConfig.class)
public class LoginControllerTest {
	@Autowired
	WebApplicationContext context;
	private MockMvc mvc;
	@BeforeEach
	//@Before
	public void setup() {
		mvc= MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@org.junit.jupiter.api.Test
	//@org.junit.Test
	public void loginTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/loginPage"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.view().name("login"));
	}
	
	@org.junit.jupiter.api.Test
	//@org.junit.Test
	public void successTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/successPage"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.view().name("success"));
	}
	@org.junit.jupiter.api.Test
	//@org.junit.Test
	public void registerTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/registerPage"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.view().name("register"));
	}
}
