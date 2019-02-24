# Explain how can you use the pattern to create car and plane class?

## Explaination
For the first example, I prefer to use the factory design pattern because it so powerful and therefore used in most projects even in Spring Framework that is based on a factory method pattern.

I create VehicleFactory to apply the vehicle interface as the template vehicle bluepint. The car and the plane has the common parts and they are defined in the interface.

The user of VehicleFactory just only send parameter to request factory to create the specific type of Vehicle ( Car or Plane ) 


```java
    Car car = (Car)vehicleFactory.getVehicle("car");
    Plane plane = (Plane)vehicleFactory.getVehicle("plane");
```

## Compile

```bash
    cd A/factory
    javac -classpath .:com.platformx.* com/platformx/Main.java
```

## Run
```bash
    cd A/factory
    java -classpath .:com.platformx.* com/platformx/Main
```