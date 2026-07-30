import java.util.Scanner;
public class Array {

static void insert(int []arr,int n ,int p){
    for (int i=arr.length-1; i>p ; i--){
        arr[i]= arr[i-1];

    }
    arr[p]=n;

}

static void delete(int []arr, int p){
    for(int i = p; i<arr.length-2;i++){
        arr[i]=arr[i+1];

    }

}
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
//        int [] num= new int[5];
//
//        for (int i=0 ;i<num.length; i++){
//            num[i]=sc.nextInt();
//
//
//        }
//       for (int i : num) {
//           System.out.print(i);
//       }
//
//       //2d array
//
//       int [][] twodimentionalArray=new int[3][3];
//
//       for (int i=0; i<twodimentionalArray.length;i++){
//           for (int j=0 ; j<twodimentionalArray[i].length;j++){
//               twodimentionalArray[i][j]=sc.nextInt();
//           }
//
//       }
//
//       for (int[] ints : twodimentionalArray) {
//           for (int j = 0; j < ints.length; j++) {
//               System.out.print(ints[j]);
//           }
//           System.out.println();
//
//       }


  int [] newArray= new int[5];
       newArray[0]=1;
       newArray[1]=2;
       newArray[2]=3;
       newArray[3]=4;




  for(int a=0; a<newArray.length;a++){
      System.out.println(newArray[a]);

  }
       System.out.println("Array length is : "+newArray.length);

  insert(newArray,15,2);

  for (int i=0 ; i<newArray.length;i++){
      System.out.println(newArray[i]);
  }

  delete(newArray,3);
       for (int i=0 ; i<newArray.length;i++){
           System.out.println(newArray[i]);
       }
    }
}
