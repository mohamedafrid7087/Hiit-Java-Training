package packBasicPrograms;

import java.util.Scanner;

public class AreaTriangleDemo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the width of the triangle: ");
		double base, height, area;		
		base = scanner.nextDouble();
		
		System.out.println("enter the height of the triangle: ");
		height = scanner.nextDouble();
		
		area = (base * height)/2;
		System.out.println("Area the triangle: " + area);
	}

}
