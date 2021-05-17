package reviews;

import java.io.File;
import java.text.SimpleDateFormat;

public class ModifiedDateOfFile {

	public static void main(String[] args) {
		
		String FilePath = "C:\\Users\\d1\\Documents\\test.txt";
		
		File file = new File(FilePath);
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println(df.format(file.lastModified()));

	}

}
