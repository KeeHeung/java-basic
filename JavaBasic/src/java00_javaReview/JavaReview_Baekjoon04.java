package java00_javaReview;

import java.util.Scanner;

public class JavaReview_Baekjoon04 {
	public static void main(String[] args) {
		
		//백준 14681번 사분면 고르기
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if( x>0 && y>0 ) {
			System.out.println(1);
		} else if( x<0 && y>0) {
			System.out.println(2);
		} else if( x<0 && y<0 ) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		
		
	}
}
