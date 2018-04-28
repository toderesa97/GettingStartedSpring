package main.classes;

import java.util.Objects;

public class Topic {

    private String topicName;
    private String desc;

    public Topic () {

    }

    public Topic(String topicName, String desc) {
        this.topicName = topicName;
        this.desc = desc;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return Objects.equals(getTopicName(), topic.getTopicName()) &&
                Objects.equals(getDesc(), topic.getDesc());
    }
}
