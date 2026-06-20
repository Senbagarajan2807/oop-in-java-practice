package Inheritance.TypesOfInheritance;

public class SingleInheritance {
    public void display(){
        System.out.println("This is parent class method");
    }
}

class Child extends SingleInheritance{
    public void show(){
        System.out.println("This is child class method");
    }
}
class Main{
    public static void main(String[] args){
        Child c = new Child();
        c.display();
        c.show();
    }
}
