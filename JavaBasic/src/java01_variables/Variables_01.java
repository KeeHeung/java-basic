package java01_variables;

//	한 줄 주석

/*
	문장 주석
	
	여러 줄을 주석으로 처리한다

 */


//한 줄 주석 토글(toggle) 단축키 : ctrl + shift + c

//에러,오류코드 수정하기 -> _______빨간 밑줄 참조하여 수정
//에러의 원인 먼저 파악하기, 자동수정도 이용해보기


public class Variables_01 { //클래스 정의
	
	//메인 메소드 - 프로그램 시작점
	public static void main (String[] args) {
		
//		System.out.println("동작 테스트"); <- 지우는것 보다는 주석처리로, 흔적 남겨두기
		
		//--------------------------------------------------------------------------------
		
//		System.out.println(); <- sysout 입력후 ctrl + space + enter
		
		System.out.println( 12345 );		//int [정수형 타입]
		System.out.println( 123.456 );		//double [실수형 타입]
		System.out.println( true );			//boolean [논리형 타입]
		System.out.println( 'A' );			//char, 단일 문자(글자 1개) [문자형 타입]
		
		System.out.println( "Hello" );		//String타입, 문자열 [참조형 데이터타입]
		
//		System.out.println('😊😊😊'); //유니코드를 이용한 이모지도 사용 가능
// 책에서는 chapter2. 변수와 자료형 부분임
		
		//--------------------------------------------------------------------------------
		
		//char형 - 정수 관계
		
		System.out.println('가');
		System.out.println((int)'가' );//char형 -> int 형 변환하여 출력: 44032
		
		System.out.println( 99 ); //int형
		System.out.println( (char)99 ); //int형 -> char형 변환하여 출력: 소문자 'c'
		System.out.println( (char)0x63 ); //int형(16진수) -> char형 변환하여 출력: 소문자 'c'
		
		
	}

}
