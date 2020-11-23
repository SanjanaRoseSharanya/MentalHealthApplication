package com.example.mentalhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;
//sanjana was here


//sanjana came back
public class MainActivity extends AppCompatActivity
{
    Timer timer;
    String ifName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ifName= getIntent().getExtras().getString("Name");

        timer= new Timer();
        timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                //if(ifName.equals(""))
                {
                    Intent I1 = new Intent(MainActivity.this, Login.class);
                    startActivity(I1);
                    finish();
                }
//                else
//                {
//                    Intent I2 = new Intent(MainActivity.this, MainMenu.class);
//                    startActivity(I2);
//                    finish();
//                }
            }
        },1000);

    }
}

