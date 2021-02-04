package com.example.baseactivitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onClickTwo(View view) {
        startActivity(new Intent(this,Main2Activity.class));
    }

    public void onClickOne(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}
