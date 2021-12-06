package com.example.admincollegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.widget.EditText username = (android.widget.EditText) findViewById(R.id.editText1);
        android.widget.EditText password = (android.widget.EditText) findViewById(R.id.editText2);

        public void login(){
            if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {

                //correct password
                System.out.println("Correct Password ! ");
            } else {
                //wrong password
                System.out.println("Incorrect Password ! ");
            }
    }
}