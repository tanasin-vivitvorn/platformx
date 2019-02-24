package com.platformx.vehicle;

import com.platformx.interfaces.VehicleProperties;

public abstract class Vehicle {
    private int max_speed;
    private VehicleProperties properties;
    
    public Vehicle(int max_speed, VehicleProperties properties){
        this.max_speed = max_speed;
        this.properties = properties;
    }

    public VehicleProperties getProperties(){
        return properties;
    }
    
    abstract void start();
    abstract void stop();
}