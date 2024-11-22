package sec05.Fainal;

public class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstanve(){
		return singleton;
	}
}
