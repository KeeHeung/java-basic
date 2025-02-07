package java05_array.array2D;

public class Array2D_03 {
	public static void main(String[] args) {
		
		//int형 2차원 배열 변수 선언
		int[][] arr;
		
//		arr = new int[3][2];	//	(((int)[2])[3]) 타입의 배열 생성
		
		arr = new int[3][];		//	(((int)[])[3])	타입의 배열 생성
		
		System.out.println( arr );			//2차원 배열 참조값
		System.out.println( arr[0] );			//1차원 배열 참조값 (현재 null)
		System.out.println( arr[1] );			//1차원 배열 참조값 (현재 null)
		System.out.println( arr[2] );			//1차원 배열 참조값 (현재 null)
		
//		System.out.println( arr[0][1] );		//에러, java.lang.NullPointerException
		
		//-------------------------------------------------------------------
		
		//행의 길이
		System.out.println( arr.length );
		
		//-------------------------------------------------------------------
		
		arr[0] = new int[5]; // 0행[5열] 생성
		arr[1] = new int[3]; // 1행[3열] 생성
		arr[2] = new int[7]; // 2행[7열] 생성
		
//		arr[3] = new int[9]; // 3행 생성불가 index 초과
		
		//-------------------------------------------------------------------
		
		System.out.println( arr[0].length);
		System.out.println( arr[1].length);
		System.out.println( arr[2].length);

		//-------------------------------------------------------------------

		//전체 데이터 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print( arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
