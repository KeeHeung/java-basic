package java05_array;

public class Array_04 {
	public static void main(String[] args) {

		//문자열 String
		//	내부 데이터에 대한 처리를 char[]를 이용한다
		
		// 단, char[] 과 String 은 같은 데이터타입은 아니다
		
		//-------------------------------------------------
		
		String str = "Apple";	//문자열
		
		char[] chArr = { 'A','p','p','l','e'}; //문자(char) 배열
		
		//-------------------------------------------------

		System.out.println( "문자열의 길이 : " + str.length() );		//문자열의 길이
		
		System.out.println( "문자 배열의 길이 : " + chArr.length );		//문자 배열의 길이
		
		//-------------------------------------------------

	    System.out.println("문자열의 세번째 글자 : " + str.charAt(2));	//String에서 char를 뽑아내는 메소드
	    
	    System.out.println("문자 배열의 네번째 글자 : " + chArr[3] );
		
		
		
		
	}
}
