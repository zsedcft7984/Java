package sec01.exam02;

public class Member {
	public String id;
	
	public Member (String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {	//instansceof 입력밭은 값(앞)의 타입이 뒤의 타입과 같은지
			Member member = (Member) obj;
			if(id.equals(member.id)){
				return true;
			}
		}
		return false;
	}
	
}
