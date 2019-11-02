package com.example.mylistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Model1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listView = findViewById(R.id.listview);
        String[] name_os = {"Android","Ios","Windows","Linux","ChromeOS"};
        final ArrayAdapter arrayAdapter = new ArrayAdapter(Model1.this,R.layout.activity_os_name,R.id.textView,name_os);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"Cliked:"+arrayAdapter.getItem(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}