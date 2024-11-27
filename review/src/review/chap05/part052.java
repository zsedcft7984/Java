package review.chap05;
/**
 * 참조 타입 배열은 여러 개의 값을 일렬로 보관하는 자료 구조
 * 
 * 자바 배열의 특징 
 * 1. 배열 안의 값들은 모두 같은 자료형이야 한다.
 * 2. 배열의 각 값들에는 인덱스 번호가 매겨진다. 0부터 시작된다.
 * 
 * 
 **/
public class part052 {
	public static void main(String[] args) {
		//초기화 방법 1 : 선언과 동시해 초기화
		int [] arr1 = {1,2,3,4,5};
		
		//초기화 방법 2 : 선언후 나중에 new를 통해 입력
		int [] arr2;  
		arr2 = new int[] {1,2,3,4,5};
		
		//초기화 방법 3 : 선언후 크기 설정 후 대입
		int [] arr3 = new int[5];
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		arr3[3] = 4;
		arr3[4] = 5;
		
		//배열의 기본 메소드
		int a =arr3.length;
		
		// 다차원 배열 : [] 여러개 사용하면 됨
		int [][] arr4 = {{1,2,3,4,5},{6,7,8,9,10}};
		
		for(int i =0; i < arr4.length; i++) {
		
			for(int j =0; j <arr4[i].length; i++) {
			
		}
		
		// java의 배열의 특이한점 각 행에대헤서 접근이 되서
		// 모든행이 같은 길이일 필요가 없음
		int [][] arr5 = new int [5][];
		
	}
	}	
}
