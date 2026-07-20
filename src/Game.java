import java.util.*;

public class Game {



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double n= Math.ceil(3*(Math.random()));
        String pc_choice;


        if(n==1){
            pc_choice="rock";

        }else if(n==2){
            pc_choice="paper";
        }else {
            pc_choice="scissor";
        }

        String user_choice=sc.next();
        System.out.println(pc_choice);
        System.out.println(user_choice);

        if(user_choice.equals("rock") && pc_choice.equals("rock") || user_choice.equals("paper") && pc_choice.equals("paper") || user_choice.equals("scissor") && pc_choice.equals("scissor") ){
            System.out.println("Draw");
        }else if(user_choice.equals("rock") && pc_choice.equals("paper")){
            System.out.println("pc won");
        } else if (user_choice.equals("paper") && pc_choice.equals("rock")) {
            System.out.println("user won");
        }else if(user_choice.equals("paper") && pc_choice.equals("scissor")){
            System.out.println("pc won");
        } else if (user_choice.equals("scissor") && pc_choice.equals("paper")) {
            System.out.println("user won");
        }else if(user_choice.equals("scissor") && pc_choice.equals("rock")){
            System.out.println("pc won");
        } else if (user_choice.equals("rock") && pc_choice.equals("scissor")) {
            System.out.println("user won");
        }else{
            System.out.println("Sorry");
        }


    }
}
