package main.classes;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    // using singleton pattern by adding Service annotation
    private List<Topic> topics = Arrays.asList(new Topic("T1", "Topic1"),
                            new Topic("T2", "Topic2"));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(final String topicName) {
        return topics.stream().filter(tp -> tp.getTopicName().equals(topicName)).findFirst().orElse(null);
    }
}
