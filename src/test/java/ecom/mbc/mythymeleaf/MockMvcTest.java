package ecom.mbc.mythymeleaf;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import ecom.mbc.mythymeleaf.controller.IndexController;

@SpringBootTest
public class MockMvcTest {
    private MockMvc mvc;

    @Before
    public void setup() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();
    }

    @Test
    public void getHello() throws Exception {
        // mvc.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
        // .andExpect(content().string(containsString("index")));
        System.out.println("----------------------------------------------------------");

        ResultActions ras = mvc.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON));
        System.out.println("----------------------------------------------------------");

    }
}
