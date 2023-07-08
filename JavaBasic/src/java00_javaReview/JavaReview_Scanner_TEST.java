package java00_javaReview;

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Engineering;

public class JavaReview_Scanner_TEST {
	public static void main(String[] args) {

		//학생 정보 관리 프로그램
		   
		   //   이름, 나이, 성별, 국어, 영어, 수학
		   
		   //   6가지 정보를 저장할 수 있는 변수를 만들고
		   
		   //   총점과 평균을 포함한 결과를 출력한다
		   
		//동작 예시)
		   
		//===== 입력 =====
		//Input Name : Alice
		//Input Age : 33
		   
		//Input Gender : F
		   
		//Input Korean : 100
		//Input English : 99
		//Input Mathematics : 97

		//===== 출력 =====
		//이름   나이   성별   국어   영어   수학   총점   평균
		//Alice   33      F      100      99      97      296      98.666666667		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 입력 =====");
		System.out.print("Input Name : ");
		String name = sc.nextLine();
		
		System.out.print("Input Age : ");
		int age = sc.nextInt();
		sc.nextLine();	//버퍼비우기
		System.out.print("Input Gender : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("Input Korean : ");
		int kor = sc.nextInt();
		System.out.print("Input English : ");
		int eng = sc.nextInt();
		System.out.print("Input Mathmarics : ");
		int math = sc.nextInt();
		
		int tot = kor+eng+math;
		double avg = tot/(double)3;
		
		System.out.println();	// 한줄 띄우기
		
		System.out.println("===== 출력 =====");
		System.out.print("이름\t나이\t성별\t국어\t영어\t+수학\t총점\t평균\n");
		System.out.print(name +"\t");
		System.out.print(age +"\t");
		System.out.print(gender +"\t");
		System.out.print(kor +"\t");
		System.out.print(eng +"\t");
		System.out.print(math +"\t");
		System.out.print(tot +"\t");
//		System.out.println( String.format("%.2f", avg) );
		System.out.printf("%.3f\n",avg);	//위의 String.format 메소드를 printf메소드로 대체 사용, \n을 추가해줌
		
	}

}
