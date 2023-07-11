package java07_inherit;

class Parent {
	String name;
	int age;
	
	public void display() {
		System.out.println("Parent 클래스 메소드");
	}
}

class Child extends Parent {
	int score;
	
	public void print() {
		System.out.println("Child 클래스 메소드");
	}
	
//	public void display() {
//		System.out.println("!!!!!!!!!!!!!!!!!!!");
//	}
	
	@Override //엣 오버라이딩 어노테이션
	public void display() {
		System.out.println("오버라이딩 메소드");
	}
	
	public void display(int num) {
		System.out.println("오버라이딩한 메소드를 오버로딩한 메소드"); // Override, Overload
	}
	
	//** 오버라이딩, Overriding
	//	메소드 재정의
	//	상속받은 메소드의 기능을 재정의하는 것
	//		->부모클래스의 정의된 메소드의 리턴타입, 이름, 매개변수 형식이 같아야 한다
	
	//** @Override 어노테이션
	//	오버라이딩 규칙이 잘 지켜졌는지 유효성 검사를 한다
	//	상속받은 메소드에 적용한다
	//	오버라이딩 문법에 맞지 않으면 문법 에러가 발생한다
	
	//** 어노테이션, Annotation(애너테이션)
	//	코드에 부가적인 기능, 의미를 부여할 때 사용한다
	//	특정 동작이나 문법을 코드에 간단히 적용시킬 수 있다
	//	@Override, @Deprecate, @Target, @Controller, @WebServlet, ...
	
}



public class InheritEx_01 {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		p.name = "Alice";
		p.age = 123;
		
		System.out.println("--------------");
		
		Child c = new Child();
		
		c.name = "Bob";		//Parent에 상속받은 필드
		c.age = 567;		//Parent에 상속받은 필드
		
		c.score = 1000;		//상속받지 않은 필드
		
		p.display();		//	Child클래스에 Parent클래스 메소드가 상속되어 같은 동작을 한다
		c.display();		//-> 상속을 받아 @Override로 재정의한 메소드
		
		c.print();			//상속받지 않은 메소드
		
		
	}
}
