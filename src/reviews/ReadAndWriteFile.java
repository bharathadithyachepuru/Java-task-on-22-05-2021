package reviews;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWriteFile {

	public static void main(String[] args) throws IOException {
		
		//Creating a file

		File fl = new File("C:\\Users\\d1\\Documents\\test.txt");
		fl.createNewFile();
		
		//Writing in a file
		
		FileWriter fw = new FileWriter(fl);
		fw.write("Testing");
		fw.close();
		
		//Reading data from file
		
		Scanner sc = new Scanner(fl);
		while (sc.hasNext()) {
			
			System.out.println(sc.next());
		}
	}

}
