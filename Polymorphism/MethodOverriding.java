package Polymorphism;

class FatherCar{
  public void start(){
     System.out.println("Father's car is red color.");
    }
}

class SonCar extends FatherCar{
    public void start(){
      System.out.println("Son's car is blue color.");
    }
}

public class MethodOverriding {
    public static void main(String[] args){
         SonCar son = new SonCar();
         son.start();     
    }
}

