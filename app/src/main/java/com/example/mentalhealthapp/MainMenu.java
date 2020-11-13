package com.example.mentalhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity implements View.OnClickListener
{
    String welcome_name;
    TextView welcome;
    Button feelings, resources,diary,health, goals,motivation,spiritual,play,music,edit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        welcome_name= getIntent().getExtras().getString("Name");

        welcome= findViewById(R.id.tv_welcome);
        welcome.setText("Welcome "+ welcome_name);

        feelings= findViewById(R.id.track_feelings);
        resources= findViewById(R.id.help_resources);
        diary= findViewById(R.id.positivity_diary);
        health= findViewById(R.id.health);
        goals= findViewById(R.id.goals);
        motivation= findViewById(R.id.motivation);
        spiritual= findViewById(R.id.spiritual);
        play= findViewById(R.id.tapToPlay);
        music= findViewById(R.id.music);
        edit= findViewById(R.id.edit_profile);

        feelings.setOnClickListener(this);
        resources.setOnClickListener(this);
        diary.setOnClickListener(this);
        health.setOnClickListener(this);
        goals.setOnClickListener(this);
        motivation.setOnClickListener(this);
        spiritual.setOnClickListener(this);
        play.setOnClickListener(this);
        music.setOnClickListener(this);
        edit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.track_feelings:
                Intent tf= new Intent(MainMenu.this, TrackYourFeelings.class);
                startActivity(tf);
                break;
            case R.id.help_resources:
                Intent hr= new Intent(MainMenu.this, HelpResources.class);
                startActivity(hr);
                break;
            case R.id.positivity_diary:
                Intent pd= new Intent(MainMenu.this, PositivityDiary.class);
                startActivity(pd);
                break;
            case R.id.health:
                Intent h= new Intent(MainMenu.this, Health.class);
                startActivity(h);
                break;
            case R.id.goals:
                Intent g= new Intent(MainMenu.this, Goal.class);
                startActivity(g);
                break;
            case R.id.spiritual:
                Intent s= new Intent(MainMenu.this, Spiritual.class);
                startActivity(s);
                break;
            case R.id.tapToPlay:
                Intent tp= new Intent(MainMenu.this, TapToPlay.class);
                startActivity(tp);
                break;
            case R.id.music:
                Intent m= new Intent(MainMenu.this, Music.class);
                startActivity(m);
                break;
            case R.id.edit_profile:
                Intent ep= new Intent(MainMenu.this, Login.class);
                startActivity(ep);
                break;
        }
    }
}
