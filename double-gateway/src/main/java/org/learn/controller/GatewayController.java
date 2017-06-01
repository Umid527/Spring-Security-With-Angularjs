package org.learn.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


/**
 * Created by umahmudov on 01-Jun-17.
 */

@RestController
public class GatewayController {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
