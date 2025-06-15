import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Rules to Play : ");
        System.out.println("0 for Rock");
        System.out.println("1 for Paper");
        System.out.println("2 for Scissors");
        System.out.print("Enter your Choice : ");
        int choice = sc.nextInt();
        
        Random r = new Random();
        int random = r.nextInt(2);
        System.out.print("The System choosed : ");
        if(random == 0){
            System.out.println("Rock");
        }
        else if(random == 1){
            System.out.println("Paper");
        }
        else{
            System.out.println("Scissors");
        }

        if((choice==0) && (random==0)){
            System.out.println("Its a tie");
        }
        else if((choice==0) && (random==1)){
            System.out.println("System Won :) ");
        }
        else if((choice==0) && (random==2)){
            System.out.println("Congrats! You Won !!");
        }
        else if((choice==1) && (random==0)){
            System.out.println("Congrats! You Won !!");
        }
        else if((choice==1) && (random==1)){
            System.out.println("Its a tie");
        }
        else if((choice==1) && (random==2)){
            System.out.println("System Won :) ");
        }
        else if((choice==2) && (random==0)){
            System.out.println("System Won :)");
        }
        else if((choice==2) && (random==1)){
            System.out.println("Congrats! You Won !!");
        }
        else if((choice==2) && (random==2)){
            System.out.println("System Won :) ");
        }
        else{
            System.out.println("Please enter a valid number.");
        }
    }
}
