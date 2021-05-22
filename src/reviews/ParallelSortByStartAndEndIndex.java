package reviews;

import java.util.Arrays;

public class ParallelSortByStartAndEndIndex {

	public static void main(String[] args) {
		
		int numbers[] = {22, 89, 1, 32, 19, 5};
		
		Arrays.parallelSort(numbers, 1, 5);
		
		Arrays.stream(numbers).forEach(n->System.out.print(n+" "));

	}

}
