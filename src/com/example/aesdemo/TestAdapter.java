package com.example.aesdemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class TestAdapter extends BaseAdapter {

    private TestListener mTestListener;

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        
        //在点击的方法添加
        if(mTestListener != null){
            mTestListener.onClickListener();
        }
        return null;
    }
    
    public void setLisnener(TestListener l){
        mTestListener = l;
    }
    
    public interface TestListener{
        
        /**
         * 点击监听
         */
        public void onClickListener();
    }

}
