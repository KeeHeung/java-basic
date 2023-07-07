package java05_array.copy;

public class ArrayCopy_02 {
	public static void main(String[] args) {
		
		int[] arr1 = { 50, 60, 70 };	//원본, Source
		int[] arr2;						//사본, Destination
		
		arr2 = arr1;
		
		//1. 데이터가 복사될 공간을 새롭게 생성한다
		arr2 = new int[arr1.length];			//arr1의 주소가 아닌, arr1의 길이만큼 arr2에 공간을 생성한 것
		
		
		//2. 데이터를 복사한다
		for(int i=0; i<arr2.length; i++) {		//arr1의 참조값을, arr2에 생성된 공간에 복사해준 것
			arr2[i] = arr1[i];
		}
		
		//** 깊은 복사, Deep Copy
		//	참조 대상의 내용물을 새로운 공간에 복사하는 것
		//	원본데이터와 사본데이터가 분리된 별개의 공간을 가진다
		
		System.out.println("arr1 :" + arr1 + ", arr2 : " + arr2);	
		//주소를 복사한 얕은 복사가 아닌, 길이만 복사한것이라
		//참조값이 다르게 출력되는것을 확인할 수 있다
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1 : " + arr1[i] + ", arr2 : " + arr2[i]);
		}
		
		arr2[1] = 98989;
		
		System.out.println("------------------------");
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1 : " + arr1[i] + ", arr2 : " + arr2[i]);
		}
		
		
	}

}
