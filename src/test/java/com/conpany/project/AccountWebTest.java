package com.conpany.project;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.HashMap;


public class AccountWebTest extends BaseWebTest {
    private static final String RESOURCE_PATH = "/th/coin/account" ;

    @Test
    public void list() throws Exception {
        HashMap<String, String> params = Maps.newHashMap() ;
        params.put("pageNum",0 + "");
        params.put("pageSize",10 + "");
        MockUtil.mockPost(mockMvc, RESOURCE_PATH +"/list",params);
    }

    @Test
    public void balancePlus() throws Exception {
        HashMap<String, String> params = Maps.newHashMap() ;
        MockUtil.mockPost(mockMvc, RESOURCE_PATH +"/balance/plus",params);
    }

}