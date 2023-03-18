/**
 * 
 */
package files_and_io;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author logan
 *
 */
public class File_withFileWriter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void toWriteFile() throws IOException
	{
		System.out.println("Enter message");
		FileWriter fw=new FileWriter("New_File.txt",true);
		DataInputStream dis=new DataInputStream(System.in);
		
		int a=dis.read();
		while((char)a!='?')
		{
			if(!(a>='0' && a<='9')) {
			fw.write(a);
			}
			a=dis.read();
		}
		fw.flush();
		fw.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		toWriteFile();
	}

}
