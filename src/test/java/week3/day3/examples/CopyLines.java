package week3.day3.examples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;

public class CopyLines {
    public static void main(String[] args)  {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("src/main/resources/xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("src/main/resources/characteroutput.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
            
                outputStream.println(l);
            }
        }catch (FileNotFoundException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    		
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        finally {
            if (inputStream != null) {
                try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
   
        
}