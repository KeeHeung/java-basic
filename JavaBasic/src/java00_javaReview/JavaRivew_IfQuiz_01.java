package java00_javaReview;

import java.util.Scanner;

public class JavaRivew_IfQuiz_01 {
	public static void main(String[] args) {
		//  + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
		//  >> Input Number : -3
		//  >> 음수입니다
		
		//입력객체 생성과 참조형 변수 초기화
		Scanner sc = new Scanner(System.in);
		
		//숫자 입력받기
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		System.out.print(">> ");
		
		//제어문 if문 작성
		if( num == 0) {
			System.out.println(num + "은/는 정수 입니다.");
		} else if(num > 0) {
			System.out.println(num + "은/는 양수 입니다.");
		} else{
			System.out.println(num + "은/는 음수 입니다.");
		}
		
		
		
		
		
		
		
		
	}
}
