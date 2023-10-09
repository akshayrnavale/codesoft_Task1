import java.util.Random;
import java.util.Scanner;

public class NumberGame {
//this method is used to generate number
	int createNumber()
	{
		Random rand = new Random();
        return rand.nextInt(100) + 1;
	}
//this method used to take user input
	int takeUserInput()
	{
		 Scanner scanner = new Scanner(System.in);
		  int userGuess = scanner.nextInt();
		  return userGuess;
	}
    public static void main(String[] args)
	{ 
		NumberGame num=new NumberGame();
		
        int anyNumber =num.createNumber();

        // Initialize variables
        int Tries = 0;
        boolean Guess = false;

       
       

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (!Guess) 
		{
            System.out.print("Enter your guess: ");
            int userGuess = num.takeUserInput();
            Tries++;

            if (userGuess < 1 || userGuess > 100) 
			{
                System.out.println("Please enter a number between 1 and 100.");
            } 
			else if (userGuess < anyNumber)
			{
                System.out.println("Too low! Try again.");
            }
			else if (userGuess > anyNumber)
			{
                System.out.println("Too high! Try again.");
            } 
			else 
			{
                System.out.println("Congratulations! You've guessed the number " + anyNumber + " correctly!");
                System.out.println("It took you " + Tries + " tries.");
                Guess = true;
            }
        }
    }
}
