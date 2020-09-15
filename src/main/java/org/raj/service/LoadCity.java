package org.raj.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.raj.entity.Connection;

/** Main Class to open the file city.txt from resource and create connections 
 * 
 * author : Raj Ganesh
 * Input : city.txt
 * Output : Connections created based on the text from input file
 * 
 * **/

public class LoadCity {
	
	public static List<Connection> connections = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		
		LoadCity.readData();

	}
		
	/** Sub Class to open the file city.txt from resource and create connections  
	 * 
	 * @throws IOException
	 */
	public static void readData()throws IOException {
	
		FileReader fileReader = new FileReader("src/main/resources/city.txt");
		
		try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String line = bufferedReader.readLine();
			while(line != null) {
				//System.out.println(line);
				String connection[] = line.split(",");
				Connection c1 = new Connection(connection[0].trim(), connection[1].trim());
				connections.add(c1);
				line = bufferedReader.readLine();
			}
		}
		
	}

}
