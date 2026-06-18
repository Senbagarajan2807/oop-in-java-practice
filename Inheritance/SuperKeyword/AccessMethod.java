package Inheritance.SuperKeyword;

public class AccessMethod {
    
    public void display(){
        System.out.println("This is parent class method");
    }
    
}
class Child extends AccessMethod{
    
    public void display(){
        System.out.println("This is child class method");
    }
    
    public void show(){
        super.display();
    }
    
    public static void main(String[] args){
        Child c = new Child();
        c.show();
    }
}
