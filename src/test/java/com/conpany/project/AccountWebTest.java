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
    public void uploadCmd1() throws Exception {
        String sumProjectId = "2123";
        int type = 1;
        int cmd = 1;
        String pwd = "123";
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("sumProjectId", sumProjectId);
        params.put("type", type + "");
        params.put("pwd", pwd + "");
        params.put("cmd", cmd + "");
        MockUtil.mockPost(mockMvc, "/project/upload", params);
    }

}