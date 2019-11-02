package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Model_1(View v){
        startActivity(new Intent(getApplicationContext(),Model1.class));
    }

    public void Model_2(View v){
        startActivity(new Intent(getApplicationContext(),Model2.class));
    }

    public void Model_3(View v){
        startActivity(new Intent(getApplicationContext(),Model3.class));
    }
}
