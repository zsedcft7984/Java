package sec01.exam01;

public class Member {
	public String id;
	
	public Member (String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {	//instansceof 입력밭은 값(앞)이  조건(뒤)에 맞는지 확인
			Member member = (Member) obj;
			if(id.equals(member.id)){
				return true;
			}
		}
		return false;
	}
	
}
