package main.classes;

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
}
