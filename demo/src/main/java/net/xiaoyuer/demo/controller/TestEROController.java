package net.xiaoyuer.demo.controller;

import net.xiaoyuer.demo.domian.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEROController {
    @RequestMapping(value = "/testerror")
    public void testError() {
        throw new MyException("code","msg");
    }
}
