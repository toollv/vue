package com.study.vue.lianxi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/1")
public class test {



   @GetMapping("/1")
    public String setV1(){

        return "1";
    }
    @GetMapping("/2")
    private String setV2(){

        return "name1";
    }
}
