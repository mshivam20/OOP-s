import java.util.Scanner;
public class Methods {
   static int math;
    static int eng;
    static int  mar;
    static int sci;

        //student report card
        static Scanner sc=new Scanner(System.in);
    static void inputmarks(){
        System.out.println("Enter Your marks");
        System.out.print("English:");
         eng= sc.nextInt();

        System.out.println("Marathi: ");
         mar=sc.nextInt();

        System.out.println("Science: ");
        sci=sc.nextInt();

        System.out.println("Maths: ");
         math=sc.nextInt();

    }

    static float percentage(){
        return  (eng + mar + sci + math)/4;
    }

    static void report(){
        int percentage= (eng + mar + sci + math)/4;
       System.out.println("English:"+eng);
        System.out.println("Marathi: "+mar);
        System.out.println("Science:"+sci);
        System.out.println("Math: "+math);
        System.out.println("Total percentage: "+percentage +"%");

    }
    public static void main(String[] args) {

        inputmarks();
        report();


    }
}
