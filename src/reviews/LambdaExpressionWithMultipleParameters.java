package reviews;

interface StringConcat {
	
	public String sconcat(String a, String b);
}

public class LambdaExpressionWithMultipleParameters {

	public static void main(String[] args) {
		
		StringConcat s = (str1, str2) -> str1 + str2;
		
        System.out.println("Result: "+s.sconcat("Bharath ", "Adithya"));

		

	}

}
