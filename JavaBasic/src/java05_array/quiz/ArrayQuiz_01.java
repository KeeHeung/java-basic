package java05_array.quiz;

import java.util.Scanner;

public class ArrayQuiz_01{
	
//	5층인 건물의 인원을 입력 받도록 만든후 전체 인원이 나오도록 하게 하여라.
//	그후 각 층마다 관리비를 측정한다. (관리비는 인원당 12000원 이다.)
//
//	- 필요한 배열
//	 1. 각 층의 사는 인원을 담는 배열 arr[6]
//	   // 1~5층 과 총인원 (마지막 배열공간은 입력받은 인원의 총 합으로 사용) 
//	   
//	 2. 각 층의 관리비 배열 arr2[6]
//	   // 1~5층 과 총 관리비 금액 (마지막 배열공간은 관리비의 총 합계금액으로 사용)
//
//	----------------------- 입력 (입력시 for문을 이용한다.)
//	1층의 사는 인원은 ? 4
//	2층의 사는 인원은 ? 5
//	3층의 사는 인원은 ? 11
//	4층의 사는 인원은 ? 2
//	5층의 사는 인원은 ? 8
//	----------------------- 출력 (출력시 for 문을 이용한다.)
//	1층의 총 관리비 : 48000원
//	2층의 총 관리비 : 60000원
//	3층의 총 관리비 : 132000원
//	4층의 총 관리비 : 24000원
//	5층의 총 관리비 : 96000원
//
//	건물에 사는 총 인원은 30명입니다.
//	관리비의 총 금액은 360000원 입니다.	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];			//각 층의 인원
//		int[] arr2 = new int[6];		//각 층의 관리비
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int sum =0;
		
		System.out.println("--------------------");
		
		for(int i=0; i<arr.length-1; i++) {
			System.out.print(arr[i]+"층에 사는 인원은 ? ");
			arr[i] = sc.nextInt();
			
			sum += arr[i];
		}
		
		
		System.out.println("--------------------");
		
		for(int j=0; j<arr.length-1; j++) {
			String inputComma = String.format("%,d", arr[j] *12000 );
			System.out.println((j+1)+"층의 총 관리비 : " + inputComma + "원 입니다");	//inputComma 자리에 arr[j]*12000 있었음
			
		}
		
		String insertComma = String.format("%,d" , sum * 12000);	//총 인원수 * 관리비
		
		System.out.println();
		System.out.println("건물에 사는 총 인원은 : " + sum  + "명 입니다.");
		System.out.println("건물에 사는 총 관리비는 : " + insertComma + "원 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
