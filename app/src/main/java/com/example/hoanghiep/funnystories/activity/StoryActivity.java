package com.example.hoanghiep.funnystories.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.hoanghiep.funnystories.R;
import com.example.hoanghiep.funnystories.adapter.StoryAdapter;

/**
 * Created by Hoang Hiep on 1/15/2017.
 */

public class StoryActivity extends Activity {
    private RecyclerView recyclerView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        initView();
    }

    private void initView() {
        textView=(TextView) findViewById(R.id.tv_titlestory);
        recyclerView=(RecyclerView)findViewById(R.id.rv_story);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Intent intent=getIntent();
        int i=intent.getIntExtra("ID",0);
        textView.setText(intent.getStringExtra("TITLE"));
        StoryAdapter storyAdapter=new StoryAdapter(this,i);
        recyclerView.setAdapter(storyAdapter);

    }
}
