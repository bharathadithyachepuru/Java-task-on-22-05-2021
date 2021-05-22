package reviews;

import java.util.ArrayList;
import java.util.List;

public class ForEachToIterateStream {

	public static void main(String[] args) {

		 List<String> names = new ArrayList<String>();
		 
	      names.add("Bharath");
	      names.add("Adithya");
	      names.add("Kareem");
	      names.add("Sumanth");
	      
	      
	      names.stream().filter(f->f.startsWith("B")) .forEach(System.out::println); 

	}

}
