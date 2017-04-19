package com.example.hoanghiep.funnystories.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hoanghiep.funnystories.R;
import com.example.hoanghiep.funnystories.item.ItemStory;

import java.util.ArrayList;

/**
 * Created by Hoang Hiep on 1/16/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {
    private ArrayList<ItemStory> stories;
    private Context mContext;

    public ViewPagerAdapter(ArrayList<ItemStory> stories, Context mContext) {
        this.stories = stories;
        this.mContext = mContext;
        System.out.println(stories.get(0).getContent());
        initData();
    }

    private void initData() {

    }

    @Override
    public int getCount() {
        return stories.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object next) {
        return view==next;
    }

    @Override
    public Object instantiateItem(ViewGroup viewPager, int position) {
        View itemView = View.inflate(mContext, R.layout.item_view, null);
        TextView tvStory = (TextView) itemView.findViewById(R.id.tv_item);
        tvStory.setText(stories.get(position).getContent());
        viewPager.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup viewPager, int position, Object view) {
        viewPager.removeView((View) view);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        System.out.println(stories.get(position).getTitle());
        return stories.get(position).getTitle();
    }
}
