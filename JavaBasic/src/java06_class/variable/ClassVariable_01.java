package java06_class.variable;

public class ClassVariable_01 {
	
	//멤버 필드
	private int num;
	private String name = "Alice";
//	private int num = 999; 
//	private String name = "Alice";
	
	public ClassVariable_01() {
		num = 999;
//		name = "Alice";
	}
	
	//멤버 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
