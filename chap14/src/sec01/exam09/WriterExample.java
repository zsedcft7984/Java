package sec01.exam09;
import java.io.*;

public class WriterExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char []array = {'A','B','C','D'};
		
		writer.write(array,1 ,3);
		
		writer.flush();
		writer.close();
	}
	

}
