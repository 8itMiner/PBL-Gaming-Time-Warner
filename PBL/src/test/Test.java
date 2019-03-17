package test;

import java.io.IOException;

import api.API;

public class Test {

	public static void main(String[] args) throws IOException {
		API.WriteToFile("5");
		String output = API.ReadFromFile("output.txt");
		int outputInt = Integer.valueOf(output);
		System.out.println(outputInt);
		
		
	}
	
}
