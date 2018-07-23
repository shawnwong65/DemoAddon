package com.example.a16022774.demoaddon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.jsibbold.zoomage.ZoomageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    ZoomageView zv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.iv);
        zv = (ZoomageView) findViewById(R.id.myZoomageView);

        String imageUrl = "http://square.github.io/picasso/static/sample.png";
        Picasso.with(this).load(imageUrl).into(iv);

    }
}
