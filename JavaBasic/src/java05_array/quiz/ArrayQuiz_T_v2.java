package java05_array.quiz;

import java.util.Scanner;

public class ArrayQuiz_T_v2 {
	public static void main(String[] args) {
		
		//---상수 선언---
		final int FLOOR = 7;	//건물의 층 수
//		final int TOTAL = FLOOR+1;
		final int COST = 12000;	//인당 관리비

		
		//--- 필요한 변수 선언 ---
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("관리할 건물의 층수는? ");		//층수와 관리비를 입력받아 상수로 저장관리
//		int FLOOR = sc.nextInt();
//		
//		System.out.print("인당 관리비는? ");
//		int COST = sc.nextInt();
		
		
		
		// 각 층 인원 +총 인원 배열
		int[] people = new int[FLOOR+1];	//arr
		
		// 각 층 관리비 + 총 관리비 배열
		int[] fee = new int[FLOOR+1];		//arr2
		
		
		//--- 각 층의 인원 입력 ---	//테스트용
//		people[0] = 1;	//1층 인원
//		people[1] = 2;	//2층 인원
//		people[2] = 3;	//3층 인원
//		people[3] = 4;	//4층 인원
//		people[4] = 5;	//5층 인원
		
		//총 인원 계산
//		people[5] = people[0] + people[1] + people[2] + people[3] + people[4];	//좋지 못한 코딩의 예
		
		System.out.println("---각 층원 인원 입력---");
		for(int i=0; i<FLOOR; i++) {
			System.out.print(" >> " + (i+1) + "층의 인원은? ");
			people[i] = sc.nextInt();//각 층 인원
			
			//총 인원 계산
			people[FLOOR] += people[i];
		}
		
		
//		for(int i=0; i<5; i++) {			//위의 for문에 합침
//			people[5] += people[i];
//		}
		
		
		//--- 관리비 계산 ---
		for(int i=0; i<FLOOR+1; i++) {
//			fee[i] = people[i] * 12000;
			fee[i] = people[i] * COST;
		}
		
		//--- TEST ---
//		for(int i=0; i<people.length; i++) {
//			System.out.println("TEST 인원] " + i + ">>" + people[i]);
//		}
//		
//		for(int i=0; i<fee.length; i++) {
//			System.out.println("TEST 관리비] " + i + ">>" + fee[i]);
//		}
		
		//--- 전체 출력---
		System.out.println();
		System.out.println("---각 층의 관리비---");
		for(int i=0; i<FLOOR; i++) {
			System.out.println(">>" + (i+1) + "층의 관리비는 " + fee[i] + "원 입니다");
		}
		
		System.out.println();
		System.out.println("총 인원은 " + people[FLOOR] + "명 입니다");
		System.out.println("총 관리비는 " + fee[FLOOR] + "원 입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
