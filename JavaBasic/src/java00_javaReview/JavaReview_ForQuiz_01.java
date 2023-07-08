package java00_javaReview;

public class JavaReview_ForQuiz_01 {
	public static void main(String[] args) {
		
		//1부터 10까지의 총합 구하기
		//	-> 55
		
		//반복횟수 : x10
		//반복구간 : 1 ~ 10 		
		
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("0~10까지의 총합 : " + sum);
		
		// sum이라는 변수를 만들고, 0값을 넣어 초기화를 해둔다
		// i가 반복할때마다 sum변수에 저장시키고,(sum = i) <- i를 sum에 대입
		// sum은 반복될때마다 sum끼리 더해준다.(sum = sum + i) <- 이때 i는 반복할때마다 축적된 데이터가 1씩 증가하는중
											//-> sum += i 
		
	}
}
