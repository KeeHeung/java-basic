package java00_javaReview;

public class JavaReview_ForQuiz_05 {
	public static void main(String[] args) {
		
		//Quiz. 2~9단 구구단 출력
		
		//	1. 바깥쪽 for문
		//		2~9단 반복
		
		//		dan, 2~9, x8
		
		//	2. 안쪽 for문
		//		각 단수에 맞는 구구단 반복
		
		//		i, 1~9, x9
		
		//----------------------------------------------------------
		
		for( int i=2; i<10; i++ ) { // i, 0~2, x3
			
			for( int j=1; j<10; j++) { //j, 0~2, x3
				
				System.out.println(i + " x " + j + " = " + i*j);
				
			}
			
			System.out.println("--------------");
			
		}
		
		
	}
}



		


























