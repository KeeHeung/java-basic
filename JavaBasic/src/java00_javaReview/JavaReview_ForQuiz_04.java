package java00_javaReview;

public class JavaReview_ForQuiz_04 {
	public static void main(String[] args) {
		
		//Quiz.
		//   첫날에 10원을 예금하고,
		//   다음날에는 전날의 2배를
		//   예금하는 방식으로
		//   보름(15일) 동안 저축한 금액은?
		//	 -> 327670
			
			//반복횟수 : x15
			//반복구간 : 1~15
			
		//HINT.
			//	1. 필요한 데이터 파악 - 사용 목적
			
			// 날짜		int day
			// 예금액	int money
			// 총 금액	int total
			
			
			//	2. 반복 패턴 - 몇번 반복
			
			//	반복횟수: 15번
			//	반복구간: 0~14
			
			//	day, 0~14, x15
			
			
			//	3. 반복에 맞춰 수행해야하는 작업 - 중괄호 안쪽 코드
			
			//	예금액 2배로 증가
			//	총 금액에 추가
			
			//------------------------------------------------------

		int money = 10;
		int total = 0;
		
		for(int day=0; day<15; day++) { //day, 0~14, x15
			total = money + total;
			money = money*2;
		}
		System.out.println(total);
		
	}
}



		


























