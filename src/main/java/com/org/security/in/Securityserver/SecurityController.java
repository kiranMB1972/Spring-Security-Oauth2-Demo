package com.org.security.in.Securityserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SecurityController {
    @GetMapping("/get")
    public String getMap(){
        return "hello kiran";
    }
}
