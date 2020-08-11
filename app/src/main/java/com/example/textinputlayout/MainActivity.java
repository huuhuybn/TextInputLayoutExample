package com.example.textinputlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        TextInputLayout til = findViewById(R.id.textInputLayout);
        //til.setHelperText("Hello, This is place to enter Username.");


        til.setHelperTextEnabled(true);
        til.setHelperText("Hello, This is place to enter Username.");
    }



}