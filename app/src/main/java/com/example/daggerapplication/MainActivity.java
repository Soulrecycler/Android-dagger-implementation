package com.example.daggerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject  Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       CarComponents components = DaggerCarComponents.create();
       components.inject(this);
       //car = components.getCar();
        car.Drive();
    }
}
