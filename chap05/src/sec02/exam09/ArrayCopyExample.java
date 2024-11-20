package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldIntArray ={"java","array","copy"};
		String[] newIntArray = new String[5];
		
		for (int i =0; i <oldIntArray.length;i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for (int i =0; i <newIntArray.length;i++) {
			System.out.println(newIntArray[i]);
		}
	}

}
