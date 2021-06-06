package packBasicPrograms;

import java.util.Scanner;

public class ReverseNumberWhile {
	public static void main(String[] args) {
		int num =0;
		int reverseNum =0;
		System.out.println("Input your number and press enter");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		while(num!= 0) {
			reverseNum *=10;
			reverseNum +=num%10;
			num = num/10;
		}
		
	System.out.println("Reverse of input number is "+ reverseNum );
	}

}
