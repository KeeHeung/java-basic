package java00_javaReview;

public class JavaReview_Virable01 {
	public static void main(String[] args) {
		
		   // 변수에 알맞은 타입을 골라
		   // 선언하고
		   // 대입한 후
		   // 모든 변수의 데이터를 출력해보자.

		   // 이름, 나이, 성별, 키

		   //   출력 예시
		   //   이름 : Alice
		   //   나이 : 99
		   //   성별 : 남
		   //   키 : 222.66

		   //   ex)
		   //   System.out.println("이름 : " + name);
		
		//자료형 타입 선택 후 변수 선언과 동시에 초기화
		
		String name = "장기흥";	//문자열 타입
		int age = 30; // 정수형 타입
		char gender = 'M';	//문자형 타입
		double height = 176.85;
		
		//출력하기
		
		System.out.println("---------------------------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		
		System.out.println("---------------------------");
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n성별 : " + gender + "\n키 : " + height);
		
		
		System.out.println("---------------------------");
		System.out.print("이름 : " + name);
		System.out.println();
		System.out.print("나이 : " + age);
		System.out.println();
		System.out.print("성별 : " + gender);
		System.out.println();
		System.out.print("키 : " + height);
		System.out.println();
		
		System.out.println("---------------------------");
		System.out.print("이름 : " + name);
		System.out.print("\n");
		System.out.print("나이 : " + age);
		System.out.print("\n");
		System.out.print("성별 : " + gender);
		System.out.print("\n");
		System.out.print("키 : " + height);
		
		
		
		
		
		
	}

}
