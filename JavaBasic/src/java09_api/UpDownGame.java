package java09_api;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {

//		 + UP&DOWN 게임
		System.out.println("====== Up & Down ======");
		
		Random ran = new Random();
		int com = ran.nextInt(50)+1;
//		System.out.print("COM 숫자 [TEST] 출력 : " + com);
//		System.out.println();
		
//		  - 사용자의 입력을 받는다 (= user)
		Scanner sc = new Scanner(System.in);
		
		
//		  - user가 com보다 낮은지 높은지 판단하여 UP&DOWN을 출력한다
//		   (기준은 com)
//		   (ex. com == 40 && user == 30 -> UP )
		
//		  - user가 com과 같으면 user 승리
//		  
//		  - 7번안에 맞추지 못하면 com 승리

		//게임 횟수 설정
		final int NUM = 7;
		
		for(int i=0; i<NUM; i++) {
			System.out.print("1~50까지 숫자 입력 : ");
			int user = sc.nextInt();
//			System.out.println("User 숫자 [TEST] 출력 : " + user);
			
			if( user == NUM ) { //횟수가 모두 끝난경우
				System.out.println("플레이 횟수 : " + (i+1));
				System.out.println("-----------------------");
				System.out.println("게임에 패배하였습니다 ㅠㅠ");
				System.out.println("정답 >> " + com);
				
				
			} else if( com > user ) { //입력한 숫자가 COM보다 작은 경우
				System.out.println(">> UP! 플레이 횟수 : " + (i+1) );
				System.out.println("-----------------------");
				
			} else if( com < user) { //입력한 숫자가 COM보다 큰 경우
				System.out.println(">> DOWN! 플레이 횟수 : " + (i+1) );
				System.out.println("-----------------------");
				
			} else { //입력한 숫자가 COM과 동일한 경우
				System.out.println("플레이 횟수 : " + (i+1));
				System.out.println("-----------------------");
				System.out.println("정답을 맞췄습니다! 승리!!");
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		
	}
}























