package Processing;

public class A2_AbsoluteValue {

	public static void main(String[] args) {
		
		int max = +100;
		int min = -100;
//  	int absNumber;
		
		int number = (int) (Math.random()*(max-min+1)) + min;
		System.out.println("This is a random number: " + number);
		
		int absNumber = Math.abs(number);
		
		System.out.println("This is the absolute value of the number: " + absNumber);
	}
}
