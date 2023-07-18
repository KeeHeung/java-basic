package java00_javaReview;

import java.util.Iterator;

public class JavaReview_StarQuiz {
	public static void main(String[] args) {

//		*
//		**
//		***
//		****
//		*****
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
////		*****
////		****
////		***
////		**
////		*		
//		
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
////		*
////		***
////		*****
////		*******
//		
//		for(int i=0; i<8; i+=2) { //i, 0~7,(0/3/5/7)
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("-----------------");
//		
////	          *
////	        ***
////	      *****
////	    *******
//		
//		for(int i=0; i<8; i+=2) {
//			
//			for(int j=7; j>i+1; j--) {
//				System.out.print(" ");
//			}
//
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		System.out.println("-----------------");
//		
		
		
	}
}
