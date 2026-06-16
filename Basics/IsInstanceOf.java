package Basics;
class Person{
    public void display(){
        System.out.println("This is class Person");
    }
}
class Car{
    public void display(){
        System.out.println("This is class Car");
    }
}


public class IsInstanceOf {
    public static void main(String[] args){
        Person per = new Person();
        Car car= new Car();
        System.out.println(Person.class.isInstance(per));
        System.out.println(Car.class.isInstance(car));
    }
}
