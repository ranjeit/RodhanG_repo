package com.jobchahiye.kya.dto;

public class LessonRequest {

    private String topic;
    private String category;

    public LessonRequest() {
    }

    public LessonRequest(String topic, String category) {
        this.topic = topic;
        this.category = category;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}