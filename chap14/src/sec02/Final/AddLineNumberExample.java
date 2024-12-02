package sec02.Final;
import java.io.*;
public class AddLineNumberExample {

	public static void main(String[] args) throws Exception{
		String filePath = "src/sec02/Final/AddLineNumberExample.java";
		
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int count = 1;
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			
			if(data.trim().equals("")) {
				System.out.println(count+"----------여	백----------");
			}else {
			System.out.println(count+": "+data);
			}
			count++;
		}
		fr.close();
		br.close();
	}
}








