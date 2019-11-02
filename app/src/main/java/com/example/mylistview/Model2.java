package com.example.mylistview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Model2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listView = findViewById(R.id.listview);
        ArrayList list=new ArrayList();
        for (int i=0; i<50;i++){
            list.add("NAME - "+i);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(Model2.this,R.layout.activity_os_name,R.id.textView,list);
        listView.setAdapter(arrayAdapter);
    }
}
