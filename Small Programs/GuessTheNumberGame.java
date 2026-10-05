import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        boolean playagain = true;
        while (playagain) {
            System.out.println("Select Level of game:('Easy[1-500]'/'Medium[1-1000]'/'Hard[1-2500]'/'XTR(1-8000)')");
            String level = scan.next();
            level = level.toUpperCase();
            level = level.trim();
            int TarNum = 0;
            if (level.equals("EASY")) {
                TarNum = random.nextInt(500) + 1;
                System.out.println("The number is : ###");
            } else if (level.equals("MEDIUM")) {
                TarNum = random.nextInt(1000) + 1;
                System.out.println("The number is : ####");
            } else if (level.equals("HARD")) {
                TarNum = random.nextInt(2500) + 1;
                System.out.println("The number is : ####");
            } else if (level.equals("XTR")) {
                TarNum = random.nextInt(8000) + 1;
                System.out.println("The number is : ####");
            } else {
                System.out.println("RETRY. YOU MADE A MISTAKE.");
                return;
            }

            System.out.println("You Choose " + level + " Level\nYou have 10 Attempts from now.\nLET'S GET STARTED.\n");
            int userInput = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.println("Attempt: " + i);
                System.out.print("Enter your Guess: ");
                if (scan.hasNextInt()) {
                    userInput = scan.nextInt();
                } else {
                    System.out.println("Try Again. You Made A Mistake");
                    userInput = scan.nextInt();
                    i--;
                    continue;
                }

                if (userInput > TarNum) {
                    System.out.println("HINT : Think Some Lower Number");
                } else if (userInput < TarNum) {
                    System.out.println("HINT : Think Some Higher Number");
                } else if (userInput == 0) {
                } else {
                    System.out.println("Correct! You Win in " + i + " Attempts\n Play Again");
                    i = 10;
                    TarNum = userInput;
                }
                System.out.println("-----------------------------------------------");

            }

            if (TarNum == userInput) {
            } else {
                System.out.println("You Lose.\n" + "The Number is: " + "<<<<<" + TarNum + ">>>>>");
            }
            System.out.println("DO YOU WANT TO PLAY AGAIN(TYPE : YES/NO).");
            String pa = scan.next().toUpperCase();
            pa = pa.trim();
            if (pa.equals("YES")) {
                playagain = true;
            } else {
                playagain = false;
                System.out.println("Thanks For Playing.");
            }
        }
    }
}
