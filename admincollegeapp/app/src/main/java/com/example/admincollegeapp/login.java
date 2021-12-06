package com.example.admincollegeapp;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class login {
    Button b1,b2;
    EditText ed1,ed2;

    TextView tx1;
    int counter = 3;
    protected void onCreate(Bundle savedInstanceState) {
        onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        b1 = (Button)b1.findViewById(R.id.button1);
        ed1 = (EditText)tx1.findViewById(R.id.editText1);
        ed2 = (EditText)tx1.findViewById(R.id.editText2);

        b2 = (Button)b2.findViewById(R.id.login_btn);
        tx1 = (TextView)tx1.findViewById(R.id.account);
        tx1.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(v.getContext().getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(v.getContext().getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                            tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        b1.setEnabled(false);
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setOnClickListener(View.OnClickListener(v)).finish();
            }
        });
    }
}
