package reviews;

import java.util.function.IntBinaryOperator;

public class PredefinedFunctionalInterface {

	public static void main(String[] args) {

		 IntBinaryOperator sum = (a, b) -> a + b;
		 
	        System.out.println("Result: " + sum.applyAsInt(10, 10));

	}

}
