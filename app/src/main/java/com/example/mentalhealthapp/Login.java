package com.example.mentalhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener
{
    EditText et_name, et_age, et_contact;
    Button submit;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_name= findViewById(R.id.Enter_name);
        et_age= findViewById(R.id.Enter_age);
        et_contact= findViewById(R.id.Emergency_contact);
        submit= findViewById(R.id.submit);

        et_name.setOnClickListener(this);
        et_age.setOnClickListener(this);
        et_contact.setOnClickListener(this);
        submit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()== R.id.submit)
        {
            Intent tomenu= new Intent(Login.this, MainMenu.class);
            name= et_name.getText().toString();
            tomenu.putExtra("Name",name);
            startActivity(tomenu);
        }
    }
}
