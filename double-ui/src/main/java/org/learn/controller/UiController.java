package org.learn.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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

//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        Principal name =new Principal() {
//            @Override
//            public String getName() {
//                return auth.getName();
//            }
//        }; //get logged in username
//        System.out.println("sasaa"+name);
        return user;
    }
}
