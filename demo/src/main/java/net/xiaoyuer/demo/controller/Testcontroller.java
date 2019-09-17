package net.xiaoyuer.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testcontroller {
    @RequestMapping(value = {"/test"})
    public String test(){
        return "hello";
    }

}
