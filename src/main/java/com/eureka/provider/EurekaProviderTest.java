package com.eureka.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yin jiafu
 * @Date: 2021/10/18 14:09
 * @Description:
 */
@RestController
public class EurekaProviderTest {
    /**
     * 假如这个客户端要提供一个getUser的方法
     * @return
     */
    @GetMapping(value = "/getUser")
    @ResponseBody
    public Map<String,Object> getUser(@RequestParam Integer id){
        Map<String,Object> data = new HashMap<>();
        data.put("id",id);
        data.put("userName","admin");
        data.put("from","provider-B");
        return data;
    }
}
