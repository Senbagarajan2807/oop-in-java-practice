package Polymorphism;


class Car {

    // Method 1: no parameters
    public void start() {
        System.out.println("Car starts with key.");
    }

    // Method 2: one parameter
    public void start(String mode) {
        System.out.println("Car starts in " + mode + " mode.");
    }

    // Method 3: two parameters
    public void start(String mode, int speed) {
        System.out.println("Car starts in " + mode + " mode with speed " + speed);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();                          // calls Method 1
        car.start("Eco");                     // calls Method 2
        car.start("Sport", 120);              // calls Method 3
    }
}