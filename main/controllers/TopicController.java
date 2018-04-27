package main.controllers;

import main.classes.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        // whatever I return is going to convert to JSON.
        return Arrays.asList(new Topic("T1", "Topic1"),
                            new Topic("T2", "Topic2"));
    }

}
