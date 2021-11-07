package com.example.pkeduuiit18_arid_2580umer_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etusername, etemail,etpassword;
    Button btnLogin,btnsignup;
    RadioButton radio0,radio1;
    Databaseclass databaseclass;
    CheckBox checkbox1,checkbox2,checkbox3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        Buttonfunctions();
        //login();
    }
    private void Buttonfunctions()
    {
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gender,subject="";
                if(radio0.isChecked()){
                    gender="male";
                }
                else{
                    gender="Female";
                }
                if(checkbox1.isChecked())
                {subject=subject+"Android development";
                }
                if (checkbox2.isChecked())
                {
                    subject=subject+"system programming";
                }
                if(checkbox3.isChecked()){
                    subject=subject+"parallel computing";
                }
                long user_data =databaseclass.signup(etusername.getText().toString(),etpassword.getText().toString(),etemail.getText().toString(),gender,subject);
                if(user_data==-1)
                {
                    Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Data saved successfully",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,loginactivity.class));
            }
        });
    }
    private void initialize(){
        databaseclass =new Databaseclass(this);
        btnLogin=(Button) findViewById(R.id.btnLogin);
        btnsignup=(Button) findViewById(R.id.btnsignup);
        etusername=(EditText) findViewById(R.id.edittext1);
        etemail=(EditText) findViewById(R.id.edittext2);
        etpassword=(EditText) findViewById(R.id.edittext3);
        radio0=(RadioButton)findViewById(R.id.radio0);
        radio1=(RadioButton)findViewById(R.id.radio1);
        checkbox1=(CheckBox) findViewById(R.id.checkbox1);
        checkbox2=(CheckBox)findViewById(R.id.checkbox2);
        checkbox3=(CheckBox)findViewById(R.id.checkbox3);


    }
}