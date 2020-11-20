package com.example.mentalhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.sql.Types.NULL;

public class Login extends AppCompatActivity implements View.OnClickListener
{
    EditText et_name, et_age, et_contact;
    Button submit;
    String name, age, contact;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_name= findViewById(R.id.Enter_name);
        et_age= findViewById(R.id.Enter_age);
        et_contact= findViewById(R.id.Emergency_contact);
        submit= findViewById(R.id.submit);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        name= et_name.getText().toString();
        age= et_age.getText().toString();
        contact= et_contact.getText().toString();
        Log.d("tag", "name is : "+name);
        Log.d("tag", "age is : "+age);
        Log.d("tag", "contact is : "+contact);
        if(v.getId()== R.id.submit && !name.equals("") && !age.equals("") && !contact.equals(""))
        {
            Intent tomenu= new Intent(Login.this, MainMenu.class);
            tomenu.putExtra("Name",name);
            startActivity(tomenu);
        }

        if (v.getId()==R.id.submit && (name.equals("")|| age.equals("")|| contact.equals("")))
        {
            openDialog();
        }
    }

    private void openDialog()
    {
        dialogBox dBox= new dialogBox();
        dBox.show(getSupportFragmentManager(), "dialog");
    }
}
