package com.example.brokenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ThirdActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private Button btnDismissProgress, btnToNextActivity;
    private Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set Content view
        setContentView(R.layout.activity_third);
        //hard coded string
        setTitle(getString(R.string.third_activity));


        progressBar = findViewById(R.id.pb_progress_activityThird);
        btnDismissProgress = findViewById(R.id.btn_third_dismiss);
        handler = new Handler();

        //btnToNextActivity was not assigned correct
        //btnToNextActivity.findViewById(R.id.btn_thirdActivity_next_activity);

        btnToNextActivity = findViewById(R.id.btn_thirdActivity_next_activity);

        btnDismissProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismissProgress();

            }
        });

        btnToNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //wrong intent call
                //Intent intent = new Intent(ThirdActivity.this,ThirdActivity.class);

                Intent intent = new Intent(ThirdActivity.this, ForthActivity.class);
                startActivity(intent);

            }
        });
    }


    private void dismissProgress(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                //use handler to post data in main UI Thread
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);
                    }
                });
            }
        }).start();

    }



}
