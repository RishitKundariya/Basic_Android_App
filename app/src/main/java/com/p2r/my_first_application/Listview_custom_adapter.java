package com.p2r.my_first_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Listview_custom_adapter extends BaseAdapter
{
    ArrayList<Model_demo_Arraylist> list;
    Context contex;
    String[] s;
    Listview_custom_adapter(ArrayList<Model_demo_Arraylist> list, Context contex){
    this.list=list;
    this.contex=contex;
    }
    Listview_custom_adapter(String[] s, Context contex){
        this.s=s;
        this.contex=contex;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= LayoutInflater.from(contex).inflate(R.layout.custom_card_view,null);
        TextView tvText=v.findViewById(R.id.tvText);
        TextView tvHeaderText=v.findViewById(R.id.tvHeaderText);
        ImageView ivprofile_image=v.findViewById(R.id.profile_image);
        tvHeaderText.setText(list.get(position).getHeader_text());
        tvText.setText(list.get(position).getText());
        ivprofile_image.setImageResource(list.get(position).iamge);
//          TextView tvHeaderText=v.findViewById(R.id.tvHeaderText);
//          tvHeaderText.setText(s[position]);
        return v;
    }
}
