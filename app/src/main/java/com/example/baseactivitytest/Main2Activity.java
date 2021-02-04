package com.example.baseactivitytest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends BaseActivity {



    @Override
    protected int initLayoutId() {
        return R.layout.activity_main2;
    }

    int count = 0;
    private Handler handler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);

            switch (msg.what) {
                case 1111:
                    count++;
                    main_tv.setText("TWO:\n"+count);
                    handler.sendEmptyMessageDelayed(1111, 1000);

                    break;
            }
        }


    };


    @BindView(R.id.click_btn)
    Button clickbtn;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (handler != null) {
            handler.removeMessages(1111);
        }

    }

    @Override
    protected void initView() {
        handler.sendEmptyMessage(1111);
        clickbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this, "TWO-ACTIVITY_BTN", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
