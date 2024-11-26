package sec02.Fianl;

public class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("Oracle에 검색");
	}
	@Override
	public void insert(){
		System.out.println("Oracle에 삽입");
	}
	@Override
	public void update(){
		System.out.println("Oracle에 수정");
	}
	@Override
	public void delete(){
		System.out.println("Oracle에 삭제");
	}
}
