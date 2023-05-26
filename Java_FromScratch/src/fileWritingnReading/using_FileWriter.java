package fileWritingnReading;

import java.io.FileWriter;
import java.io.IOException;

public class using_FileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Pre-req 1.File Location 2. file content
		
		String Location = "D:\\WorkSpace\\UsingFileWriterClass.txt"; //Writes in specific location
		
		//String Location = "UsingFileWriterClass.txt"; //Writes inside the project
		
		String Content = "Writing into a file using FileWriter Class";
		
		FileWriter filewriter = new FileWriter(Location);
		filewriter.write(Content);
		filewriter.close();
		
		
		
		
	}

}
