package Basics;

public class Methods {
    public int add(int a, int b){
       return a + b;   
    }
    public static void main(String[] args){
        Methods method = new Methods();
        int sum = method.add(5, 10);
        System.out.println("The sum is: " + sum);
    }

    
}
