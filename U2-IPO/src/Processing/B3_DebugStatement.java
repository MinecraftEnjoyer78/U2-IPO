package Processing;

import java.util.*;

public class B3_DebugStatement {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int angle = (int) Math.random()*80; // (0-80)
		int shadow = rand.nextInt(30)+1; // (1-30)
		
		double height = Math.tan(angle) * shadow;
		System.out.println("height = " + height);

		
	}
}
