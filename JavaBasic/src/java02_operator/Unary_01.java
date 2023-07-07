package java02_operator;

public class Unary_01 {
	
	public static void main(String[] args) {
		
		//단항연산자 - 부호, Sign
		//	+ -
		//------------------------------------------------------
		
		int num1 = -7;	//음수
		int num2 = +7;	//양수
		
		System.out.println( num1 );

		System.out.println( -num1 );
//		System.out.println( -(-7) );	//변수값 불러오기
//		System.out.println( 7 );		//부호 변환
		
		//------------------------------------------------------
		
		//	!		논리부정연산자
		System.out.println(num1 != num2);
		
		//	(type)	형변환연산자
		System.out.println((double)num1);
		
		//	~		비트단위 논리 부정 연산자
		System.out.println(~num1);
		System.out.println(~num2);
		System.out.println(~-128);
		System.out.println(~127);
		
		//	.		참조 연산자
		
		
		
		
	}

}
