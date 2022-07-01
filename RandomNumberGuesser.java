/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 6/30/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Geronimo Restrepo
*/
/**
 * 
 * @author Geronimo Restrepo
 *
 */

import java.util.Scanner; 
import java.util.*; 

public class RandomNumberGuesser 
{
	public static void main(String[] args)
	{
		//Initializing variables
		String option = null; 
		String yes = "yes";
		String no = "no"; 
		Scanner scan = new Scanner(System.in); 
		int nextGuess = 0; 
		int highGuess = 100; 
		int lowGuess = 0; 
		int randomNum = RNG.rand();  
		RNG.resetCount(); 
		
		//First guess
		System.out.println("Enter your first guess"); 
		nextGuess = scan.nextInt(); 
		
		//Loop goes until the user guesses the correct number
		while(nextGuess != randomNum)
		{
			if(nextGuess > highGuess || nextGuess < lowGuess)
			{
				RNG.inputValidation(nextGuess, lowGuess, highGuess);
				nextGuess = scan.nextInt(); 
			}
			else
			{
				RNG.inputValidation(nextGuess, lowGuess, highGuess);
				{
				System.out.println("Number of guesses is " + RNG.getCount()); 
				if(nextGuess > randomNum && (nextGuess-randomNum)<(highGuess-randomNum))
				{
					System.out.println("Your guess is too high"); 
					highGuess = nextGuess;
				}
				if(nextGuess < randomNum && (randomNum-nextGuess)<(randomNum-lowGuess))
				{
					System.out.println("Your guess is too low"); 
					lowGuess = nextGuess; 
				}
				System.out.println("Enter you next guess between " + lowGuess + " and " + highGuess);
				nextGuess = scan.nextInt();
				}
			}	
		}
		
		//If the user guess the number the user has an option to play again
		if(nextGuess == randomNum)
		{
			System.out.println("Congratulations, you guess correctly  \nTry again? (yes or no)");
			option = scan.nextLine(); 
			option = scan.nextLine();
		}
		
		//If the user says yes then the program runs again
		while(option.equalsIgnoreCase(yes))
		{
			nextGuess = 0; 
			highGuess = 100; 
			lowGuess = 0; 
			randomNum = RNG.rand();  
			RNG.resetCount(); 
			
			System.out.println("Enter your first guess"); 
			nextGuess = scan.nextInt(); 
			
			while(nextGuess != randomNum)
			{
				if(nextGuess > highGuess || nextGuess < lowGuess)
				{
					RNG.inputValidation(nextGuess, lowGuess, highGuess);
					nextGuess = scan.nextInt(); 
				}
				else
				{
					RNG.inputValidation(nextGuess, lowGuess, highGuess);
					{
					System.out.println("Number of guesses is " + RNG.getCount()); 
					if(nextGuess > randomNum && (nextGuess-randomNum)<(highGuess-randomNum))
					{
						System.out.println("Your guess is too high"); 
						highGuess = nextGuess;
					}
					if(nextGuess < randomNum && (randomNum-nextGuess)<(randomNum-lowGuess))
					{
						System.out.println("Your guess is too low"); 
						lowGuess = nextGuess; 
					}
					System.out.println("Enter you next guess between " + lowGuess + " and " + highGuess);
					nextGuess = scan.nextInt();
					}
				}	
			}
			
			if(nextGuess == randomNum)
			{
				System.out.println("Congratulations, you guess correctly  \nTry again? (yes or no)");
				option = scan.nextLine(); 
				option = scan.nextLine();
			}
		}
		System.out.println("Thanks for playing... "); 
		System.out.println("Programmer: Geronimo Restrepo");
	}
}
