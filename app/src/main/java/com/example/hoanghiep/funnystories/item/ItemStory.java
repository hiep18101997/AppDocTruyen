package com.example.hoanghiep.funnystories.item;

import java.io.Serializable;

/**
 * Created by Hoang Hiep on 1/15/2017.
 */

public class ItemStory implements Serializable {
    private String title;
    private String content;
    private int id;

    public ItemStory(String title, String content,int id) {
        this.title = title;
        this.content = content;
        this.id=id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }
}
