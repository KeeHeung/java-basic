package java07_inherit.practice.model;

public class Rectangle extends Point {
	
	private int width;		//가로너비
	private int height;		//세로높이
	
	public Rectangle() {
		
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
		
	}
	
	@Override
	public void draw() {
		//중심점
		System.out.print("기준점 : ");
		super.draw();
		
		//면적
		System.out.printf("면적 : %.1f\n",width*(double)height); //가로 * 세로
		
		//둘레
		System.out.printf("둘레 : %.1f\n", 2*width*(double)height); // 2 * (가로 + 세로)
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}
