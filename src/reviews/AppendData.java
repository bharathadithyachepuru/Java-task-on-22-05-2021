package reviews;

import java.io.FileWriter;

public class AppendData {

	public static void main(String[] args) {

		String path = "C:\\Users\\d1\\Documents\\test.txt";

		String text = " Append functionality";
		
		try {
			
			FileWriter writer = new FileWriter(path, true);
			writer.write(text);
			writer.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
	}

}
