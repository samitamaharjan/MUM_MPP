package readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String filepath = "readme.txt";
		String content = getFileContent(filepath);
		System.out.println(content);
	}
	
	public static String getFileContent(String filepath) throws FileNotFoundException, IOException { 
		StringBuilder sb = new StringBuilder();
	    try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		 }
		return sb.toString();
	}

}
