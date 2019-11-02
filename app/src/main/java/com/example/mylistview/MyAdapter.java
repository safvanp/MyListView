package com.example.mylistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {

    Activity context;
    String[] Name;
    String[] sub_titile;
    int[] images;

    public MyAdapter(Activity context,String[] Name,String[] sub_titile,int[] images){
        super(context,R.layout.mylist,Name);
        this.context=context;
        this.Name=Name;
        this.sub_titile=sub_titile;
        this.images=images;
    }

    public View getView(int position, View v, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.mylist,null,true);

        TextView name;
        TextView sub;
        ImageView image;

        name = view.findViewById(R.id.textView2);
        sub = view.findViewById(R.id.textView3);
        image = view.findViewById(R.id.imageView);

        name.setText(Name[position]);
        sub.setText(sub_titile[position]);
        image.setImageResource(images[position]);

        return view;
    }
}
