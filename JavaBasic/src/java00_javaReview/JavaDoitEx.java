package java00_javaReview;

import java.util.Scanner;

public class JavaDoitEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("건물의 층수를 누르세요 >> ");
		int floor = sc.nextInt();
		
		String ment = "ment";
		
		switch (floor) {
		case 1: ment = "1층 약국";
			break;

		case 2: ment = "2층 정형외과";
			break;

		case 3: ment = "3층 피부과";
			break;

		case 4: ment = "4층 치과";
			break;

		case 5: ment = "5층 헬스 클럽";
			break;

		default : System.out.println("5층짜리 건물");
			
		}
		
		System.out.println( ment + " 입니다");

	
	}
}
