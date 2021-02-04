package com.example.baseactivitytest;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Time: 2021/2/4
 * Author: baipenggui
 * Description:
 */
public abstract class BaseActivity extends AppCompatActivity {
    @BindView(R.id.map_tv)
    public TextView map_tv;
    @BindView(R.id.main_tv)
    public TextView main_tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        StatusBarHelper.setTransparent(this);
        super.onCreate(savedInstanceState);
        setContentView(initLayoutId());
        ButterKnife.bind(this);
        map_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BaseActivity.this, "公共触发事件", Toast.LENGTH_SHORT).show();
            }
        });
        initView();
    }
    protected abstract void initView();
    @Override
    protected void onStart() {
        super.onStart();


    }

    protected abstract int initLayoutId();

}
