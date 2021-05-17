package reviews;

import java.io.File;

public class HiddenFiles {

	public static void main(String[] args) {

		File fi = new File("C:\\Users\\d1\\Documents\\sample.txt");
		
		if (fi.isHidden()) {
			
			System.out.println("This file is hidden");
			
		} else {
			
			System.out.println("THis file is not hidden");

		}

	}

}
