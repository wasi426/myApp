package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

     private   Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button)findViewById(R.id.signup);
        btn1= findViewById(R.id.login);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openSignup();
            }
        });



    }
    public void openSignup(){
        Intent i= new Intent( MainActivity.this, Signup.class);
        startActivity(i);
    }
    public void openLogin(){
        Intent ii= new Intent( MainActivity.this, Signup.class);
        startActivity(ii);
    }
}