package sec01.exam08;
//스킵권장
public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 =System.nanoTime();
		
		int sum =0;
		for(int i=1; i<=100000; i++) {
			sum +=1;
		}
		
		long time2 =System.nanoTime();
		
		System.out.println("1~100000까지의 합: "+sum);
		System.out.println("소요시간"+(time2-time1)+"초");
	}

}
