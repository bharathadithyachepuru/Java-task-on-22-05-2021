package reviews;

interface topic {
	
	default void newMethod() { 
		
        System.out.println("Newly added default method");
        
        
   }
	
	 void existingMethod(String str); 
	
}



public class DefaultMethodInterface implements topic {
	
	public void existingMethod(String str) { 
		
        System.out.println("String is: "+str);  
    }  

	public static void main(String[] args) {
		
       DefaultMethodInterface dmi = new DefaultMethodInterface();
       
       dmi.newMethod();
       
       dmi.existingMethod("java 8 features");


	}

}
