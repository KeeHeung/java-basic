package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {
		
		//1부터 10까지의 총합 구하기
		//	-> 55
		
		//반복횟수 : x10
		//반복구간 : 1 ~ 10 
		
		int sum = 0;
		
		for( int i = 1; i <= 10; i++ ) {
			sum = sum + i;
		}
		System.out.println("1 ~ 10까지의 총합 : "+sum);
		
		//------------------------------------------------------
		
//		for(int i=0; i<10; i++) { // i, x10, 0~9
//			sum = sum + (i+1);
//		}
//		
//		System.out.println("총합 : " + sum);
		
	}
}
