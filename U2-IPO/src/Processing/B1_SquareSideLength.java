package Processing;

public class B1_SquareSideLength {
	
	public static void main(String[] args) {
		int max = 500;
		int min = 60;
		int square = (int) (Math.random()*(max-min+1)) + min;
		System.out.println("Random number is: " + square);
		
		double length = Math.sqrt(square);
		System.out.println("The length of the square is: " + length);
	}
}
