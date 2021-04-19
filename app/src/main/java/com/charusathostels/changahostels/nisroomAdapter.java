package com.charusathostels.changahostels;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class nisroomAdapter extends PagerAdapter {

    private Context mContext;
    private int[] mImageIds= new int[] {R.drawable.nisroom1,R.drawable.nisroom2};

    nisroomAdapter (Context context){
        mContext=context;
    }


    @Override
    public int getCount() {
        return mImageIds.length;
    }

    public boolean isViewFromObject(View view, Object object){
        return view==object;
    }
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView=new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }

}
