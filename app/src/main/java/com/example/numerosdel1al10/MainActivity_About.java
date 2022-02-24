package com.example.numerosdel1al10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_About extends AppCompatActivity {
    public ImageView regresar;
    public TextView titul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_about);
        regresar = (ImageView) findViewById(R.id.btnatras);
        titul = (TextView) findViewById(R.id.toolbar_title);
        titul.setText("About");
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}