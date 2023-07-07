package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_01{
	
	//  + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
	//  >> Input Number : -3
	//  >> 음수입니다

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//입력객체
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		
		if( num==0 ) {
			System.out.println(num+"은/는 정수 입니다");
		}
		
		if( num>0 ) {
			System.out.println(num+"은/는 양수 입니다");
		}
		
		if( num<0 ) {
			System.out.println(num+"은/는 음수 입니다");
		}
		
		
	}

}
