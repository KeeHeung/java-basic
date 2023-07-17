package java00_javaReview;

import java.util.Scanner;

public class JavaReview_Baekjoon02 {
	public static void main(String[] args) {
		
//		System.out.println("\\    /\\");
//		System.out.println(" )"+"  "+"("+" "+"\'"+")");
//		System.out.println("("+"  "+"/"+"  "+")");
//		System.out.println(" \\"+"("+"__"+")"+"|");
//		
//		System.out.println();
//		System.out.println("|\\_/|");
//		System.out.println("|q p|"+"   /"+"}");
//		System.out.println("( 0 "+")"+"\"\"\"\\");
//		System.out.println("|\""+"^"+"\""+"`"+"    |");
//		System.out.println("||_/"+"="+"\\\\"+"__"+"|");
//
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if(year %400==0 || year %100 != 0 ){
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//		        
        
        int dan;
        int num;
        for(dan=2; dan<=9; dan++ ) {
        	for(num=1; num<=9; num++) {
        		System.out.println(dan + " X " + num + " = " + dan*num );
        	}
        	dan++;
        	System.out.println("-------------------");
        }
		
        
        
        
	}
}
