package sec02.Final;
class CheckBox{
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	static interface OnSelectListener{
		void onSelect();
	}
}

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox cbox = new CheckBox();
		cbox.setOnSelectListener(
			new CheckBox.OnSelectListener() {
				@Override
				public void onSelect() {
					System.out.println("배경을 변경합니다.");
				}
		}	
		);
		cbox.select();
	}

}
