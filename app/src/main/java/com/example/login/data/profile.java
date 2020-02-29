package com.example.login.data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.login.R;

import org.w3c.dom.Text;

public class profile extends AppCompatActivity {
TextView name,email,city,state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        name=(TextView) findViewById(R.id.textView);
        email=(TextView)findViewById(R.id.textView5);
        city=(TextView)findViewById(R.id.textView4);
        state=(TextView) findViewById(R.id.textView2);

    }
}
