package sec01.exam10;
import java.io.*;

public class WriterExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		
		String str ="ABC";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
	}
	

}
