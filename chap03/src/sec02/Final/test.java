package sec02.Final;

public class test {

	public static void main(String[] args) {
		//1. * 
		/*
		byte b =5;
		b = -b;// 부호 연산시 int 형으로 바꾸기 때문에
		int result = 10/ b;  
		System.out.println(result);
		*/
		
		//2 *
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); // z = 11 + 20 : x는 = 실행전에 1이 증가 y는 실행후 1증가이기 떄문
		System.out.println(z); // 31
		
		//3
		// while(stop != true) or while(stop == False)
		
		//4
		int pencils =534;
		int students = 30;
			// 학생 한명이 가져가는 연필 개수
		int pencilsPerStudendt = (pencils/students);
		System.out.printf("학생 1명당 가져간 연필은 %d개 입니다\n",pencilsPerStudendt);
			// 남은 연필 개수
		int pencilsLeft = (pencils%students);
		System.out.printf("남은연필은 %d개 입니다. \n",pencilsLeft);
		
		//5 **
		int var1 = 5;
		int var2 =2;
		double var3 = var1/ var2;	//2.0 여기서 둘의 결과는 int 의 결과인 2만 나옴 (double)을 써주면 해결
		int var4 = (int) (var3 * var2);
		System.out.println(var4);
		
		//6 십이하를 버리는 코드 
		int value = 356;
		System.out.println(value/100*100);
		
		//7 *
		float varf1 = 10f; // float 실수 10.0
		float varf2 = varf1 / 3; // 계산시에는 double로 계산됨 그 결과를 float으로 저장함
		if ( varf2 ==0.1) { // float 는 소숫점 자리가 있다면 f 가 필요 따라서 varf == 0.1f로 해주어야 소숫점 자리를 인식함 
			System.out.println("10%입니다.");
		}else {
			System.out.println("10%가 아닙니다.");
		}
		
		//8
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthBottom+lengthTop)*height/2.0); // 나누어줄때 2.0 즉 실수로 나누어주면 결과도 실수
		System.out.println(area);
		
				
		//10
		int varr1 = 10;
		int varr2 = 3;
		int varr3 = 14;
		double varr4 = varr1*varr1*Double.parseDouble(varr2+"."+varr3);
		// varr2+"."+varr3 의 결과는 3.14의 string 타입이다 따라서 string 을 double 로 바꿔주면되
		// Double.parseDouble 사용
		System.out.println("원의넓이:"+varr4);
		
		
		//12
		int X = 10;
		int Y = 5;
		System.out.println((X>7)&&(Y<=5)); //true
		System.out.println((X%3==2)||(Y%2 != 1)); //false
		
		//13
		int Value = 0;
		
		Value = Value + 10;		// Value += 10;
		Value = Value - 10;		// Value -= 10;
		Value = Value * 10;		// Value *= 10;
		Value = Value / 10;		// Value /= 10;
		
		//14
		int score = 85;
		String result = (!(score>90)) ? "가" : "나"; // 1. score>90 = false 2. !(false) = true 3. true 이면 "가"
		System.out.println(result);		//"가"


	}

}
