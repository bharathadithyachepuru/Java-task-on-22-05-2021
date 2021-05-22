package reviews;

@FunctionalInterface

interface ForInterface {
	
	public int incrementByFive(int a);
}

public class LambdaExpressionWithSingleParameter {

	public static void main(String[] args) {

		ForInterface f = (num) -> num+5;
		
		System.out.println(f.incrementByFive(10));

	}

}
