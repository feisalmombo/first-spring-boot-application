package com.feisalcoder.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/hello") 
    public String Index() {
        return "First Spring Application!";
    }
}