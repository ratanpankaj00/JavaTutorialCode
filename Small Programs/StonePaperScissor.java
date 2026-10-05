import java.util.Scanner;
import java.util.Random;

public class StonePaperScissor {
    public static void main(String[] args) {
        System.out.println("\n***WELCOME TO STONE-PAPER-SCISSOR GAME***. \n You will play 10 rounds against computer.");
        System.out.print("1--> Stone  ");
        System.out.print("2--> Paper  ");
        System.out.println("3--> Scissor");
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        
        
        
        int userScore = 0;
        int computerScore = 0;
        int game = 1;
        while (game!=11) {
            int computer = 1 + gen.nextInt(3);
            
            System.out.println("Game: " + game);
            System.out.print("Enter Choice: ");
            int user = scan.nextInt();
            System.out.println("Computer selected: " + computer);
            
            if (computer == user ) {
                System.out.println("Draw");
            } 
            else if(computer == 1 && user == 2){
                System.out.println("You Win.");
                userScore = userScore + 1;
            }
            else if(computer == 1 && user == 3){
                System.out.println("Computer Win.");
                computerScore = computerScore + 1;
            }
            else if(computer == 2 && user == 3){
                System.out.println("You Win.");
                userScore = userScore + 1;
            }
            else if(computer == 2 && user == 1){
                System.out.println("Computer Wins.");
                computerScore = computerScore + 1;
            }
            else if(computer == 3 && user == 1){
                System.out.println("You Win.");
                userScore = userScore + 1;
            }
            else if(computer == 3 && user == 2){
                System.out.println("Computer Wins.");
                computerScore = computerScore + 1;
            }
            game = game+1;
            System.out.println("----------------------------------------------------------------------------");
        }

        System.out.println("Your Score: " + userScore);
        System.out.println("Computer Score: " + computerScore);

        if (computerScore>userScore) {
             System.out.println("***BETTER LUCK NEXT TIME. YOU LOSE.***\n");
        }
        else if(computerScore==userScore){
            System.out.println("Try again.Draw.");
        }
        else{
            System.out.println("***YOU WIN.***\n");
        }





    }
}
