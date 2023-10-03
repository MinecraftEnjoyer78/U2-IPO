package Input;

import java.util.Scanner;

public class A2_Camping {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		System.out.print("How many people are going camping: ");
		int numPeople = myInput.nextInt();
		
		System.out.print("Enter how many items still not packed: ");
		int numItems = myInput.nextInt();
		
		
		//average number of items to pack per person
		int itemsToPack  = numItems / numPeople;
		
	
		System.out.println("The number of items each person needs to pack: " + itemsToPack);
		
		//Close the scanner
		myInput.close();

	}//end main

}//end class
