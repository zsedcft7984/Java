package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar =new Car();
		
		myCar.setGas(10);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas 를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas가 없읍니다. 주입하세요.");
		}
	}

}
