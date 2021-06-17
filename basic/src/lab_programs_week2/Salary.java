package lab_programs_week2;

import java.util.Scanner;
import java.text.NumberFormat;


/*
 *   File Salary.java contains most of a program that takes as input an
employee's salary and a rating of the employee's performance and
computes the raise for the employee.As inthe pre-lab, an employee who is
rated excellent will receive a 6% raise, one rated good will receive a 4%
raise, and one rated
poor will receive a 1.5% raise.Add the if... else... statements to program
Salary to make it run as described above. 

 */


public class Salary {
	public static void main(String[] args) {

		double currentSalary; // employee's current salary
		double raise; // amount of the raise
		double newSalary; // new salary for the employee
		String rating; // performance rating

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		scan.nextLine();
		System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
		rating = scan.nextLine();

		// Compute the raise using if ...
		if (rating.equalsIgnoreCase("Excellent")) 
			raise = currentSalary * 0.06;
		else if (rating.equalsIgnoreCase("good"))
			raise = currentSalary * 0.04;
		else
			raise = currentSalary * 0.015;

		newSalary = currentSalary + raise;

		System.out.println(currentSalary);
		System.out.println(raise);
		System.out.println(newSalary);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary: " + money.format(currentSalary));
		System.out.println("Amount of your raise: " + money.format(raise));
		System.out.println("Your new salary: " + money.format(newSalary));
		System.out.println();

		scan.close();
	}

}