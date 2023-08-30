import java.util.*;
public class NumberGame
{
    public static void main(String[] args)
    {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        //Generating Random Number
        int randomNum = rd.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Enter player name: ");

        //Takes the name of the player
        String name = sc.nextLine();

        System.out.println("Hey " + name + "! Let's get started.");
        
        int tries = 1;

        //The game starts here.
        while(tries<=3)
        {
            System.out.print("Enter a number between 1 to 100: ");

            int guessNum = sc.nextInt();

            if (guessNum == randomNum)
            {
                System.out.println("Congratulations! You guessed it right.");
                System.out.println("Your score: " + tries);
                break;
            }
            else if (guessNum < randomNum)
            {
                System.out.println("You guessed it lower! Try again.");
                tries++;
            }
            else if (guessNum > randomNum)
            {
                System.out.println("You guessed it higher! Try again.");
                tries++;
            }    
        }

        //If the maximum limit is reached, an appropriate message is displayed.
        if (tries>3)
        {
            System.out.println("Oops! You've reached your limit. The correct guess was: " + randomNum); 
            System.out.println("Your score: 0");
        }

        sc.close(); 
    }
}