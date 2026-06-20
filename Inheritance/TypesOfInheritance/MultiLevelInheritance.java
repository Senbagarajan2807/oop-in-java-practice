package Inheritance.TypesOfInheritance;

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Honking the car horn");
    }
}

class SportsCar extends Car {
    void accelerate() {
        System.out.println("Accelerating the sports car");
    }
} public class MultiLevelInheritance {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.drive();
        sportsCar.honk();
        sportsCar.accelerate();
    }
}