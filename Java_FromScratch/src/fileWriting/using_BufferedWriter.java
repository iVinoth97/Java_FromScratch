package fileWriting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class using_BufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Pre-req 1.File Location 2. file content
		
				String Location = "D:\\WorkSpace\\UsingBufferedWriterClass.txt"; //Writes in specific location
				
				//String Location = "UsingFileWriterClass.txt"; //Writes inside the project
				
				String Content = "Writing into a file using BufferedWriter Class";
				
				FileWriter filewriter = new FileWriter(Location) ;
				BufferedWriter bufwriter = new BufferedWriter(filewriter);
				bufwriter.write(Content);
				bufwriter.close();
				
	}

}
