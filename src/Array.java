import java.util.Scanner;
public class Array {

   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int [] num= new int[5];

        for (int i=0 ;i<num.length; i++){
            num[i]=sc.nextInt();


        }
       for (int i : num) {
           System.out.print(i);
       }

       //2d array

       int [][] twodimentionalArray=new int[3][3];

       for (int i=0; i<twodimentionalArray.length;i++){
           for (int j=0 ; j<twodimentionalArray[i].length;j++){
               twodimentionalArray[i][j]=sc.nextInt();
           }

       }

       for (int[] ints : twodimentionalArray) {
           for (int j = 0; j < ints.length; j++) {
               System.out.print(ints[j]);
           }
           System.out.println();

       }



    }
}
