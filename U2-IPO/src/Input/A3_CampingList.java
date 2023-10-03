package Input;

import java.util.Scanner;

public class A3_CampingList {
	
	public static void main(String[] args) {
		
		
		Scanner myInput = new Scanner(System.in);
		System.out.print("How many people are going camping: ");
		int numPeople = myInput.nextInt();
		
		
		System.out.print("What are the names of the people going: ");
		int nanePeople = myInput.nextInt();
		
		
		//Close the scanner
		myInput.close();
		
		
		
	}

}
