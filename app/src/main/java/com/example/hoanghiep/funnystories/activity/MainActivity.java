package com.example.hoanghiep.funnystories.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hoanghiep.funnystories.R;
import com.example.hoanghiep.funnystories.adapter.TopicAdapter;

/**
 * Created by Hoang Hiep on 1/13/2017.
 */

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private RecyclerView menuRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.rv_topic);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        TopicAdapter topicAdapter = new TopicAdapter(this);
        recyclerView.setAdapter(topicAdapter);

        menuRecyclerView = (RecyclerView) findViewById(R.id.menu_topic);
        menuRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        menuRecyclerView.setAdapter(topicAdapter);

    }
}
