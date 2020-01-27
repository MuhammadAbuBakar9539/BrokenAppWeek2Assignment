package com.example.brokenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {
    private TextView tvNameFromMain;
    private Button btnGotoThirdActivity;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // tvNameFromMain was not assigned.
        tvNameFromMain = findViewById(R.id.tv_secondActivity);

        btnGotoThirdActivity = findViewById(R.id.btn_activitySecond);

        //hard coded string
        setTitle(getString(R.string.second_activity));

        //wrong key value entered (case sensitive) because of hard coded
        name = getIntent().getStringExtra(MainActivity.KEY_NAME);

        tvNameFromMain.setText(name);

        btnGotoThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);

                startActivity(intent);
            }
        });


    }
}
