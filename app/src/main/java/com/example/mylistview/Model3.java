package com.example.mylistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Model3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        String[] Name = {"FaceBook","Google","Instagram","Twitter","YouTube"};
        String[] Sub = {"FaceBook_Sub","Google_Sub","Instagram_Sub","Twitter_Sub","YouTube_Sub"};
        int[] images = {R.drawable.facebook,R.drawable.google,R.drawable.instagram,R.drawable.twitter,R.drawable.youtube};
        ListView listView = findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(Model3.this,Name,Sub,images);
        listView.setAdapter(myAdapter);
    }
}
