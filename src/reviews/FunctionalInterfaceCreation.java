package reviews;

interface simple {
	
	public int addMethod(int a, int b);
	
}

public class FunctionalInterfaceCreation {

	public static void main(String[] args) {

		simple sum = (a,b) -> a+b;
		
		System.out.println("Result:"+sum.addMethod(10, 10));

	}

}
