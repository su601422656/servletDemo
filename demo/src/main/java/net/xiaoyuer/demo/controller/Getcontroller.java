package net.xiaoyuer.demo.controller;

import net.xiaoyuer.demo.domian.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Getcontroller {
    private Map<String, Object> params = new HashMap<>();
    @GetMapping(path = "/{city_id}/{user_id}")
    public Object findUesr(@PathVariable("city_id")String cityId,@PathVariable("user_id") String
            userId){
        params.clear();
        params.put("cityId", cityId);
        params.put("userId", userId);

        return params;
    }
    @GetMapping(value ="/page_user1")
    public Object pageUser(int from, int size) {
        params.clear();
        params.put("from",from);
        params.put("size", size);

        return params;
    }
    @GetMapping(value ="/page_user2")
    public Object pageUser2(@RequestParam(defaultValue = "0",name="page")int from, int size) {
        params.clear();
        params.put("from",from);
        params.put("size", size);

        return params;
    }
    @GetMapping(value ="/page_user3")
    public Object pageUser3(@RequestBody Users user) {
        params.clear();
        params.put("user",user);

        return params;
    }
    @GetMapping(value ="/page_user4")
    public Object pageUser4(@RequestHeader("access_header") String header,String id) {
        params.clear();
        params.put("accessHeader",header);
        params.put("id",id);

        return params;
    }
    @GetMapping(value ="/page_user5")
    public Object pageUser5(HttpServletRequest request) {
        params.clear();
        params.put("name", request.getParameter("name"));

        return params;
    }





}
