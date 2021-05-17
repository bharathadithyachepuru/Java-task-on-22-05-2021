package reviews;

import java.io.File;
import java.nio.file.Files;

public class CopyFileToOtherFile {

	public static void main(String[] args) {

		File srcfile = new File("C:\\Users\\d1\\Documents\\test.txt");
		File destfile = new File("C:\\Users\\d1\\Documents\\Copy.txt");
		
		try {
			
			Files.copy(srcfile.toPath(), destfile.toPath());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
