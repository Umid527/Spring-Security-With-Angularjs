package org.learn.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


/**
 * Created by umahmudov on 02-May-17.
 */

@RestController
public class ProxyUiController {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

}
