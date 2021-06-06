package packBasicPrograms;

import java.util.Scanner;

public class SquareAreaDemo {
	public static void main(String[] args) {
		System.out.println("Enter Side of Square ");
		Scanner scan =new Scanner(System.in);
		double side, area;
		
		side =scan.nextDouble();
		area = side * side;
		scan.close();
		System.out.println("Area of Square :" + area);
	}

}
