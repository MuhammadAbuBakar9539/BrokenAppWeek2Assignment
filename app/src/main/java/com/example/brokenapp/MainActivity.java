package com.example.brokenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_NAME = "name";
    private EditText nameText;
    private Button goToNextActivity,btnShowToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hard coded string
        setTitle(getString(R.string.main_activity));

        nameText = findViewById(R.id.et_name);
        goToNextActivity = findViewById(R.id.btn_goToSecondActivity);
        btnShowToast = findViewById(R.id.btn_showToast);

        goToNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!nameText.getText().toString().trim().isEmpty()){
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    //hard coded key name
                    intent.putExtra(KEY_NAME, nameText.getText().toString());

                    startActivity(intent);
                }
            }
        });

        btnShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //hard coded string
                Toast.makeText(MainActivity.this, getString(R.string.thanks_for_toast), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
