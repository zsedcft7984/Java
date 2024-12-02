package sec01.exam05;
import java.io.*;
public class ReadExample {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test2.db");
		
		byte [] buffer = new byte[100];
		while(true) {
			int redadByteNum = is.read(buffer);
			if(redadByteNum == -1) break;
			for(int i =0; i<redadByteNum; i++) {
				System.out.println(buffer[i]);

			}

		}
		is.close();
	}

}
