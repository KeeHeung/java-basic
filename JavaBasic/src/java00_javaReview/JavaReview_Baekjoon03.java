package java00_javaReview;

import java.util.Scanner;

public class JavaReview_Baekjoon03 {
	public static void main(String[] args) {
		
		//백준 윤년 문제
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if( year%4==0 && year%400==0) {
			System.out.println(1);
			
		} else if ( year%4==0 && year%100!=0 ) {
			System.out.println(1);
			
		} else {
			System.out.println(0);
		}
		
        
        
	}
}
