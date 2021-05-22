package reviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterAndCollect {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Bharath","Adithya","Kareem","Sumanth");
		
		List<String> longnames = names.stream().filter(str -> str.length()>6).collect(Collectors.toList());
		
		longnames.forEach(System.out::println);

	}

}
