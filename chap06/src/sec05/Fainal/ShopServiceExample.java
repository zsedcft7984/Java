package sec05.Fainal;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService obj1 =ShopService.getInstanve();
		ShopService obj2 =ShopService.getInstanve();
		
		if(obj1==obj2) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");

		}

	}

}
