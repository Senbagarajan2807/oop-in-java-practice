package Inheritance.TypesOfInheritance;

class Animal{
     public void eat(){
        System.out.println("Animal is eating");
    }
}
class Mammal extends Animal{
     public void walk(){
        System.out.println("Mammal is walking");
     }
}
class Bird extends Animal{
      public void fly(){
        System.out.println("Bird is flying");
    }
}
class Lion extends Mammal{
       public void roar(){
        System.out.println("Lion is roaring");
       }
}
class Eagle extends Bird{
       public void flyhigh(){
        System.out.println("Eagle is flying high");
}
}


public class HybridInheritance {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.walk();
        lion.roar();

        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();
        eagle.flyhigh();
    }
}

