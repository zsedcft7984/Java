package sec02.exam01;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] score = {93, 90,87};
		
		System.out.println("score[0]:" + score[0]);
		System.out.println("score[1]:" + score[1]);
		System.out.println("score[2]:" + score[2]);
		
		int sum = 0;
		for(int i = 0; i <3; i++) {
			sum += score[i];
		}
		System.out.println("총합:" + sum);
		double avg = (double) sum/3;
		System.out.println("평균:" + avg);
	}

}
