package net.xiaoyuer.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Getcontroller {
    @RequestMapping(value = {"/get_index"})
    @ResponseBody
    public String get_index(String str) {
        return str;
    }
    @RequestMapping(value = "/index")
    @ResponseBody
    public String index(){
        return "hello MacOs";
    }
}
