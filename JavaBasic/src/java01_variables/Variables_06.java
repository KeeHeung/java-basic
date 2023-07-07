package java01_variables;

public class Variables_06 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//리터럴
		System.out.println(5436L);		//long형 리터럴 상수
		
		System.out.println(6.2345f);	//float형 리터럴 상수
		
		//-----------------------------------------------------
		
		//변수
		int num;
		num = 123;
		num = 456;
		num = 789;
		
		//-----------------------------------------------------
		
		//변수의 상수화
		//이름있는 상수
		
//		final int num; // 에러, 이미 사용한 변수명은 상수로 사용불가
		final int MAX; //최대값 **연결된 변수명을 동시에 바꾸는 단축키
					   // ->  shift + alt + r
		
		MAX = 100;
	
		//에러, 상수화된 변수는 값 대입을 한 번만 수행할 수 있다
//		max = 200;
		
		//-----------------------------------------------------
		
		//선택영역 대문자로 변환 : ctrl + shift + x
		//선택영역 소문자로 변환 : ctrl + shift + y

		final int WORKING_DAY = 20; //근무일 수
		
		System.out.println("이번 달은 " + WORKING_DAY + "일 근무 하셨습니다");
		
		// + 기호 : 문자열 연결 기호

		System.out.println("이번 달 급여 : " + WORKING_DAY * 150000 + "원 입니다.");
		
		
		String commaAdded = String.format("%,d", 1000000); //d는 숫자 10진수, %는 추가(%뒤에오는것을)
//										-> 오른쪽의 형식을 왼쪽으로 바꾼다
		System.out.println(commaAdded);
		
		System.out.println("-------------");
		
		String commaPay = String.format("%,d",WORKING_DAY * 150000);
		System.out.println("이번 달 급여 : " + commaPay + "원 입니다.");
		
		
		System.out.println("------------------------");
		
		final int WORKING_DAY2 = 21;
		
		String commaInt = String.format("%,d", WORKING_DAY2 * 120000);
		
		System.out.println("이번달 근무일은 : " + WORKING_DAY2 + "일 입니다." );
		System.out.println("이번달 급여는 총 : " + commaInt + "원 입니다.");
		
	}

}
