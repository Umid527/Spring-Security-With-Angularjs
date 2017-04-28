package org.learn.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


/**
 * Created by umahmudov on 28-Apr-17.
 */

@RestController
public class VanillaController {

    @RequestMapping("/")
    @CrossOrigin(origins="*", maxAge=3600,allowedHeaders={"x-auth-token", "x-requested-with"})
    public Message home() {
        return new Message("Hello kele World ");
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
}
