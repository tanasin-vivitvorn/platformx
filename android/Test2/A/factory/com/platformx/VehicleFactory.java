package com.platformx;

import com.platformx.vehicle.Car;
import com.platformx.vehicle.Plane;
import com.platformx.interfaces.Vehicle;

class VehicleFactory {

    //use getPlayer method to get object of type Player 
    public Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("car")){
            return new Car(4, 5, true);
        }else if(vehicleType.equalsIgnoreCase("plane")){
            return new Plane(10, 300);
        }else {
            return null;
        }
    }
}