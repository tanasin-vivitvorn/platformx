package com.platformx;

import com.platformx.vehicle.Car;
import com.platformx.vehicle.Plane;

public class Main{
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        //get an object of AudioPlayer and call its methods.
        Car car = (Car)vehicleFactory.getVehicle("car");
        System.out.println("Car has " + car.set_num_of_wheels() + " wheels");
        System.out.println("Car can carry " + car.set_num_of_passengers() + " passengers");
        if(car.has_gas()){
            System.out.println("Car has gas");
        }
        car.driving();

        Plane plane = (Plane)vehicleFactory.getVehicle("plane");
        System.out.println("Plane has " + plane.set_num_of_wheels() + " wheels");
        System.out.println("Plane can carry " + plane.set_num_of_passengers() + " passengers");
        if(plane.has_gas()){
            System.out.println("Plane has gas");
        }
        plane.take_off();
        plane.landing();
    }
}