package reviews;

interface concept {
	
	default void newMethod() {
		
		System.out.println("Newly added default method");
	}
	
	static void anotherNewMethod() {
    	
		System.out.println("Newly added static method");
    }
	
	void existingMethod(String str);
}

public class StaticMethodExample implements concept {
	
	public void existingMethod(String str) {
		
        System.out.println("String is: "+str);  
    }  

	public static void main(String[] args) {
		
		StaticMethodExample sme = new StaticMethodExample();
		
		sme.newMethod();
		
		concept.anotherNewMethod();
		
		sme.existingMethod("Java 8 features");
		
	}

}
