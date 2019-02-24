package com.platformx.properties;

import com.platformx.interfaces.VehicleProperties;

public class Sedan implements VehicleProperties {

    int wheels = 4;
    int passengers = 300;
    boolean is_has_gas = false;

    @Override
    public int set_num_of_wheels(){
        return wheels;
    }

    @Override
    public int set_num_of_passengers(){
        return passengers;
    }

    @Override
    public boolean has_gas(){
        return is_has_gas;
    }
    
}