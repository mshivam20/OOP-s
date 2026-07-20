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

    // create class tringle and initialize its side, area , perimeter of tringle


}
class Tringle {
    int height;
    int base;


    public void area() {
        int area=base*height/2;
        System.out.println(area );

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

        //tringle parameters

        Tringle t1=new Tringle();

        t1.base=12;
        t1.height=6;

        t1.area();



    }

}
