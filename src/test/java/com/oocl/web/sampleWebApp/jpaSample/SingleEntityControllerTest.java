package com.oocl.web.sampleWebApp.jpaSample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oocl.web.sampleWebApp.entity.SingleEntity;
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

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SingleEntityControllerTest {

    @Autowired
    private MockMvc mvc;
    @Test
    public void should_get_http_messge() throws Exception{
        mvc.perform(
                MockMvcRequestBuilders.get("/singleEntity"))
                .andExpect(jsonPath("name",is("ABC")).exists());

//        final String json = result.getResponse().getContentAsString();
//        final ObjectMapper objectMapper = new ObjectMapper();
//        final SingleEntity singleEntity = objectMapper.readValue(json, SingleEntity.class);

//        final MockHttpServletResponse response = result.getResponse();
//        assertEquals(200,response.getStatus());
    }
}
