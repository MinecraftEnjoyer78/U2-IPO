package Processing;

public class B2_Temperature {

	public static void main(String[] args) {
		
		int min = -40;
		int max = 40;

		double C = (Math.random( ) *(max-min+1)) + min;
		
		//Calculate Fahrenheit from Celsius
		double F = 9/5 * C + 32;
		
		//Round up the Fahrenheit number
		double roundF = Math.round(F); 
		
		System.out.println("Temperature in Fahrenheit is: " + roundF );

	}//end main

}//end class
