package sec01.Final;

class Member{
	
	private String id;
	private String name;
		
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
		}
	@Override
	public String toString() {
		return id+": "+name;
	}	
	
}
public class MemberExample {

	public static void main(String[] args) {
		Member member =new Member("blud","이파란");
		System.out.println(member);
	}

}
