package fileWriting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class using_FileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String Location = "D:\\WorkSpace\\UsingFOS.txt"; //Writes in specific location
		
		//String Location = "UsingFileWriterClass.txt"; //Writes inside the project
		
		String Content = "Writing into a file using FileOutputStream Class";
		
		FileOutputStream fos = new FileOutputStream(Location);
		byte[] writethis = Content.getBytes();
		
		fos.write(writethis);
		fos.close();
		
		
		
		
	}

}
