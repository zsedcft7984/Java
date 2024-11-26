package sec02.Fianl;

public class MySqlDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("MySql에 검색");
	}
	@Override
	public void insert(){
		System.out.println("MySql에 삽입");
	}
	@Override
	public void update(){
		System.out.println("MySql에 수정");
	}
	@Override
	public void delete(){
		System.out.println("MySql에 삭제");
	}
}
