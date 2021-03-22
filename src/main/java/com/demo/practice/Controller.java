package com.demo.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Controller {

    @GetMapping("/test")
    public String hello(@RequestParam(value = "name", required = true)String name){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("your name is :");
        stringBuilder.append(name);

        return stringBuilder.toString();
    }
}
