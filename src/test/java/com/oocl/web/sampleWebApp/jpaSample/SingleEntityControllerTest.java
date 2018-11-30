package com.oocl.web.sampleWebApp.jpaSample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SingleEntityControllerTest {

    @Autowired
    private MockMvc mvc;
    @Test
    public void should_get_http_messge() throws Exception{
        final MvcResult result = mvc.perform(
                MockMvcRequestBuilders.get("/singleEntity"))
                .andReturn();

        final MockHttpServletResponse response = result.getResponse();
        assertEquals(200,response.getStatus());
    }
}
