package Input;

import java.util.Scanner;

public class B3_OrderingTwoNumbers {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter number1");
		int number1 = myInput.nextInt();
		System.out.println("Enter number2");
		int number2 = myInput.nextInt();
		
		if (number1 <= number2)
		{
			System.out.println("Number1: " + number1 + " Number2: " + number2);
		}
		
		else 
		{
			System.out.println("Number2: " + number2 + " Number1: " + number1);
		}
	}

}
