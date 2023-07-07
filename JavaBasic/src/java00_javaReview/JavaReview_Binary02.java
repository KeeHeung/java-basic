package java00_javaReview;

import java.util.ArrayList;

public class JavaReview_Binary02 {
	public static void main(String[] args) {

		//이항연산자 관계,비교
		
		//	<=		//좌측피연산자가 우측피연산자보다 크지 않다(작거나 같다)
		//	>=		//좌측피연산자가 우측피연산자보다 작지 않다(크거나 같다)
		//	==		//좌측피연산자와 우측피연산자가 동일하다
		//	!=		//좌측피연산자와 우측피연산자가 같지 않다(다르다)
		//	<		//좌측피연산자가 우측피연산자보다 작다
		//	>		//좌측피연산자가 우측피연산자보다 크다
		
		//	피연산자들의 결과값은 참/거짓(논리자료형)으로 반환한다
		//						->true/false(boolean type)

		
		
		int num1 = 30;
		int num2 = 40;
		
		//연산의 결과값이 논리형(boolean)이므로 result의 자료형은 boolean으로 선언한다

//		boolean result = num1<=num2;	//true
//		boolean result = num1>=num2;	//false
		
//		boolean result = num1==num2;	//false
//		boolean result = num1!=num2;	//true
		
//		boolean result = num1>num2;		//false		
		boolean result = num1<num2;		//true


		System.out.println(result);
		
		
		
		
		
	}
}
