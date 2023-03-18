/**
 * 
 */
package files_and_io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author logan
 *
 */
public class File_outputStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void fileBy_bufferStream() throws IOException
	{
		File f=new File("/home/logan/Documents/Demodoc.txt");
		String msg="\nEdited by BufferOutputStream.";
		if(f.exists())
		{
			byte[] byt=msg.getBytes();
			FileOutputStream fo=new FileOutputStream(f,true);
			BufferedOutputStream bf=new BufferedOutputStream(fo);
			
			bf.write(byt);
			bf.close();
			System.out.println("Edited successfully");
		}
		else
			System.out.println("File not exist");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			fileBy_bufferStream();
	}

}
