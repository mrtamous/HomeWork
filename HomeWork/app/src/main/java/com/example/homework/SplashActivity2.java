package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SplashActivity2 extends AppCompatActivity {
TextView SplashNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        SplashNext=findViewById(R.id.Splash_Next);
        Thread thread=new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    sleep(5*1000);

                    Intent intent=new Intent(SplashActivity2.this, Login.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e){

                }

            }
        }; thread.start();

        SplashNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashActivity2.this,Login.class);
                startActivity(intent);
            }
        });


    }
}