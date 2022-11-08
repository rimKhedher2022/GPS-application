package com.example.gps;

import android.app.Application;
import android.location.Location;

import java.util.List;

public class MyApplication extends Application {

    private static MyApplication singleton ;
    private List<Location> myLocations;


    private List <Location> getMyLocation()
    {
        return myLocations;
    }






}
