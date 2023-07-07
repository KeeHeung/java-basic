package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_02 {
	
	// + 입력한 데이터가 3의 배수인지 판별하시오
	// (% 연산자 사용)
	//  >> Input Number : 7
	//  >> 3의 배수가 아닙니다
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		
		if( num<0 ) {
			System.out.println(num+"은/는 음수 입니다");
		}
		
		if( num % 3 == 0 ) {
			System.out.println(num+"은/는 3의 배수 입니다");
		}
		
		if( num % 3 != 0 ) {
			System.out.println(num+"은/는 3의 배수가 아닙니다");
		}
		
	}
}
