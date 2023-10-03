package Processing;

public class C3_AverageMark {

	public static void main(String[] args) {

			
		int min = 1;
		int max = 100;
		
		int num1 = (int) ((Math.random( ) *(max-min+1)) + min);
		int num2 = (int) ((Math.random( ) *(max-min+1)) + min);
		int num3 = (int) ((Math.random( ) *(max-min+1)) + min);
		int num4 = (int) ((Math.random( ) *(max-min+1)) + min);
			
		
		//Calculate the average of the 4 entered numbers
		
		int avg = (num1 + num2 + num3 + num4)/4;
		
		System.out.println("The random numbers are: \n" + num1 + "\n" + num2 + "\n" + num3 + "\n" + num4);
		
		System.out.println("The average of the 4 random numbers is: " + avg);

		
	}//end main

}//end class
