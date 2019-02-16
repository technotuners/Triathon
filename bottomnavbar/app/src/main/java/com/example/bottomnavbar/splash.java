package com.example.bottomnavbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class splash extends AppCompatActivity {

    ImageView bgone;
    Button btnget;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        bgone = (ImageView) findViewById(R.id.bgone);
        btnget = (Button) findViewById(R.id.btnget);

        bgone.animate().scaleX(2).scaleY(2).setDuration(5000).start();
        btnget.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent a = new Intent(splash.this,MainActivity.class);
                startActivity(a);
            }
        });

    }
}
