package org.learn.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * Created by umahmudov on 26-May-17.
 */


@RestController
public class DoubleResourceController {

    private String message = "Hello World";
    private List<Change> changes = new ArrayList<>();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Message home() {
        return new Message(message);
    }

    @RequestMapping(value = "/changes", method = RequestMethod.GET)
    public List<Change> changes() {
        return changes;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Message update(@RequestBody Message map, Principal principal) {
        if (map.getContent() != null) {
            message = map.getContent();
            changes.add(new Change(principal.getName(), message));
            while (changes.size() > 10) {
                changes.remove(0);
            }
        }
        return new Message(message);
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
class Change {
    private Date timestamp = new Date();
    private String user;
    private String message;

    Change() {
    }

    public Change(String user, String message) {
        this.user = user;
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }
}