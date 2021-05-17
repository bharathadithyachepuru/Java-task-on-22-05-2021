package reviews;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

public class GzipFormatConversion {

	public static void main(String[] args) {
		
		String srcfile = "C:\\Users\\d1\\Documents\\sample.txt";
		String compfile = "C:\\Users\\d1\\Documents\\sample.gzip";
		
		GzipFormatConversion gzipfile = new GzipFormatConversion();
		gzipfile.gzipFile(srcfile, compfile);

		

	}

	private void gzipFile(String srcfile, String compfile) {
		
		byte[] buffer = new byte[1024];
		
		try {
			
			FileOutputStream fos = new FileOutputStream(compfile);
			
			GZIPOutputStream gos = new GZIPOutputStream(fos);
			
			FileInputStream fis = new FileInputStream(srcfile);
			
			int bytes_read;
			
			while ((bytes_read = fis.read(buffer))>0) {
				
				gos.write(buffer, 0, bytes_read);
				
			}
			
			fis.close();
			
			gos.finish();
			
			gos.close();
			
			System.out.println("File compressed successfully");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}
