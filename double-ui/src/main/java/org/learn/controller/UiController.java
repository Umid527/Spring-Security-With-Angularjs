package org.learn.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


/**
 * Created by umahmudov on 22-May-17.
 */


@RestController
public class UiController {


    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
