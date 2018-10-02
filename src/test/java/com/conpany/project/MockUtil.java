package com.conpany.project;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MockUtil {

    public static String mock(MockMvc mvc, String uri) throws Exception {
        return mvc.perform(MockMvcRequestBuilders.get(uri, "json").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON)).andReturn()
                .getResponse().getContentAsString();
    }

    public static void mockPost(MockMvc mvc, String uri) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post(uri, "json").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON);
        mvc.perform(builder).andDo(MockMvcResultHandlers.print());
    }

    public static void mockPost(MockMvc mvc, String uri, HashMap<String, String> params) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post(uri, "json").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON);
        if (params != null) {
            Iterator<Map.Entry<String, String>> iter = params.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<String, String> entry = iter.next();
                String key = entry.getKey();
                String val = entry.getValue();
                builder.param(key, val);
            }
        }
        mvc.perform(builder).andDo(MockMvcResultHandlers.print());
    }
}