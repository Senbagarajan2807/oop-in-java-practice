package Basics;


class Employee
{
    String name;
    double age;
    Address address; //AGGREGATION: Employee HAS-A Address (reference, not created inside)

    public Employee(String name, double age, Address address)
    {
        this.name = name;
        this.age = age;
        this.address = address; //AGGREGATION: Address object is passed from outside
    }

    public void display()
    {
        System.out.println(this.name + " " + this.age);
        System.out.println(address.houseNo + " " + address.cityName + " " + address.country);
    }
}

class Address
{
    String houseNo;
    String cityName;
    String country;

    public Address(String houseNo, String cityName, String country)
    {
        this.cityName = cityName;
        this.houseNo = houseNo;
        this.country = country;
    }
}

public class Aggregation
{
    public static void main(String[] args)
    {
        Address Ad = new Address("NH34", "Nagpur", "India"); 
        // Address created independently (exists without Employee)

        Employee emp = new Employee("Rohan", 20.5, Ad); 
        // AGGREGATION: Passing existing Address to Employee

        emp.display();
    }
}