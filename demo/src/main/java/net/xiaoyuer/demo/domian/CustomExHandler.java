package net.xiaoyuer.demo.domian;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CustomExHandler {
    @ExceptionHandler(value = MyException.class)
    Object handerMyException(MyException e, HttpServletRequest request) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("error.html");
//        modelAndView.addObject("msg",e.getMessage());
//        return modelAndView;
        Map<String,Object> map = new HashMap<>();
        map.put("code",e.getCode());
        map.put("msg", e.getMsg());
        map.put("url", request.getRequestURI());
        return  map;

    }
}
