import java.util.*;


// custom class
class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("Employee Name is "+name);
        System.out.println("Employee is is: "+id);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("hello World");

        Employee shivam=new Employee();
        shivam.id=5;
        shivam.name="Shivam Murkute";

        shivam.printDetails();



    }
}
