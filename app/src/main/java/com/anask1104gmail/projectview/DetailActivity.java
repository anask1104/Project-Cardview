package com.anask1104gmail.projectview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.ByteArrayInputStream;

public class DetailActivity extends AppCompatActivity {


    TextView title_tv, desc_tv,date_tv;
    ImageView image_iv;
    Bitmap bmp;


    public void setImage(String image,ImageView imageView){

        Picasso.with(DetailActivity.this).load(image).into(imageView);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d("image","activity created");


        title_tv=(TextView) findViewById(R.id.title_tv);
        desc_tv=(TextView) findViewById(R.id.desc_tv);
        image_iv=(ImageView)findViewById(R.id.image_iv);
        date_tv=(TextView)findViewById(R.id.date_tv);
        Bundle title_data = getIntent().getExtras();

        String titleString=title_data.get("title").toString();
        String desc=title_data.get("description").toString();
        String date=title_data.get("date").toString();
        setImage(getIntent().getStringExtra("image"),image_iv);




        title_tv.setText(titleString);
        desc_tv.setText(desc);
        date_tv.setText(date);




    }
}
