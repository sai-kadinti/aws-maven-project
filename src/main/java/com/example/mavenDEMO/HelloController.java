package com.example.mavenDEMO;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "This is sample 2 deployment using Azure AKS, Succeed";
    }

}