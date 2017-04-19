package com.example.hoanghiep.funnystories.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hoanghiep.funnystories.item.ItemTopic;
import com.example.hoanghiep.funnystories.R;
import com.example.hoanghiep.funnystories.activity.StoryActivity;

import java.util.ArrayList;

/**
 * Created by Hoang Hiep on 1/15/2017.
 */

public class TopicAdapter extends RecyclerView.Adapter {
    private Context mContext;
    private ArrayList<ItemTopic> topics;

    public TopicAdapter(Context context) {
        mContext = context;
        initData();
    }

    private void initData() {
        topics = new ArrayList<>();

        topics.add(new ItemTopic("Con gái",R.drawable.congai,1));
        topics.add(new ItemTopic("Con trai", R.drawable.contrai,2));
        topics.add(new ItemTopic("Công nghệ", R.drawable.congnghe,3));
        topics.add(new ItemTopic("Dân gian", R.drawable.dangian,4));
        topics.add(new ItemTopic("Danh nhân", R.drawable.danhnhan,5));
        topics.add(new ItemTopic("Gia đình", R.drawable.giadinh,6));
        topics.add(new ItemTopic("Giao thông", R.drawable.giaothong,7));
        topics.add(new ItemTopic("Học đường", R.drawable.hocduong,8));
        topics.add(new ItemTopic("Khoa học", R.drawable.khoahoc,9));
        topics.add(new ItemTopic("Tình yêu", R.drawable.tinhyeu,10));

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemTopic = View.inflate(mContext, R.layout.item_topic, null);
        RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT);
        params.setMargins(16,10,16,10);
        itemTopic.setLayoutParams(params);
        return new Holder(itemTopic);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Holder itemTopic= (Holder)holder;
        itemTopic.imageView.setImageResource(topics.get(position).getImage());
        itemTopic.textView.setText(topics.get(position).getTopic());
        itemTopic.textView.setId(topics.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }

    class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView imageView;
        private TextView textView;

        public Holder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv_topic);
            textView = (TextView) itemView.findViewById(R.id.tv_topic);
            textView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent=new Intent(mContext,StoryActivity.class);
            intent.putExtra("TITLE",topics.get(v.getId()-1).getTopic());
            switch (v.getId()){
                case 1:
                    intent.putExtra("ID",1);
                    break;
                case 2:
                    intent.putExtra("ID",2);
                    break;
                case 3:
                    intent.putExtra("ID",3);
                    break;
                case 4:
                    intent.putExtra("ID",4);
                    break;
                case 5:
                    intent.putExtra("ID",5);
                    break;
                case 6:
                    intent.putExtra("ID",6);
                    break;
                case 7:
                    intent.putExtra("ID",7);
                    break;
                case 8:
                    intent.putExtra("ID",8);
                    break;
                case 9:
                    intent.putExtra("ID",9);
                    break;
                case 10:
                    intent.putExtra("ID",10);
                    break;
            }
            mContext.startActivity(intent);

        }
    }
}
