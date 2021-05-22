package reviews;

import java.util.Arrays;

public class ParallelSortForPrimitiveDataTypes {

	public static void main(String[] args) {

		int numbers[] = {28, 74, 1, 7, 18, 45};
		
		Arrays.parallelSort(numbers);
		
		Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
		
		

	}

}
