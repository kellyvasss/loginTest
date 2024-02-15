package com.kelly.loginTest;

import org.atmosphere.config.service.Get;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class A {
    @GetMapping
    public String a() {
        return "A";
    }
}
