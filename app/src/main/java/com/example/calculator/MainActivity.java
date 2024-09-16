package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button exitButton = (Button) findViewById(R.id.exitButton);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        Button aboutButton = (Button)findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openaboutActivity();
            }
        });

        Button simpleButton = (Button) findViewById(R.id.simpleButton);
        simpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSimpleActivity();
            }
        });

        Button advancedButton = (Button) findViewById(R.id.advancedButton);
        advancedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdvancedActivity();
            }
        });


    }



    public void openaboutActivity(){
        Intent intent = new Intent(this,aboutActivity.class);
        startActivity(intent);
    }

    public void openSimpleActivity(){
        Intent intent = new Intent(this,SimpleActivity.class);
        startActivity(intent);
    }

    public void openAdvancedActivity(){
        Intent intent = new Intent(this,advanced.class);
        startActivity(intent);
    }




}