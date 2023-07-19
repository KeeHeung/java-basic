//패키지
package java00_javaReview;

//입력객체 
import java.util.Scanner;

//클래스
public class JavaReview_DoWhileQuiz_1 {
	//메인 메소드
	public static void main(String[] args) {
		
		// 숫자를 입력하고 그 값들의 총합을 구하고 최종값을 출력하는 프로그램
		
		//	->숫자 0을 입력하면 종료
				
		//	do - while 구문 활용
		
		//--------------------------------------------------------------------
		
		//입력객체 생성
		Scanner sc = new Scanner(System.in);
		
		//입력값 초기화
		int input=0;
		//합계값 초기화
		int total=0;
		
		do {
			//입력안내문
			System.out.print("Input Number : ");
			//입력 메소드 input에 대입
			input = sc.nextInt();
			
			//현재 입력한 값
			System.out.println("입력한 값 : " + input);
			
			//합계에 입력한값 더해주기
			total += input;
			
			//현재 합계 출력
			System.out.println("현재 입력값 합계 : " + total);
			
			//1회 돌때 마다 구분 지어주기
			System.out.println("------------------------");
			
			//0을 입력하면 프로그램 종료
		} while( input != 0 );
		
		//프로그램 종료 안내문
		System.out.println("총합 구하기 종료");
		System.out.print("총합 : " + total);
		
		
	} //Main메소드 종료
} // 클래스 종료



		


























