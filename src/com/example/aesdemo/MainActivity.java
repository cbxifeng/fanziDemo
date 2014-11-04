
package com.example.aesdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.aesdemo.TestAdapter.TestListener;
import com.vtion.aes.AES;

public class MainActivity extends Activity implements TestListener {
    
    TestAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mAdapter = new TestAdapter();
        mAdapter.setLisnener(this);
    }

    @Override
    public void onClickListener() {
        // TODO Auto-generated method stub
        
    }
}
