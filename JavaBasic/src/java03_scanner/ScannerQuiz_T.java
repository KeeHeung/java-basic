package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_T {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//------------------------------------------------------
		
		System.out.println("===== 입력 =====");
		//이름 입력
		String name;
		System.out.print("Input Name : ");
		name = sc.nextLine();
		
//		System.out.println("[TEST] name : " + name ); 	//테스트 출력을 해본다
		
		//나이 입력
		System.out.print("Input Age : ");
		int age = sc.nextInt();
		
//		System.out.println("[TEST} age : " + age);
		
		//성별 입력
		System.out.println("Input Gender : ");
		//String 처리
//		sc.nextLine();	//버퍼비우기
//		String gender = sc.nextLine();
//		
//		System.out.println("[TEST] gender : " + gender );
		
		//char 처리
		sc.nextLine();	//버퍼비우기
		char gender = sc.nextLine().charAt(0); 	//** 버퍼비우기를 해주지 않으면 0번 인덱스에 
												//\n이 들어있으므로, charAt(0)을 사용할 수 없다
		
//		System.out.println("[TEST] gender : " + gender);
		
		//국어 입력
		System.out.println("Input Korean : ");
		int kor = sc.nextInt();
		
//		System.out.println("[TEST] Korean : " + kor);
		
		//영어 입력
		System.out.println("Input English : ");
		int eng = sc.nextInt();
				
//		System.out.println("[TEST] English : " + eng);
				
		//수학 입력
		System.out.println("Input Mathmatics : ");
		int math = sc.nextInt();
				
//		System.out.println("[TEST] Mathmatics : " + math);
		
		//총점 계산
		int sum = kor + eng + math;
		
		//평균 계산
		
//		double avg = sum / 3.0; 	//이렇게도 가능
		double avg = sum / (double)3;
		
//		System.out.println("[TEST] sum : " + sum);
//		System.out.println("[TEST] avg : " + avg);
		
		//천제 출력
		
		System.out.println("===== 출력 =====");
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		
		System.out.print(name+"\t");
		System.out.print(age+"\t");
		System.out.print(gender+"\t");
		System.out.print(kor+"\t");
		System.out.print(eng+"\t");
		System.out.print(math+"\t");
		System.out.print(sum+"\t");
		
//		System.out.print(avg);
		
		String formatted = String.format("%.2f", avg);
		System.out.println(formatted);
//		System.out.println( String.format("%.2f", avg) );	//위의 두줄을 한줄로 가능

//		System.out.printf( "%.2f", avg );					//format 출력문, ln을 f로 대체했기때문에 라인바꿈을 해줘야한다.
//		System.out.println();
		
		
		
		
	}

}
