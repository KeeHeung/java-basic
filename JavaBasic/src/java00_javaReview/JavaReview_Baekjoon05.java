package java00_javaReview;

import java.util.Iterator;

public class JavaReview_Baekjoon05 {
	public static void main(String[] args) {
		
//		for(int i=2; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				System.out.println(i + " x " + j + " = " + i*j );
//			}
//			System.out.println("-----------");
//		}

////	*
////	***
////	*****
////	*******
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------");

		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4-i-1; j++) {
				System.out.print("&");
			}
			
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5+i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}
}



















