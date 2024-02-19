import java.util.Scanner; //used to get input
import java.util.Random; //used to get random numbers
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int val = rnd.nextInt(10) + 1; //generate a random number between 1 and 10
        int userGuess;
        boolean done = false;

        do {
            System.out.println("Guess a number between 1 and 10: ");
            userGuess = in.nextInt();
            if (userGuess < 1) {
                System.out.println("Enter a number between 1 and 10.");
            }
            else if (userGuess > 10) {
                System.out.println("Enter a number between 1 and 10.");
            } else {
                done = true;
            }
        } while (!done);

        System.out.println("The random number is: " + val);

        if (userGuess == val) {
            System.out.println("You guessed the number correctly!");
        } else if (userGuess < val) {
            System.out.println("Your guess was too low :( Try again!");
        } else {
            System.out.println("Your guess was too high :( Try again!");

                }
        }
        }

