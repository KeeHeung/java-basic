package java06_class.overloading;

import java.util.Scanner;

public class OverloadingEx {
	public static void main(String[] args) {
		
		//입력객체 생성
		Scanner sc = new Scanner(System.in);
		
		//객체 생성
		Overloading ol = new Overloading();
		
		//메소드 호출
		System.out.println("---display() ---");
		ol.display();
		
		System.out.println("--------");
		
		// (44,56) 로 출력되도록 코드 작성!
		
		//입력 메소드 호출
		System.out.print("숫자 44 입력 : ");
		ol.setX(sc.nextInt());
		System.out.print("숫자 56 입력 : ");
		ol.setY(sc.nextInt());
		
//		System.out.println(ol.getX());
//		System.out.println(ol.getY());
//		ol.display();
		
		//display메소드 호출
		System.out.println("---display() ---");
		ol.display();
		
		
	}
}
