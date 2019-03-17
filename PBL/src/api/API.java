package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class API {
	
	public static void WriteToFile(String input) throws IOException {
		String str = input;
	    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
	    writer.write(str);
	     
	    writer.close();
	}
	
	public static String ReadFromFile(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();

		while (line != null) {
		    sb.append(line);
		    sb.append(System.lineSeparator());
		    line = br.readLine();
		}
		String everything = sb.toString();
		
		br.close();
		
		
		return everything;
	}
	
}
