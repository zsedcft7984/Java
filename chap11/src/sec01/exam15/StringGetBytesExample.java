package sec01.exam15;

import java.io.UnsupportedEncodingException;

//자바에서 기본인코딩상 영문은 1바이트, 한글은 3byte 크기
public class StringGetBytesExample {

	public static void main(String[] args) {
		String str= "안녕하세요.";
		byte[] b1 = str.getBytes();
		System.out.println("b1.length :"+ b1.length);
		String str1 = new String(b1);
		System.out.println("b1->String"+str1);
		
		try {
			
			byte[]b2 =str.getBytes("EUC-KR");
			System.out.println("b2.length"+ b2.length);
			String str2 = new String(b2,"EUC-KR");
			System.out.println("b1->String"+str2);
			
			byte[]b3 =str.getBytes("UTF-8");
			System.out.println("b2.length"+ b3.length);
			String str3 = new String(b3,"UTF-8");
			System.out.println("b1->String"+str3);
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
