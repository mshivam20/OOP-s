


class StudentInfo{


    public  String name;
    public int roll;

    public  StudentInfo(String name, int roll){
       this.name= name;
        this.roll=roll;
    }
}
public class Constructor {


    public static void main(String[] args) {
     StudentInfo s1= new StudentInfo("Shivam", 5);
        System.out.println(s1.roll);

        System.out.println(s1.name);
    }
}
