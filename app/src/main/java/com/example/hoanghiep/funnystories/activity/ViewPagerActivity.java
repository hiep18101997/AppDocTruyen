package com.example.hoanghiep.funnystories.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.example.hoanghiep.funnystories.R;
import com.example.hoanghiep.funnystories.adapter.ViewPagerAdapter;
import com.example.hoanghiep.funnystories.item.ItemStory;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;

/**
 * Created by Hoang Hiep on 1/16/2017.
 */

public class ViewPagerActivity extends Activity implements ViewPager.OnPageChangeListener {
    private ViewPager viewPager;
    private TextView textView;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        initView();

    }

    private void initView() {
        textView = (TextView) findViewById(R.id.tv_vp);
        viewPager = (ViewPager) findViewById(R.id.vp_story);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("DATA");
        int i = bundle.getInt("ID");
        viewPagerAdapter = new ViewPagerAdapter((ArrayList<ItemStory>) bundle.getSerializable("STORIES"), this);
        viewPager.setAdapter(viewPagerAdapter);
        textView.setText((String) viewPagerAdapter.getPageTitle(0));
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) findViewById(R.id.indicator);
        circlePageIndicator.setViewPager(viewPager);
        circlePageIndicator.setFillColor(Color.GRAY);
        circlePageIndicator.setRadius(15);
        circlePageIndicator.setOnPageChangeListener(this);
        viewPager.setCurrentItem(i - 1);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        textView.setText(viewPagerAdapter.getPageTitle(position));
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
