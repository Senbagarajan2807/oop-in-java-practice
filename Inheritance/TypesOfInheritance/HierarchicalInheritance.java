package Inheritance.TypesOfInheritance;
 class Vehicle{
      void drive(){
        System.out.println("Driving a vehicle");
      }
 }
 class Car extends Vehicle{
        void honk(){
            System.out.println("Honking the car horn");
        }

 }
class Bike extends Vehicle{
    void ringBell(){
        System.out.println("Ringing the bike bell");
    }

}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.honk();

        Bike bike = new Bike();
        bike.drive();
        bike.ringBell();
    }
    
}
