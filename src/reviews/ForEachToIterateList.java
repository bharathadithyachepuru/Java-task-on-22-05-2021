package reviews;

import java.util.ArrayList;
import java.util.List;

public class ForEachToIterateList {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		
	      names.add("Bharath");
	      names.add("Adithya");
	      names.add("Sumanth");
	      names.add("Kareem");
	      
	      names.forEach(str -> System.out.println(str));
	      
	      
	      

	}

}
