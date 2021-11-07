package com.example.pkeduuiit18_arid_2580umer_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.microedition.khronos.egl.EGLDisplay;

public class loginactivity extends AppCompatActivity {
    Button login,signup,q1;
    EditText Username, Password;
    Databaseclass data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        initialize();
        Buttonfunctions();

    }

    private void Buttonfunctions(){
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginactivity.this,MainActivity.class));
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor username= data.login(Username.getText().toString(),Password.getText().toString());
                if(username.getCount()>0){
                    startActivity(new Intent(loginactivity.this,useractivity.class));
                }
                else {
                    Toast.makeText(loginactivity.this,"Username or password does not exist",Toast.LENGTH_SHORT).show();
                }
            }
        });
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginactivity.this,Q1.class));
            }
        });

    }
    private void initialize(){
        signup=(Button) findViewById(R.id.signup);
        login=(Button)findViewById(R.id.login);
        Username=(EditText)findViewById(R.id.edittext1);
        Password=(EditText)findViewById(R.id.edittext2);
        data= new Databaseclass(this);
        q1=(Button)findViewById(R.id.q1);
    }
}