package java00_javaReview;

import java.util.Scanner;

public class JavaRivew_IfQuiz_03 {
	public static void main(String[] args) {
	
		// + 두 수를 입력 받아 큰 수를 출력하시오
		//  >> Input Number1 : 44
		//  >> Input Number2 : 88
		//  >> 88 이 더 큰 수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + "이(가) 더 큰 수");
		} else if (num1 < num2) {
			System.out.println(num2 + "이(가) 더 큰 수");
		} else {
			System.out.println(num1 + "와(과) " + num2 + "은(는) 같은 수");
		}
		
		
	}
}
