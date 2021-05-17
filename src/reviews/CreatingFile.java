package reviews;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) {
		
		File fi = new File("C:\\Users\\d1\\Documents\\sample.txt");
		
		try {
			if (fi.createNewFile()) {
				
				System.out.println("File got created");
				
			} else {
				
				System.out.println("File not created");

			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
