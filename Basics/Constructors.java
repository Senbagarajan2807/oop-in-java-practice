package Basics;

public class Constructors {
    int  cId;
    String cName;
    public Constructors(int cId, String cName){
        this.cId = cId;
        this.cName = cName;
    }
    public static void main(String[] args) {
        Constructors con= new Constructors(1, "Parameterized Constructor");
        System.out.println("Constructor ID: " + con.cId);
        System.out.println("Constructor Name: " + con.cName);
    }
    
}
