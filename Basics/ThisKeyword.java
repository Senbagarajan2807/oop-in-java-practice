package Basics;
public class ThisKeyword {
       int a;
       int b;
       public ThisKeyword(int a ,int b){
        this.a = a;
        this.b = b;
       }

    public static void main(String[] args){
        ThisKeyword obj = new ThisKeyword(5,2);
        System.out.println("Sum: " + obj.a+obj.b);
        System.out.println("Product: " + obj.a*obj.b);
    }
}
