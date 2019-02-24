# Use a different design pattern for this solution.

## Explaination
There are many possible design pattern to be applied this Vehicle interface. I choose Adapter design pattern because the previous question I use Factory design pattern that most famous for creational pattern while the Adapter is the one of most on structural design pattern.

Adapter pattern works as a bridge between two incompatible interfaces. This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces.

The abstract class Vehicle is defined for functionalities (start/stop) of vehicle while interface VehicleProperties used for defined the properties of vehicle only. The separation of functionalities and properties has benefit to developer to reuse abstract class to create many type of vehicle by create the new VehicleProperties only.

```java
    Plane airbus = (Plane)new Plane(500, new Airbus());
    Car sedan = (Car)new Car(500, new Sedan());
```

## Compile

```bash
    cd B/Adapter
    javac -classpath .:com.platformx.* com/platformx/Main.java
```

## Run
```bash
    cd B/Adapter
    java -classpath .:com.platformx.* com/platformx/Main
```