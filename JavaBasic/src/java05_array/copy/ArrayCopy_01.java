package java05_array.copy;

public class ArrayCopy_01 {
	public static void main(String[] args) {
		
		//기본 타입 변수의 값 복사
		int num1 = 100;
		int num2;
		
		//num1의 값이 num2에 복사된다
		num2 = num1;
		
		System.out.println( "num1 : " + num1 + ", num2 : " + num2 );
		
		System.out.println("---------------------");
		
		//배열(참조형) 복사
		
		int[] arr1 = { 10, 20, 30 };	//참조형에서 변수 선언과 동시에 초기화를 하면 자동으로 new한다
		int[] arr2;
		
		arr2 = arr1;					//참조형을 참조형에 대입하면, *요소 데이터*가 아닌 주소가 복사된다.
		
		//** 얕은 복사, Shallow Copy
		//	참조 대상의 참조값(주소)만 복사되는 현상
		//	실 데이터를 저장하고 있는 내부 공간(new로 만들어진) 이 복사되지 않는다
		//	원본, 사본 참조형 변수가 모두 같은 메모리 주소를 참조한다
		
		
		
		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		arr2[1] = 8888;					// 복사된 참조형 변수의 요소를 바꾸면 주소에 변경되어
										//요소가 바뀌게 된다. *arr1 의 요소가 함께 바뀐다.
		
		System.out.println("---------------------");

		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		
		
		
		
		
		
		
		
	}
}
