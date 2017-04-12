package com.example.gaby.ejemplo_spotify;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ocultar Action Bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }
}
