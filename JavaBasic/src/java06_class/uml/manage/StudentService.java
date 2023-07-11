package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService {
	
	//학생 정보 객체
	private Student stu = new Student();
	//키보드 입력 객체
	private Scanner input = new Scanner(System.in);
	
	//디폴트 생성자
	//	-> ctrl + space 하면 자동 추천 해준다
	public StudentService() {
//		stu = new Student();		//위에 객체 생성과 동시에 초기화함
//		input = new Scanner();
	}
	
	//이름과 나이 입력
	public void insertInfo() {
		System.out.print( "이름 입력 : ");
		stu.setName( input.nextLine() );
		System.out.print( "나이 입력 : ");
		stu.setAge( input.nextInt() );
	}
	
	//국영수 점수 입력
	public void insertScore() {
		System.out.print( "국어점수 입력 : ");
		stu.setKor(input.nextInt());
		System.out.print( "영어점수 입력 : ");
		stu.setEng(input.nextInt()); 
		System.out.print( "수학점수 입력 : ");
		stu.setMath(input.nextInt()); 
		
		//총점 계산하기
		calcSum();
		
		//평균 계산하기
		calcAvg();
	}
	
	//총합 계산
	private void calcSum() {
		System.out.print("총점 : ");
		stu.setSum(stu.getKor() + stu.getEng() + stu.getMath() );
		System.out.println();
	}
	
	//평균 계산
	private void calcAvg() {
		System.out.printf("평점 : ");
		stu.setAvg( stu.getSum() / (double)3 );
		System.out.println();
	}
	
	//학생 정보 출력
	public void printStu() { // 내가 짠 메소드
//		System.out.println("---학생 정보 출력---");
//		System.out.println( "이름 : " + stu.getName() );
//		System.out.println( "나이 : " + stu.getAge() );
//		System.out.println( "국어점수 : " + stu.getKor() );
//		System.out.println( "영어점수 : " + stu.getEng() );
//		System.out.println( "수학점수 : " + stu.getMath() );
//		System.out.println( "총점 : " + stu.getSum() );
//		System.out.println( "평점 : " + String.format("%2.f", stu.getAvg()) );
		
		//선생님 메소드
		System.out.println();
		System.out.println("- - - 학생 정보 - - -");
		
		System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
		
		System.out.print( stu.getName() + "\t");
		System.out.print( stu.getAge() + "\t");
		System.out.print( stu.getKor() + "\t");
		System.out.print( stu.getEng() + "\t");
		System.out.print( stu.getMath() + "\t");
		System.out.print( stu.getSum() + "\t");
		System.out.printf( "%.2f", stu.getAvg() );
		
		
		
	}
	
	
	
	

}
