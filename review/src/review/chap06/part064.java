package review.chap06;
class INvestor{
	void buyStock() {
		System.out.println("주식을 삽니다");
	}
	void buyStock(String company) {
		System.out.println(company+"의 주식을 삽니다");
	}
	int sellStock() {
		System.out.println("주식을 판다");
		return 58100;
	}
}
public class part064 {

	public static void main(String[] args) {
		INvestor i = new INvestor();
		
		i.buyStock();
		i.buyStock("삼성");
		i.sellStock();
	}

}
