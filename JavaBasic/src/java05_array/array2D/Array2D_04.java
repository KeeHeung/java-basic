package java05_array.array2D;

import java.util.Iterator;
import java.util.Scanner;

public class Array2D_04{
	public static void main(String[] args) {
		
		//학생 성적 관리 프로그램
		//	-> 국영수 3과목 점수
		
		//	점수 1개			-> int
		//	3과목 점수			-> int[3]
		//	4학생의 점수		-> int[4][3]
		//	2개 학급			-> int[2][4][3]
		//	1~3학년				-> int[3][2][4][3]
		
		int[][][][] sco = new int[3][2][4][3];
		
		//---------------------------------------------------------
		
		int[][][] sco1 = new int[2][4][3];
		int[][][] sco2 = new int[2][4][3];
		int[][][] sco3 = new int[2][4][3];
		
		//---------------------------------------------------------

		
	      //QUIZ.
	      //   2명의 국어, 영어, 수학 점수를 처리하기
	      //   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 
	      
	      //   ** 2차원배열 이용해보기
	      
	      //   int[2][3] - 학생들 점수
	      //   int[2] - 학생들 총점
	      //   double[2] - 학생들 평균
	      
	      //----- 최종 출력 -----
	      //   번호   국어   영어   수학   총점   평균
	      //   1번      xxx      xxx      xxx      xxx      xxx.xx
	      //   2번      xxx      xxx      xxx      xxx      xxx.xx		
		
		//---------------------------------------------------------

		Scanner sc = new Scanner(System.in);
		
		// 2명의 학생 변수 선언
		int student1;
		int student2;
		
		//과목별 변수 선언
		int kor;
		int eng;
		int math;
		
		//int형 2차원배열 변수 선언(학생수,과목수)
		int[][] score;
		//int형 1차원배열 변수 선언(학생별 총점)
		int[] totalSoc;
		//int형 1차원배열 변수 선언(학생별 과목들 평균)
		double[] scoreAvg;
		
		//학생수, 과목수 배열 생성
		score = new int[2][3];
		
		score[0] = new int[3];
		score[1] = new int[3];
		
		// 학생들 총점 배열 생성
		totalSoc = new int[2];
		
		// 학생별 과목들 평균 배열 생성
		scoreAvg = new double[2];
		
		
		// TEST 출력
//		System.out.println( score[0].length ); //1차원배열의 열 길이
//		System.out.println( score[1].length ); //1차원배열의 열 길이
		
		
		// 학생들의 점수 TEST 입력
//		score[0][0] = 10;
//		score[0][1] = 20;
//		score[0][2] = 30;
//		score[1][0] = 40;
//		score[1][1] = 50;
//		score[1][2] = 60;
		
		// 과목별 점수 입력받기
		
		int i=0;
		int j=0;
		
		for( i=0; i<score[1].length; i++ ) {
			for( j=0; j<score[i].length; j++ ) {
				System.out.print("점수 입력 : " + score[i][j] );
				sc.nextInt();
			}
			System.out.println();
		}
		
		
		// 학생 총점 TEST 출력
		totalSoc[0] = score[0][0] + score[0][1] + score[0][2];
		totalSoc[1] = score[1][0] + score[1][1] + score[1][2];
		
		System.out.println(totalSoc[0]);
		System.out.println(totalSoc[1]);

		// 학생별 과목들 평균 TEST 출력
		scoreAvg[0] = (totalSoc[0])/(double)3;
		scoreAvg[1] = (totalSoc[1])/(double)3;
		
		System.out.println(scoreAvg[0]);
		System.out.println(scoreAvg[1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
