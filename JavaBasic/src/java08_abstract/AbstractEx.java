package java08_abstract;

public class AbstractEx {
	public static void main(String[] args) {
		
		Professor pf = new Professor("Alice", "컴퓨터");
		Student st = new Student("Bob", "자바");
		
		pf.display();
		st.display();
		
		System.out.println("-------------------------------");
		
//		Person p1 = new Person("Edward"); //추상클래스는 인스턴스 할 수 없다
		
		Person p2 = new Person("Favian") {//익명 클래스, 1회용 클래스
			@Override					  // ->추상클래스는 인스턴스 할 수 없지만, 예외적으로 가능하게 하는 방법
			public void display() {
				System.out.println("익명 클래스 테스트 출력");
			}
		};
		p2.display();
		
		System.out.println("-------------------------------");

		
		Person p3 = new Professor("Clare", "인공지능");
		Person p4 = new Student("Dave", "알고리즘");
		
		p3.display();
		p4.display();
		
		
		
		
	}
}
