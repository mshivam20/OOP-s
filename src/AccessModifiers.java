
/* Private access modifier */

class Student{
    private int roll_no;
    private  String student_name;

    // set and get method

    public void setName(String name){
        student_name=name;

    }
    public String getName(){
        return student_name;
    }

    public void setRoll_no(int n){
        roll_no = n;
    }
    public int getRoll_no(){
        return  roll_no;

    }
}

public class AccessModifiers {



    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Shivam");

        System.out.println(s1.getName());

        s1.setRoll_no(12);
        System.out.println(s1.getRoll_no());


    }
}
