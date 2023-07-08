package java00_javaReview;

import java.util.Scanner;

public class JavaRivew_IfQuiz_02 {
	public static void main(String[] args) {
	
		// + 입력한 데이터가 3의 배수인지 판별하시오
		// (% 연산자 사용)
		//  >> Input Number : 7
		//  >> 3의 배수가 아닙니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		System.out.print(">> ");
		
		if(num%3 ==0 ) {
			System.out.println(num + "은/는 3의 배수 입니다.");
		} else if(num == 0) {
			System.out.println("은/는 0 입니다.");
		} else {
			System.out.println(num + "은/는 3의 배수가 아닙니다.");
		}
		
		
		
		
		
		
	}
}
