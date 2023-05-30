package com.dwiauliaanugerah_202102359.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://sitecore-cd-imgr.shangri-la.com/MediaFiles/4/9/D/%7B49D43707-D479-41C3-BC58-83C1DAFA400E%7D200805_SEN_Tropical_Family_Escapade.jpg?w=600&h=500&mode=crop&scale=both.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);

    }
}