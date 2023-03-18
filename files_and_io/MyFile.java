/**
 * 
 */
package files_and_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author logan
 *
 */
public class MyFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creating_File();
	}

	private static void creating_File() {
		// TODO Auto-generated method stub
		File f=new File("/home/logan/Documents/Demodoc.txt");
		String msg="Created new file.hai";
		byte[] by=msg.getBytes();
		try {
			
			System.out.println(f.createNewFile());
			System.out.println(f.exists());
			System.out.println(f.getName());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			
			FileOutputStream fo=new FileOutputStream(f,true);
			fo.write(by);
			fo.flush();
			fo.close();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
