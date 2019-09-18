package net.xiaoyuer.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OtherController {
    private Map<String, Object> params = new HashMap<>();
    @PostMapping(value = "/test_post")
    public Object testPost(String name,String pwd) {
        params.clear();
        params.put("name",name);
        params.put("pwd",pwd);
        return params;
    }
    @PutMapping(value = "/test_put")
    public Object testPut(int id) {
        params.clear();
        params.put("id", id);
        return params;
    }
    @DeleteMapping(value = "/test_delete")
    public Object testDelete(int id) {
        params.clear();
        params.put("id",id);
        return params;
    }

}
