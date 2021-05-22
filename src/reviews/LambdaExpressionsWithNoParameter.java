package reviews;

@FunctionalInterface

interface MyInterface {
	
	public String learning();
	
}

public class LambdaExpressionsWithNoParameter {

	public static void main(String[] args) {

		MyInterface msg = () -> {
			
			return "Happy";
		};
		
		System.out.println(msg.learning());

	}

}
