/**
 * 
 */
package files_and_io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author logan
 *
 */
public class File_DataInputStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/logan/Documents/File_forDataOutputStream");
		f.createNewFile();
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(f,true));
		String s="Logan";
		dos.writeBytes(s);
		dos.close();
		DataInputStream dis=new DataInputStream(System.in);
		//BufferedReader br=new BufferedReader(); 
	}

}
