package Processing;

public class C1_SumDifFraction {

	public static void main(String[] args) {
	
	int sum;
	int difference;
	double fraction;
	int max = 6;
	int min = 1;
	int  die1 = (int) (Math.random()*(max-min+1)) + min;
	int  die2 = (int) (Math.random()*(max-min+1)) + min;
		
		System.out.println("die1: " + die1);
		System.out.println("die2: " + die2);
		
		sum = die1 + die2;
		System.out.println("The sum is: " + sum);
		
		
		
		if(die1 >= die2)
		{
			difference = die1 - die2;
			System.out.println("The difference is: " + difference);
		}
		else
		{
			difference = die2 - die1;
			System.out.println("The difference is: " + difference);
		}
		
		fraction = die1 / die2;
		System.out.println("The die1/die2 is: " + fraction);
		

		
	}

}
