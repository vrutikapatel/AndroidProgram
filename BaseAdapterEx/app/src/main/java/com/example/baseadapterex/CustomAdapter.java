package com.example.baseadapterex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int flags[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, int[] flags) {
        this.context=applicationContext;
        this.flags=flags;
        inflater=(LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return flags.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.activity_gridview,null);
        ImageView imageView=(ImageView) view.findViewById(R.id.img);
        imageView.setImageResource(flags[i]);
        return view;
    }
}
