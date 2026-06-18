package Inheritance.SuperKeyword;

public class AccessVariable{
     int age = 50;
}

class Child extends AccessVariable{
       
        public void display(){
      System.out.println("Age is "+ super.age);
    }
      public static void main(String[] args){
        Child c = new Child();
        System.out.println("Age is "+ c.age);
      }
}
