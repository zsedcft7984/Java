package sec01.exam06;
import java.io.*;
public class ReadExample {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test3.db");
		
		byte [] buffer = new byte[5];
		
		int redadByteNum = is.read(buffer,2,3);
		
		if(redadByteNum == -1) {
			for(int i =0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}

}
