package java09_api;

import java.util.Random;
import java.util.Scanner;

public class UpDownGameQuiz_v2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Random ran;
		ran = new Random();
		
		ran.nextInt(50);
		
		int com = ran.nextInt(50)+1;
		System.out.println("정답 : " + com);
		
		int[] arr = new int[7];
		
		for (int i = 0; i < arr.length; i++) {
		
			System.out.print("입력 : ");
			int user = sc.nextInt();
			
			arr[i] = user;
			
			if(arr[i]>com) {
				System.out.println("-----------");
				System.out.println("DOWN");
				System.out.println("-----------");
			} else if(arr[i]<com) {
				System.out.println("-----------");
				System.out.println("UP");
				System.out.println("-----------");
			} else {
				System.out.println("-----------");
				System.out.println("승리");
				System.out.println("-----------");
				break;
			}
			if(i==arr.length-1) {
				System.out.println("-----------");
			System.out.println("패배");
			System.out.println("-----------");
			}
		}

	}
}























