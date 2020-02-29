package com.example.login.data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.login.R;
import com.example.login.ui.login.LoginActivity;

public class Signin extends AppCompatActivity {
    EditText n,pw,em;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        n=(EditText)findViewById(R.id.editText);
        pw=(EditText)findViewById(R.id.editText3);
        em=(EditText)findViewById(R.id.editText4);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Signin.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}
