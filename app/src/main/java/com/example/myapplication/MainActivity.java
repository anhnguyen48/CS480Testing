package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.Toast;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //connect UI to Activity

        Toast.makeText(this, "double foobar", Toast.LENGTH_LONG).show();

        Log.e("Pepe","double foobar"); //write error to log


    }
}