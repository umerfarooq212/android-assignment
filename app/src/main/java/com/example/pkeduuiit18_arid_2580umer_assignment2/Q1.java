 package com.example.pkeduuiit18_arid_2580umer_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Q1 extends AppCompatActivity {
Button btn;
ImageButton imgbtn;
EditText et;
TextView tv;
CheckBox cb;
RadioButton rb;
ToggleButton tb;
SeekBar sb;
ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        initialize();
        activity();
    }
    private void activity(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setBackgroundColor(Color.BLUE);
            }
        });
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Q1.this,"Error",Toast.LENGTH_SHORT).show();            }
        });
        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Q1.this,"label is selected",Toast.LENGTH_SHORT).show();
            }
        });
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Q1.this,"checkbox is selected",Toast.LENGTH_SHORT).show();

            }
        });
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Q1.this,"Radio button is selected",Toast.LENGTH_SHORT).show();
            }
        });
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tb.setTextOn(null);
                Toast.makeText(Q1.this,"Toggle button is selected",Toast.LENGTH_SHORT).show();
            }
        });
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Q1.this,"Seek bar is selected",Toast.LENGTH_SHORT).show();
            }
        });
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Q1.this,"Image is selected",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initialize(){
        btn=(Button)findViewById(R.id.btn);
        imgbtn=(ImageButton)findViewById(R.id.imgbtn);
        et=(EditText)findViewById(R.id.et);
        tv=(TextView)findViewById(R.id.tv);
        cb=(CheckBox)findViewById(R.id.cb);
        rb=(RadioButton)findViewById(R.id.rb);
        tb=(ToggleButton)findViewById(R.id.tb);
        sb=(SeekBar)findViewById(R.id.sb);
        im=(ImageView)findViewById(R.id.im);

    }
}