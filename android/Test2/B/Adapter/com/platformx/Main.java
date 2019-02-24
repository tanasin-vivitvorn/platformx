package com.platformx;

// Use adpater design pattern
import com.platformx.vehicle.Car;
import com.platformx.vehicle.Plane;
import com.platformx.vehicle.Vehicle;
import com.platformx.properties.Airbus;
import com.platformx.properties.Sedan;

public class Main {

	public static void main(String[] args) {
		
		Plane airbus = (Plane)new Plane(500, new Airbus());
		System.out.println("Airbus has " + airbus.getProperties().set_num_of_wheels());
		System.out.println("Airbus " + (airbus.getProperties().has_gas()?"":" not") + " use gas.");
		airbus.start();
		airbus.stop();

		Car sedan = (Car)new Car(500, new Sedan());
		System.out.println("Sedan has " + sedan.getProperties().set_num_of_wheels());
		System.out.println("Sedan " + (sedan.getProperties().has_gas()?"":" not") + " use gas.");
		sedan.start();
		sedan.stop();
	}
}