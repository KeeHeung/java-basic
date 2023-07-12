package java07_inherit.practice.controller;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Rectangle;

public class Main {
	public static void main(String[] args) {
		
//		* 구현내용
//		Circle 배열 초기화 : 3개
//		Rectangle 배열 초기화 : 3개
//		각각 draw() 출력 처리	
		
		//Circle형 배열
		Circle[] c1 = new Circle[3];
		c1[0] = new Circle();
		c1[1] = new Circle(3,6,22);
		c1[2] = new Circle(4,7,22);
		
		c1[0].draw();
		System.out.println("------------------");
		c1[1].draw();
		System.out.println("------------------");
		c1[2].draw();
		
		System.out.println("==================");
		
		//Rectangle 객체 생성
		Rectangle[] r1 = new Rectangle[3];
		r1[0] = new Rectangle();
		r1[1] = new Rectangle(1,2,3,4);
		r1[2] = new Rectangle(5,6,32,56);
		
		r1[0].draw();
		System.out.println("------------------");
		r1[1].draw();
		System.out.println("------------------");
		r1[2].draw();

		
		
		
		
		
		
		
		
		
	}
}
