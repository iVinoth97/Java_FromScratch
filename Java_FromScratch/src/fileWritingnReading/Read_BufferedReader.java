package fileWritingnReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_BufferedReader {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Location = "D:\\WorkSpace\\ReadUsingBufferedReader.txt"; //Writes in specific location
		
		FileReader reader = new FileReader(Location);
		BufferedReader bufread = new BufferedReader(reader);
		 
		String currentLine;
		while ((currentLine =bufread.readLine())!=null) {
			System.out.println(currentLine);
			
		}
		bufread.close();
	}

}
