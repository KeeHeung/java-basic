package java05_array.quiz;

import java.util.Arrays;

public class ArrayQuiz_02 {
	public static void main(String[] args) {
		
		 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
////		 배열이 선언된 뒤 문제를 푸시오
////
////	
////		 - arr 배열을 invert_arr라는 배열에 거꾸로 입력하시오
//		 => invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
		 
		 int[] invert_arr = new int[arr.length];
		 
		 for (int i=0; i<arr.length; i++) {
			 invert_arr[i] = arr.length-i;
			 System.out.print(arr[i] + " ");
		 }
		 
//		 System.out.println(arr[i]);
//		 System.out.println();
		 
		 
		 
		 
		 
		 
		 
		 
		 int[] invert_arr1 = new int[10]; 
		 
		 for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
	            invert_arr1[j] = arr[i];
	        }
		 
		 System.out.println(Arrays.toString(arr));
		 System.out.println(Arrays.toString(invert_arr1));

		 
//
//
//		 - arr 배열의
//		  (짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을
//		  구하시오
//		  	=> -5
//
//
//		 - arr 배열의 숫자들 중 높은 숫자가 1등이 되게하여
//		  rank_arr라는 배열에 순위를 입력하시오
//		 	=> arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//		     => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
//
//
//		 - arr 배열의 요소들 중 중복된 값은 over_arr에 넣고 중복되지
//		  않은 값은 ret_arr에 입력하시오
//		 	** over_arr, ret_arr은 길이가 10인 배열로 작성한다
//		 	
//		 	출력한다면 (정렬도 할 수 있으면 해도 됨)
//		 	=> over_arr : 9, 10
//		 	=> ret_arr : 3, 8, 13, 17, 21, 27
	}
	

}
