package com.example.pradhyumna.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class selectpage extends AppCompatActivity {
Button btn1,btn2;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectpage);
        tv=findViewById(R.id.tv);
        btn1 = findViewById(R.id.playb);
        btn2=findViewById(R.id.exitb);

        Animation an= AnimationUtils.loadAnimation(selectpage.this , R.anim.text);

        btn1.startAnimation(an);
        btn2.startAnimation(an);
        tv.startAnimation(an);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ip= new Intent(selectpage.this , gamepage.class);
                startActivity(ip);
                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}
