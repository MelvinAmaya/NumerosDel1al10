package com.example.numerosdel1al10;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_Numero extends AppCompatActivity {
    public ImageButton n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
    public ImageView back;
    public TextView tiulo;
    MediaPlayer numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_numero);
        n1 = (ImageButton) findViewById(R.id.ib_1);
        n2 = (ImageButton) findViewById(R.id.ib_2);
        n3 = (ImageButton) findViewById(R.id.ib_3);
        n4 = (ImageButton) findViewById(R.id.ib_4);
        n5 = (ImageButton) findViewById(R.id.ib_5);
        n6 = (ImageButton) findViewById(R.id.ib_6);
        n7 = (ImageButton) findViewById(R.id.ib_7);
        n8 = (ImageButton) findViewById(R.id.ib_8);
        n9 = (ImageButton) findViewById(R.id.ib_9);
        n10 = (ImageButton) findViewById(R.id.ib_10);
        back = (ImageView) findViewById(R.id.btnatras);
        tiulo = (TextView) findViewById(R.id.toolbar_title);
        tiulo.setText("LEARNINGNUMBER");

        numero=null;

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero ==null)
                {
                    numero =MediaPlayer.create(getApplicationContext(),R.raw.uno);
                    numero.start();
                }
                else
                {
                    numero.pause();
                    numero.release();
                    numero=null;
                    numero =MediaPlayer.create(getApplicationContext(),R.raw.uno);
                    numero.start();
                }
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero ==null)
                {
                    numero =MediaPlayer.create(getApplicationContext(),R.raw.dos);
                    numero.start();
                }
                else
                {
                    numero.pause();
                    numero.release();
                    numero=null;
                    numero =MediaPlayer.create(getApplicationContext(),R.raw.dos);
                    numero.start();
                }
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero ==null)
                {
                    numero =MediaPlayer.create(getApplicationContext(),R.raw.tres);
                    numero.start();
                }
                else
                {
                    numero.pause();
                    numero.release();
                    numero=null;
                    numero =MediaPlayer.create(getApplicationContext(),R.raw.tres);
                    numero.start();
                }
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero ==null)
                {
                    numero =MediaPlayer.create(getApplicationContext(),R.raw.cuatro);
                    numero.start();
                }
                else
                {
                    numero.pause();
                    numero.release();
                    numero=null;
                    numero =MediaPlayer.create(getApplicationContext(),R.raw.cuatro);
                    numero.start();
                }
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero ==null)
                {
                    numero =MediaPlayer.create(getApplicationContext(),R.raw.cinco);
                    numero.start();
                }
                else
                {
                    numero.pause();
                    numero.release();
                    numero=null;
                    numero =MediaPlayer.create(getApplicationContext(),R.raw.cinco);
                    numero.start();
                }
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero ==null)
                {
                    numero =MediaPlayer.create(getApplicationContext(),R.raw.seis);
                    numero.start();
                }
                else
                {
                    numero.pause();
                    numero.release();
                    numero=null;
                    numero =MediaPlayer.create(getApplicationContext(),R.raw.seis);
                    numero.start();
                }
            }
        });

       n7.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(numero ==null)
               {
                   numero =MediaPlayer.create(getApplicationContext(),R.raw.siete);
                   numero.start();
               }
               else
               {
                   numero.pause();
                   numero.release();
                   numero=null;
                   numero =MediaPlayer.create(getApplicationContext(),R.raw.siete);
                   numero.start();
               }
           }
       });

       n8.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(numero ==null)
               {
                   numero =MediaPlayer.create(getApplicationContext(),R.raw.ocho);
                   numero.start();
               }
               else
               {
                   numero.pause();
                   numero.release();
                   numero=null;
                   numero =MediaPlayer.create(getApplicationContext(),R.raw.ocho);
                   numero.start();
               }
           }
       });

       n9.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(numero ==null)
               {
                   numero =MediaPlayer.create(getApplicationContext(),R.raw.nueve);
                   numero.start();
               }
               else
               {
                   numero.pause();
                   numero.release();
                   numero=null;
                   numero =MediaPlayer.create(getApplicationContext(),R.raw.nueve);
                   numero.start();
               }
           }
       });

       n10.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(numero ==null)
               {
                   numero =MediaPlayer.create(getApplicationContext(),R.raw.diez);
                   numero.start();
               }
               else
               {
                   numero.pause();
                   numero.release();
                   numero=null;
                   numero =MediaPlayer.create(getApplicationContext(),R.raw.diez );
                   numero.start();
               }
           }
       });

       back.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });




    }
}