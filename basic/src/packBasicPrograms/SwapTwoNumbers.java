package packBasicPrograms;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int first = 120; 
		int second =220;
		System.out.println("---Before swap---");
		System.out.println("First Number = " + first);
		System.out.println("second number = " + second);
		
		int temp =first;
		first = second;
		second = temp;
		
		System.out.println("---After swap---");
		System.out.println("First Number = " + first);
		System.out.println("second number = " + second);
	}

}
