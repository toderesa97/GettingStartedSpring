package main.controllers;

import main.classes.Topic;
import main.classes.TopicService;
import main.errorHandler.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{topic_name}")
    public Topic getTopic (@PathVariable("topic_name") String topicName) {
        return topicService.getTopic(topicName);
    }

    @RequestMapping(method=RequestMethod.POST, value="/topics")
    public Response addTopic (@RequestBody Topic topic) {
        // repeated topics are not allowed
        if (topicService.addTopic(topic)) {
            return new Response(201, "Created");
        } else {
            return new Response(401, "Unauthorized");
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{tn}")
    public Response updateTopic(@RequestBody Topic topic, @PathVariable("tn") String topicName) {
        if (topicService.updateTopic(topicName, topic)) {
            return new Response(200, "OK");
        } else {
            return new Response(400, "Bad Request: No topic name found");
        }
    }

}
