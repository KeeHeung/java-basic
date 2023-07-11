package java07_inherit.model;

public class Point {
	
	//멤버필드 선언
	protected int x;
	protected int y;
	
	//디폴트 생성자
	public Point() {
		
	}
	
	//매개변수있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//메소드 //x, y 좌표값 출력 ex) (3, 4)
	public void draw() {
		System.out.println(x +", " + y);
	}
	
	//get,set 메소드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}
