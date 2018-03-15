package com.example.pradhyumna.tictactoe;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class frontpage extends AppCompatActivity {
Handler mhandler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);
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
