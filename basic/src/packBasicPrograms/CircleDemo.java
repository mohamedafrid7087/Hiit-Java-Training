package packBasicPrograms;

import java.util.Scanner;

public class CircleDemo {
	
		static Scanner scan = new Scanner(System.in);
		public static void main(String[] args) {
		
		System.out.println("Enter the radius : ");
		
		double radius = scan.nextDouble();
		double area = Math.PI * (radius * radius);

		System.out.println("the area of circle is =" + area);
		
		double circumference = Math.PI * 2 *radius;
		System.out.println( "The circumference of the circle is ="+ circumference); 
}
}
