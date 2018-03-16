package com.example.pradhyumna.tictactoe;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class frontpage extends AppCompatActivity {
Handler mhandler=new Handler();
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);

        img = findViewById(R.id.img);
        Animation ani= AnimationUtils.loadAnimation(frontpage.this , R.anim.logo);
        img.startAnimation(ani);

        mhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(frontpage.this , selectpage.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}
