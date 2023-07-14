package java00_javaReview;

import java.util.ArrayList;

public class JavaReview_Binary01 {
	public static void main(String[] args) {

		System.out.println("------------------------------------------");

		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		System.out.println(intList);
		System.out.println(intList.get(1));
		System.out.println(intList.get(0));
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("테스트");
		stringList.add("TEST");
		System.out.println(stringList);
		System.out.println(stringList.get(1));
		System.out.println(stringList.get(0));
		
		System.out.println("------------------------------------------");
		
		String stringNum = "123";
		int intNum = Integer.parseInt(stringNum);						//문자열자료형의 데이터값을 정수형자료형으로 분석해주는 클래스
		System.out.println("Integer.parseInt.테스트 : " + intNum + 123);	//"123"문자열을 123(int)로 변환후 더하기를 통해 TEST
		
		int testInt  =  321;
		String stringNum1 = String.valueOf(testInt);					//정수자료형의 데이터값을 문자열자료형으로 분석해주는 클래스
		System.out.println("String.valueOf.테스트 : " + stringNum1+"123");			//321 정수형에 문자열을 붙여주어 TEST
		
		
		//-----------------------------------------------------------------------------
		
		//이항 연산자 대입
		
		int num1 = 5;
		
		int num2, num3, num4, num5;
		
		//이항연산자에서의 대입(=)은 우측 데이터값부터 좌측공간으로 우선순위를 가지며 대입된다
		num5 = num4 = num3 = num2 = num1; //num5 = 5;
		
		System.out.println(num5);
		
		//복합 대입 연산자의 종류
		// += -= *= /= %=
		
		int num6 = 20;
		int num7 = 10;
		
//		num6 += num7;
//		num6 -= num7;
//		num6 *= num7;
//		num6 /= num7;
		int num8 = num6/num7;	// <-위의 num6 데이터 값과 같다. 복합 대입연산자는 좌측 데이터값 (기호) 우측데이터값 을 좌측에 대입한다.
		System.out.println(num8);
		
		
		
		
	}

}
