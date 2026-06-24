package Basics;

class Engine{
  public void start(){
     System.out.println("Engine Started");
}
  public void stop(){
     System.out.println("Engine Stopped");
}

}

class Car{
    public final Engine engine;
   public Car(){
  engine = new Engine();
}
   public void startCar(){
     System.out.println("Car Started");
     engine.start();
}
  public void stopCar(){
     System.out.println("Car Stopped");
     engine.stop();
}
}

public class Composition{
    public static void main(String[] args){
         Car car = new Car();
         car.startCar();
         car.stopCar();
}
}


