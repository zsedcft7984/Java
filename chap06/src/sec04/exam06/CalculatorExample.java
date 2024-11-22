package sec04.exam06;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		double result1=myCal.areaRectangle(5);
		double result2=myCal.areaRectangle(5,6);
		
		System.out.println("정사각형의 넓이="+result1);
		System.out.println("직사각형의 넓이="+result2);
	}
	
}
