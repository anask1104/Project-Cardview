package com.anask1104gmail.projectview;

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

import java.io.ByteArrayInputStream;

public class DetailActivity extends AppCompatActivity {


    TextView title_tv, desc_tv,date_tv;
    ImageView image_iv;
    Bitmap bmp;


    Bitmap convert(byte[] bitmapdata)

    {
        //copy that code for converting byte array to bitmap here
        return BitmapFactory.decodeByteArray(bitmapdata, 0, bitmapdata.length);


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

       byte[] b=getIntent().getBundleExtra("bundle").getByteArray("image");
        Log.d("image is-",""+b);
        image_iv.setImageBitmap(convert(b));




        title_tv.setText(titleString);
        desc_tv.setText(desc);
        date_tv.setText(date);




    }
}
