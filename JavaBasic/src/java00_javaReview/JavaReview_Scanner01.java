package java00_javaReview;

import java.util.Scanner;

public class JavaReview_Scanner01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자 입력 : ");
//		int integer = sc.nextInt();
//		System.out.println("입력된 문자 : " + integer);
//		
//		sc.nextLine();	//버퍼비우기
//		System.out.print("문자열 입력 : ");
//		String str = sc.nextLine();
//		System.out.println("입력된 문자열 : " + str);
		
		System.out.print("문자열 입력 : ");
		String str1 = sc.nextLine();
		System.out.println("입력된 문자열 : " + str1);
		
		System.out.print("숫자 입력 : ");
		int integer1 = sc.nextInt();
		System.out.println("입력된 문자 : " + integer1);
		
		System.out.print("숫자 입력 : ");
		int integer2 = sc.nextInt();
		System.out.println("입력된 문자 : " + integer2);
		
		sc.nextLine();	//int형을 입력받은 후 \n 버퍼를 비워주어야 한다
		
		System.out.print("문자열 입력 : ");
		String str2 = sc.nextLine();
		System.out.println("입력된 문자열 : " + str2);
		
	}

}
