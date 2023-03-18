/**
 * 
 */
package files_and_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author logan
 *
 */
public class File_withFileReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void toRead() throws IOException
	{
		FileReader fr=new FileReader("New_File.txt");
		FileWriter fw=new FileWriter("/home/logan/Documents/NewDoc");
		try {
		int a=0;
		while((a=fr.read())!=-1)
		{
			System.out.print((char)a);
			fw.write((char)a);
		}
		}
		finally {
			fr.close();
			fw.close();
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		toRead();
	}

}
