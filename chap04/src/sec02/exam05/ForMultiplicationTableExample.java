package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		int i,j;
		for(i = 2; i < 10;i++) {
			System.out.println("***"+i+"단***");
			for(j =1; j <10; j++) {
				System.out.print(j*i + " ");
			}
			System.out.print("\n");
		}

	}

}
