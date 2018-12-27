package com.dev.tannie.hellogridviwe;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter (Context c){
        mContext = c;
    }
    public int getCount(){
        return  mThumIds.length;
    }
    public Object getItem(int position){
        return null;
    }
    public long getItemId(int position){
        return 0;
    }

    public View getView(int position, View convertViwe, ViewGroup parent) {
        ImageView imageView;
        if (convertViwe == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams( 300,300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertViwe;
        }
        imageView.setImageResource(mThumIds[position]);
        return imageView;
    }
    private Integer[]mThumIds ={
            R.drawable.sample_0,R.drawable.sample_5,
            R.drawable.sample_1,R.drawable.sample_6,
            R.drawable.sample_2,R.drawable.sample_7,
            R.drawable.sample_3,R.drawable.sample_4
    };


}
