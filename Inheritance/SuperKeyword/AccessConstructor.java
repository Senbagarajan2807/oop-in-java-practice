package Inheritance.SuperKeyword;

public class AccessConstructor {
    
    public AccessConstructor(){
        System.out.println("This is parent class constructor");
    }
    
}
class Child extends AccessConstructor{
    
    public Child(){
        super(); 
        System.out.println("This is child class constructor");
    }
    
    public static void main(String[] args){
        Child c = new Child();
    }
}
