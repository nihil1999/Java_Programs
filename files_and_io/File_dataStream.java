/**
 * 
 */
package files_and_io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author logan
 *
 */
public class File_dataStream {

	/**
	 * @param args
	 */
	
	public static void fileBy_dataStream() throws IOException
	{
		File f=new File("/home/logan/Documents/Demodoc1.txt");
		f.createNewFile();
		String msg="Created to test DataOutputStream.";
		if(f.exists())
		{
			byte[] byt=msg.getBytes();
			FileOutputStream fo=new FileOutputStream(f,true);
			DataOutputStream ds=new DataOutputStream(fo);
			
			ds.write(byt);
			//ds.writeDouble(10.0);
			//ds.writeBoolean(true);
			//ds.writeInt(1);
			//ds.close();
			System.out.println("Edited successfully");
		}
		else
			System.out.println("File not exist");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fileBy_dataStream();
	}

}
