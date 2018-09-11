package org.debugroom.sample.one_source_multi_country.app.web;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.ResultActions.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import org.debugroom.sample.one_source_multi_country.config.WebApp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(Enclosed.class)
public class SampleRestControllerTest {

    @RunWith(SpringRunner.class)
    @ActiveProfiles({"UnitedStates", "LA"})
    @SpringBootTest(classes = WebApp.class)
    public static class UnitedStatesLAProfileTest{

        @Autowired
        WebApplicationContext context;

        MockMvc mockMvc;

        @Before
        public void setUpMockMvc(){
            this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        }

        @Test
        public void testGetUsers() throws Exception{

            MvcResult mvcResult = mockMvc.perform(get("http://localhost:8080/api/v1/tax/10000"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andReturn();

            MvcResult mvcResult2 = mockMvc.perform(get("http://localhost:8080/api/v1/judgement/adult/17"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andReturn();

            MvcResult mvcResult3 = mockMvc.perform(get("http://localhost:8080/api/v1/judgement/adult/18"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andReturn();
        }

    }

    @RunWith(SpringRunner.class)
    @ActiveProfiles({"UnitedStates", "NY"})
    @SpringBootTest(classes = WebApp.class)
    public static class UnitedStatesNYProfileTest{

        @Autowired
        WebApplicationContext context;

        MockMvc mockMvc;

        @Before
        public void setUpMockMvc(){
            this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        }

        @Test
        public void testGetUsers() throws Exception{

            MvcResult mvcResult = mockMvc.perform(get("http://localhost:8080/api/v1/tax/10000"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andReturn();

            MvcResult mvcResult2 = mockMvc.perform(get("http://localhost:8080/api/v1/judgement/adult/17"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andReturn();

            MvcResult mvcResult3 = mockMvc.perform(get("http://localhost:8080/api/v1/judgement/adult/18"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andReturn();
        }

    }

    @RunWith(SpringRunner.class)
    @ActiveProfiles({"Japan"})
    @SpringBootTest(classes = WebApp.class)
    public static class JapanProfileTest{

        @Autowired
        WebApplicationContext context;

        MockMvc mockMvc;

        @Before
        public void setUpMockMvc(){
            this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        }

        @Test
        public void testGetUsers() throws Exception{

            MvcResult mvcResult = mockMvc.perform(get("http://localhost:8080/api/v1/tax/10000"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andReturn();

            MvcResult mvcResult2 = mockMvc.perform(get("http://localhost:8080/api/v1/judgement/adult/19"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andReturn();

            MvcResult mvcResult3 = mockMvc.perform(get("http://localhost:8080/api/v1/judgement/adult/20"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andReturn();
        }

    }
}
