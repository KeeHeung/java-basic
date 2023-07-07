package java01_variables;

public class Variables_05 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//학생의 나이
//		int student age; //에러, 띄어쓰기 금지
		
		int student_age; //snack case, 뱀표기법
		
		int studentAge; //camel case, 낙타 등 표기법
		
		//자바에서는 낙타등표기법(Camel Case)를 권장하고 있다
		
		//----------------------------------------------------
		
//		int 1stNumber; //에러, 숫자로 시작하면 안된다
		
		int firstNumber;
		
		//----------------------------------------------------
		
//		int int; //에러, 예약어(키워드)는 사용할 수 없다
		
		int intNum;
		int intData;
		
		//----------------------------------------------------

		//**의미없는 변수명을 사용하지 않도록 한다!!!
		
		int a;
		int b;
		int c;
		
		//----------------------------------------------------
		
		
		// 에러
//		int _;
		
		int $;
		int ____;
		int ____$$____;
		int _$_$_$_$$$_$$;
		____$$____ = 123;
		System.out.println(____$$____);

		//----------------------------------------------------

		int number;
		
		int number_; //권장하지 않는 네이밍방법
		int _number; //
		int $number; //

		int number1; //권장 네이밍방법
		int number2; //
		int number3; //
		
		//----------------------------------------------------

		//한글로 식별자를 설정하면 안된다!
		
		double 넓이 = 543.32;
		System.out.println(넓이);
		
		
		
	}

}
