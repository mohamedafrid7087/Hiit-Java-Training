package lab_programs_week2;

/*
 *Program Rock.java contains a skeleton for the game Rock, Paper, Scissors. 
Open it and save it to your directory. Addstatements to the program as 
indicated by the comments so that the program asks the user to enter a 
play, generates a random play for the computer, compares them and 
announces the winner (and why). 
 */

import java.util.Random;
import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		String personPlay; 			// User's play -- "R", "P", or "S"
		String computerPlay; 		// Computer's play -- "R", "P", or "S"
		int computerInt; 			// Randomly generated number used to determine computer's play
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
	
		System.out.print("Rock, Paper or Scissor? (R/P/S) ");
		personPlay = String.valueOf(scan.next().toUpperCase().charAt(0));
		computerInt = generator.nextInt(2);
		personPlay = personPlay.equals("R") ? "Rock" : personPlay.equals("P") ? "Paper" : "Scissors";
		switch (computerInt) {
			case 0:
				computerPlay = "Rock";
				break;
			case 1:
				computerPlay = "Paper";
				break;
			default:
				computerPlay = "Scissor";
				break;
		}
		
		System.out.println("You: "+personPlay+"\nComputer: "+computerPlay);
		
		if (personPlay.equals(computerPlay)) {
			System.out.println("It's a tie!");
		} else if (personPlay.equals("Rock")) {
			if (computerPlay.equals("Scissors")) {
				System.out.println("Rock crushes scissors. You win !!\nWinner: You");
			} else {
				System.out.println("Paper surrounds rock. You lost !!\nWinner: Computer");
			}
		} else if (personPlay.equals("Paper")) {
			if (computerPlay.equals("Rock")) {
				System.out.println("Paper sorrounds rock. You win !!\nWinner: You");
			} else {
				System.out.println("Scissor cuts paper. You lost !!\nWinner: Computer");
			}
		} else {
			if (computerPlay.equals("Paper")) {
				System.out.println("Scissors cuts paper. You win !!\nWinner: You");
			}
			if (computerPlay.equals("Rock")) {
				System.out.println("Rock crushes scissors. You lost !!\nWinner: Computer");
			}
		}
		
		scan.close();
	}
}
