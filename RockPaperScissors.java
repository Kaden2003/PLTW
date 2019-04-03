import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int computersGuess = rand.nextInt(3) + 1;

        int input;
        System.out.println("Welcome to rock paper scissors! ");


        System.out.println("What move would you like to roll 1 for rock 2 for paper 3 for scissors. ");
        input = in.nextInt();


        if (computersGuess == 1) {
            if (input == 1) {
                System.out.println("Rock vs. Rock, ITS A TIE!");
            } else if (input == 2) {
                System.out.println("Rock vs. Paper! You win!");
            } else if (input == 3) {
                System.out.println("Rock vs. Scissors! You lose!");
            }

            else if (computersGuess == 2) {
                if (input == 1) {
                    System.out.println("Paper vs. Rock! You lose!");
                } else if (input == 3) {
                    System.out.println("Paper vs. Scissors! You win!");
                } else if (input == 2) {
                    System.out.println("Paper vs. Paper! Its a tie!");
                }

                else if (computersGuess == 3) {
                    if (input == 1) {
                        System.out.println("Scissors vs. Rock! You win!");
                    } else if (input == 3) {
                        System.out.println("Scissors vs. Scissors, ITS A TIE!");
                    } else if (input == 2) {
                        System.out.println("Scissors vs Paper! You lose!");
                    }


                }
            }
        }
    }
}