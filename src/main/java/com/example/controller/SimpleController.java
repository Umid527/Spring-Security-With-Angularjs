package com.example.controller;
import com.example.domain.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


/**
 * Created by umahmudov on 24-Apr-17.
 */

@RestController
public class SimpleController {

    @RequestMapping("/resource")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello Kele");
        return model;
    }
    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
