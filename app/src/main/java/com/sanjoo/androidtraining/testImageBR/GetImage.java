package com.sanjoo.androidtraining.testImageBR;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.sanjoo.androidtraining.R;

public class GetImage extends AppCompatActivity {
    ImageView imageView;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_get_image);
//
//        imageView=findViewById(R.id.image_BR);
//
//        Intent intent=getIntent();
//        sendBroadcast(new Intent("TEST_ACTION"));
//
//        String action=intent.getAction();
//        String type=intent.getType();
//
//        if(Intent.ACTION_SEND.equals(action) && type!=null){
//            imageView.setImageURI(intent.getParcelableExtra(Intent.EXTRA_STREAM));
//        }
//    }
}