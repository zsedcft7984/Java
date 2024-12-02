package sec02.exam02;
import java.io.*;

public class NonbufferVsBufferExample {
	public static void main(String[] args) throws Exception {
		//기본 스트림 생성
		String originalFilePath1=
				"originalFile1.jpg";
		String targetFilePath1 = "targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);

		// 기본 + 버퍼 보조
		String originalFilePath2 =
				"originalFile2.jpg";
		String targetFilePath2 = "targetFile2.jpg";
		FileInputStream fis2= new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);

		long nonBufferTime = copy(fis,fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t"+ nonBufferTime +"ns");
		
		long bufferTime = copy(fis2,fos2);
		System.out.println("버퍼를 사용했을 때:\t"+ bufferTime +"ns");
		
		fis.close();
		fos.close();
		fos2.close();
	}
	
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os )throws Exception{
		long start =System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1)break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end-start);
	}
}
