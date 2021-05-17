package reviews;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {

		File fe = new File("C:\\Users\\d1\\Documents\\ForDeleting.txt");
		
		if (fe.delete()) {
			
			System.out.println(fe+"file is deleted");
			
		} else {

			System.out.println("File is not deleted");
		}

	}

}
