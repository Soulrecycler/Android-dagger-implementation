package com.example.daggerapplication;

import android.util.Log;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

public class Remote {

    @Inject
    public Remote(){

    }

    public void  setListner(Car car){
        Log.d(TAG, "Remote Connected ");
    }
}
