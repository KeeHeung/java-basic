package java07_inherit.practice.model;

public class Circle extends Point {
	
	//멤버필드 선언
	private int radius;
	
	//디폴트 생성자
	public Circle() {
		
	}
	
	//매개변수있는 생성자
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		
	}
	
	//메소드 오버라이딩 //원의 x, y좌표, 면적과 둘레 계산 출력함
	@Override
	public void draw() {
		//원의 중심
		System.out.print("원의 중심 : ");
		super.draw();
		
		//원의 면적
		System.out.printf("원의 면적 : %.1f\n",Math.PI * radius * radius);
		
		//원의 둘레
		System.out.printf("원의 둘레 : %.1f\n",2 * Math.PI * radius);
	}
	
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

}
