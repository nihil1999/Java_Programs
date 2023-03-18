/**
 * 
 */
package files_and_io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author logan
 *
 */
public class File_Outputstream_inputstream {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws IOException 
	 */
	
	public static void toGetFile() throws FileNotFoundException
	{
		FileInputStream fi=new FileInputStream("/home/logan/Documents/Demodoc.txt");
		
		File f=new File("/home/logan/Documents/Doc_without_string.txt");
		FileOutputStream fo=new FileOutputStream(f,true);
		DataOutputStream d=new DataOutputStream(fo);
		try 
		{
			f.createNewFile();
			int a=0;
			while((a=fi.read())!=-1)
				{
					if(!(a>=48 && a<=57))
						fo.write((char)a);
				}
			d.close();
			fi.close();
			System.out.println("File saved");
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		toGetFile();
	}

}
