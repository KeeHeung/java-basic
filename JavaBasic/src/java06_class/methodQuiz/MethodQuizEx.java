package java06_class.methodQuiz;

public class MethodQuizEx {
	public static void main(String[] args) {
		
		//객체 변수명 선언, 객체생성
		MethodQuiz md = new MethodQuiz();
		
		//Q1. 메소드 실행( 1~100까지 출력)
		md.oneToHundredPrint();
		
		System.out.println("--------");
		
		//Q2. 메소드 실행( 전달인자만큼 "Hello"를 반복해서 출력)
			
		md.printHello(5);
		
		System.out.println("--------");
		
		//Q3. 메소드 실행(전달인자 숫자만큼, 전달인자 문자열을 출력)
		
		md.printStringLength(10, "전달인자 문자열");
		
		
		
	}
}
