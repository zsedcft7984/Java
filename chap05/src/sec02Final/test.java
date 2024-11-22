package sec02Final;

public class test {

	public static void main(String[] args) {
		// 1. 2
		// 2. 3 : boolean 값의 초기값은 false 임
		// 3. array.length는 행의 수 : 3 / array[2].length 는 2번행의 인덱스 수 : 3
		
		// 4. Exercise 04
		int max = 0;
		int[] array1 = {1,5,3,8,2};
		//작성위치
		//for(int i : array1){ 로 하고  array1[i] 대신  i 써도 같은 결과 나옴
		for(int i =0; i <array1.length; i++) {
			if(array1[i]>max) {
				max = array1[i];
			}
		}
		System.out.println("max: " + max);
		
		// 5. Exercise 05
		int[][] array2 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		// 작성위치
		int count = 0;
		
		for(int i =0; i <array2.length; i++) {
			for(int j =0; j <array2[i].length; j++) {
				sum +=array2[i][j];
				count++;
			}
		}	
		
		// 항상된 for 문 이면
		/*
		for(int[] i : array2) {
			for(int j : i) {
				sum +=j;
				count++;
			}
		}
		*/
		avg = (double) sum/count;
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
		
		
		
	}

}
