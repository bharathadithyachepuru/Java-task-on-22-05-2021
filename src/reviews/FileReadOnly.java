package reviews;

import java.io.File;

public class FileReadOnly {

	public static void main(String[] args) {

		File fl = new File("C:\\Users\\d1\\Documents\\test.txt");
		
		boolean isFileSetToReadOnly = fl.setReadOnly();
		
		System.out.println("File set to read only:" + isFileSetToReadOnly);
		
		if (isFileSetToReadOnly) {
			
			System.out.println("File is set to read only");
			
		} else {
			
			System.out.println("File is not set to read only");

		}

	}

}
