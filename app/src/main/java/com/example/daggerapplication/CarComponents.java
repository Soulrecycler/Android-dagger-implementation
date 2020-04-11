package com.example.daggerapplication;

import dagger.Component;

@Component
public interface CarComponents {

    Car getCar();

    void inject (MainActivity mainActivity);
}
