package org.learn.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import java.security.Principal;
=======
>>>>>>> 452fa9e47a16efd3c1ad86df13085533a516ba78
import java.util.UUID;


/**
 * Created by umahmudov on 26-May-17.
 */


@RestController
public class DoubleResourceController {

    @RequestMapping("/")
    public Message home() {
<<<<<<< HEAD
        return new Message("Hello kele double-resource World ");
=======
        return new Message("Hello kele World ");
>>>>>>> 452fa9e47a16efd3c1ad86df13085533a516ba78
    }
}


class Message {

    private String id = UUID.randomUUID().toString();
    private String content;

    public Message(String content) {
        this.content = content;
    }

    @SuppressWarnings("unused")
    public Message() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}