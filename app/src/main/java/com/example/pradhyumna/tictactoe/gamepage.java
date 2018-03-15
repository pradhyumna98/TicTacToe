package com.example.pradhyumna.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class gamepage extends AppCompatActivity {
    int turn;
    int score1;
    int score2;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,xb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamepage);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        xb=findViewById(R.id.xb);
        turn=1;
        xb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(b1.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        turn=2;
                        b1.setText("O");
                    }
                    else if(turn == 2)
                    {
                        turn=1;
                        b1.setText("X");
                    }
                }
                endgame();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b2.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        turn=2;
                        b2.setText("O");
                    }
                    else if(turn == 2)
                    {
                        turn=1;
                        b2.setText("X");
                    }
                }
                endgame();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b3.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        turn=2;
                        b3.setText("O");
                    }
                    else if(turn == 2)
                    {
                        turn=1;
                        b3.setText("X");
                    }

                }
                endgame();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b4.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        turn=2;
                        b4.setText("O");
                    }
                    else if(turn == 2)
                    {
                        turn=1;
                        b4.setText("X");
                    }
                }
                endgame();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b5.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        turn=2;
                        b5.setText("O");
                    }
                    else if(turn == 2)
                    {
                        turn=1;
                        b5.setText("X");
                    }
                }
                endgame();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b6.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        turn=2;
                        b6.setText("O");
                    }
                    else if(turn == 2)
                    {
                        turn=1;
                        b6.setText("X");
                    }
                }
                endgame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b7.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        turn=2;
                        b7.setText("O");
                    }
                    else if(turn == 2)
                    {
                        turn=1;
                        b7.setText("X");
                    }
                }
                endgame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b8.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        turn=2;
                        b8.setText("O");
                    }
                    else if(turn == 2)
                    {
                        turn=1;
                        b8.setText("X");
                    }
                }
                endgame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b9.getText().toString().equals(""))
                {
                    if(turn == 1)
                    {
                        turn=2;
                        b9.setText("O");
                    }
                    else if(turn == 2)
                    {
                        turn=1;
                        b9.setText("X");
                    }
                }
                endgame();

            }
        });
    }
public void endgame(){
        Boolean end=false;
        String a,b,c,d,e,f,g,h,i;
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        if(a.equals("X") && b.equals("X") && c.equals("X"))
        {
            Toast.makeText(gamepage.this, "Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(a.equals("X") && d.equals("X") && g.equals("X"))
        {
        Toast.makeText(gamepage.this, "Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(a.equals("X")&& e.equals("X") && i.equals("X"))
        {
        Toast.makeText(gamepage.this, "Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(b.equals("X")&& e.equals("X") && h.equals("X"))
    {
        Toast.makeText(gamepage.this, "Winner Player X",Toast.LENGTH_LONG).show();
        end=true;
    }
    else if(c.equals("X")&& f.equals("X") && i.equals("X"))
    {
        Toast.makeText(gamepage.this, "Winner Player X",Toast.LENGTH_LONG).show();
        end=true;
    }
    else if(d.equals("X")&& e.equals("X") && f.equals("X"))
    {
        Toast.makeText(gamepage.this, "Winner Player X",Toast.LENGTH_LONG).show();
        end=true;
    }
    else if(g.equals("X")&& h.equals("X") && i.equals("X"))
    {
        Toast.makeText(gamepage.this, "Winner Player X",Toast.LENGTH_LONG).show();
        end=true;
    }
    else if(c.equals("X")&& e.equals("X") && g.equals("X"))
    {
        Toast.makeText(gamepage.this, "Winner Player X",Toast.LENGTH_LONG).show();
        end=true;
    }
    else if(a.equals("O") && b.equals("O") && c.equals("O"))
    {
        Toast.makeText(gamepage.this, "Winner Player O",Toast.LENGTH_LONG).show();
        end=true;
    }
    else if(a.equals("O") && d.equals("O") && g.equals("O"))
    {
        Toast.makeText(gamepage.this, "Winner Player O",Toast.LENGTH_LONG).show();
        end=true;
    }
    else if(a.equals("O")&& e.equals("O") && i.equals("O"))
    {
        Toast.makeText(gamepage.this, "Winner Player O",Toast.LENGTH_LONG).show();
        end=true;
    }
    else if(b.equals("O")&& e.equals("O") && h.equals("O"))
    {
        Toast.makeText(gamepage.this, "Winner Player O",Toast.LENGTH_LONG).show();
        end=true;
    }
    else if(c.equals("O")&& f.equals("O") && i.equals("O"))
    {
        Toast.makeText(gamepage.this, "Winner Player O",Toast.LENGTH_LONG).show();
        end=true;
    }
    else if(d.equals("O")&& e.equals("O") && f.equals("O"))
    {
        Toast.makeText(gamepage.this, "Winner Player O",Toast.LENGTH_LONG).show();
        end=true;
    }
    else if(g.equals("O")&& h.equals("O") && i.equals("O"))
    {
        Toast.makeText(gamepage.this, "Winner Player O",Toast.LENGTH_LONG).show();
        end=true;
    }
    else if(c.equals("O")&& e.equals("O") && g.equals("O"))
    {
        Toast.makeText(gamepage.this, "Winner Player O",Toast.LENGTH_LONG).show();
        end=true;
    }

   if(end)
   {
    b1.setEnabled(false);
    b2.setEnabled(false);
    b3.setEnabled(false);
    b4.setEnabled(false);
    b5.setEnabled(false);
    b6.setEnabled(false);
    b7.setEnabled(false);
    b8.setEnabled(false);
    b9.setEnabled(false);
       Intent ir=new Intent(gamepage.this , gamepage.class);
       startActivity(ir);
       finish();
}
}}

