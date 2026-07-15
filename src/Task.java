import java.util.*;


class Emp{
    int salary;
    String name;

    public void getName(){
        System.out.println("The name is "+name);
    }

    public void  getSalary(){
        System.out.println("The salary is "+salary);
    }

    public void setName(String newName){
        name = newName;

    }
}
public class Task {

    public static void main(String[] args) {
        Emp e1= new Emp();

        e1.name="Swaraj";
        e1.salary=100000;

        e1.getName();
        e1.setName("Shivam");

        e1.getName();

    }

}
