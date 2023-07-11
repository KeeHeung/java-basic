package java06_class.methodQuiz;

public class MethodQuiz {
	
	//Q1.	1~100출력 기능
	
	//Q2.	전달인자만큼 "Hello"를 반복해서 출력하는 기능
	
	//Q3.	전달인자 숫자만큼, 전달인자 문자열을 출력하는 기능
	
	//------------------------------------------------------------------------
	
	//인스턴스 변수 선언
	private int num;
	private String hello;
	
	
	

	//Q1. 메소드(1~100출력)
	public void oneToHundredPrint() {
		for(num=1; num<=100;num++) {
			System.out.println(num);
		}
	}
	
	//Q2. 메소드(전달인자만큼 "Hello"를 반복해서 출력)
	public void printHello(int num) {
		for(int i=0; i<num; i++)
		System.out.println("Hello");
	}
	
	//Q3. 메소드(전달인자 숫자만큼, 전달인자 문자열을 출력)
	public void printStringLength(int num, String str) {
		for(int i=0; i<num; i++) {
			System.out.println(str);
		}
	}
	
	
	
	
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String getHello() {
		return hello;
	}
	
	public void setHello(String hello) {
		this.hello = hello;
	}
	

}
