package java06_class.methodQuiz;

public class MethodArrayQuizEx {
	public static void main(String[] args) {
		
		//객체 변수명 선언, 객체생성
		MethodArrayQuiz maq = new MethodArrayQuiz();
		
//		int[] arr = {1,2,3,4,5};
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		
		
		
//		//1.배열의 모든 요소 10배
//		//	원본의 arr의 값이 모두 10배가 됨
		maq.mul10(arr);
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		System.out.println(arr); //int[] arr 의 주소값 확인
		
		
		System.out.println("-----------");
		
		
		//2.배열의 모든 요소 출력
		//	10, 20, 30, 40, 50 출력되어야 함
		maq.print(arr);
		System.out.println();
		System.out.println(arr); ////int[] arr 의 주소값 확인
		
		
	}
}
