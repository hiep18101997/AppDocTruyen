package com.example.hoanghiep.funnystories.item;

/**
 * Created by Hoang Hiep on 1/15/2017.
 */

public class ItemTopic {
    private String topic;
    private int image;
    private int id;

    public ItemTopic(String topic,int image,int id) {
        this.topic = topic;
        this.image=image;
        this.id=id;
    }

    public String getTopic() {
        return topic;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id;
    }
}
