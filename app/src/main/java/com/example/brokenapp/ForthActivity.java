package com.example.brokenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.brokenapp.R;

public class ForthActivity extends AppCompatActivity {

    private TextView tv_welcome;
    private LinearLayout forthActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        //set forthActivity(Layout) Visible as invisible in xml
        forthActivity = findViewById(R.id.liL_forthActivity);
        forthActivity.setVisibility(View.VISIBLE);


        //hard coded string
        setTitle(getString(R.string.forth_activity));

        //set tv_forthActivity(TextView) visibility to visible

        tv_welcome = findViewById(R.id.tv_forthActivity);
        tv_welcome.setVisibility(View.VISIBLE);
    }
}
