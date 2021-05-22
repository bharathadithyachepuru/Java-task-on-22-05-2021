package reviews;

interface SampleInterface {
	
	Hello display(String say);
	
}

class Hello {
	
	public Hello(String say) {
		
		System.out.println(say);
	}
}

public class MethodReferenceToConstructor {

	public static void main(String[] args) {

		SampleInterface ref = Hello::new;
		
		ref.display("Bharath Adithya");

	}

}
