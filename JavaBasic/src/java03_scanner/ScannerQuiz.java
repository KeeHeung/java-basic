package java03_scanner;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class ScannerQuiz {
	
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
		
		Scanner sc = new Scanner(System.in);	//입력객체
		//----------------------------------------------------------------------
		
		System.out.println("-- 학생 정보 관리 프로그램 --");
		System.out.println("===== 입력 =====");
		
		System.out.print("Input Name : ");
		String name = sc.nextLine();
		System.out.print("Input Age : ");
		int age = sc.nextInt();
		
		sc.nextLine();	//버퍼 비우기
		
		System.out.print("Input Gender : ");
		String gender = sc.nextLine();
		
		System.out.print("Input KOREAN : ");
		int kor = sc.nextInt();
		System.out.print("Input English : ");
		int eng = sc.nextInt();
		System.out.print("Input Mathematics : ");
		int math = sc.nextInt();
		
//		double total = kor+eng+math; // <- 틀림
		int total = kor+eng+math;	// <- 정답	
//		double avg = total/3;		// <- 틀림
//		double avg = total/3.0;		// <- 정답
		double avg = total/(double)3;		// <- 정답

		
		
		System.out.println("===== 출력 =====");
//		System.out.print("이름 : \n" + name + " ");
//		System.out.print("나이 : \n" + age + " ");
//		System.out.print("성별 : \n" + gender + " ");
//		System.out.print("국어 : \n" + kor + " ");
//		System.out.print("영어 : \n" + eng + " ");
//		System.out.print("수학 : \n" + math + " ");
//		System.out.print("총점 : \n" + total + " ");
//		System.out.print("평균 : \n" + avg );
		
//		System.out.println("이름   나이   성별   국어   영어   수학   총점   평균");
		System.out.println("이름	나이	성별	국어	영어	수학	총점	평균");
//		System.out.println(name+"\t"+age+"\t"+gender+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg);
		
//		System.out.print(name+"\t");
//		System.out.print(age+"\t");
//		System.out.print(gender+"\t");
//		System.out.print(kor+"\t");
//		System.out.print(eng+"\t");
//		System.out.print(math+"\t");
//		System.out.print(total+"\t");
//		System.out.print(avg);
		
		System.out.print(name+"	");
		System.out.print(age+"	");
		System.out.print(gender+"	");
		System.out.print(kor+"	");
		System.out.print(eng+"	");
		System.out.print(math+"	");
		System.out.print(total+"	");
		System.out.print(avg);
//		System.out.println( String.format("%.2f", avg) ); 	//소수점 2자리까지만 나오게 원할때
		
	}

}
