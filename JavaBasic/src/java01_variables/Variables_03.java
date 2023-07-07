package java01_variables;

public class Variables_03 {

	public static void main(String[] args) {

		int number;
		//	-> 변수를 처음 할당받으면 어떤 값이 저장되어있을 지 모른다
		//	-> 변수를 처음 선언하면 "쓰레기값"이 저장되어 있다
		
		
		//변수 대입(초기화)
		number = 123;
		
		
		//	-> 자바 언어는 "쓰레기값"이 저장된 변수를 사용하면
		//	 문법 에러로 처리한다
		System.out.println( number );
		
		System.out.println("----------------");
		
		//선언과 동시에 초기화
		int number2 = 8769;
		//	-> 쓰레기값이 들어가지 않고 곧바로 값이 초기화 된다
		
		
		System.out.println(number2);
		
		//----------------------------------------------------------
		
		//다른 타입의 자료형들도 마찬가지로 초기화가 가능하다
		
		String name; //스트링은 자료형이 아닌 참조자료형(class)
		name = "Alice";
		
		char alpha = 'T';
		
		double pi = 3.14;
		
		boolean isRight = true;
		
		System.out.println(name);
		System.out.println(alpha);
		System.out.println(pi);
		System.out.println(isRight);
		
		
	}

}
