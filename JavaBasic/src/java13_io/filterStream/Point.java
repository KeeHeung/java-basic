package java13_io.filterStream;

import java.io.Serializable;

//직렬화 하여 스트림에 넣어줄수 있게 만들어줌
public class Point implements Serializable {
	
	private int x;
	private int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

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
