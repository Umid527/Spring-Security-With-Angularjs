package org.learn.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
=======

>>>>>>> 452fa9e47a16efd3c1ad86df13085533a516ba78
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

<<<<<<< HEAD
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
=======

    @RequestMapping("/user")
    public Principal user(Principal user) {
>>>>>>> 452fa9e47a16efd3c1ad86df13085533a516ba78
        return user;
    }
}
