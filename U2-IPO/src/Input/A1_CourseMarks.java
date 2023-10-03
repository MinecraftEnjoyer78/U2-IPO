package Input;

import java.util.Scanner;

public class A1_CourseMarks {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		System.out.print("Enter the 1st course mark: ");
		int mark1 = myInput.nextInt();
		
		System.out.print("Enter the 2nd course mark: ");
		int mark2 = myInput.nextInt();
		
		System.out.print("Enter the 3rd course mark: ");
		int mark3 = myInput.nextInt();
		
		System.out.print("Enter the 4th course mark: ");
		int mark4 = myInput.nextInt();
		
		int avg = (mark1 + mark2 + mark3 + mark4)/4;
		
		System.out.println("The average of course marks is: " + avg);
		
		//Close the scanner
		myInput.close();
	
		}//end main

}//end class
