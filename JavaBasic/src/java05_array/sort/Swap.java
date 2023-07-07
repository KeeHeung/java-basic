package java05_array.sort;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Swap {
	public static void main(String[] args) {
		
		//스왑, swap, 교환하기, 맞바꾸기
		
		int num1 = 11;
		int num2 = 22;

		//잘못 생각한 코드
		num2 = num1;		//오른쪽 num1(11)을 num2(22에 대체하여 11)에 대입
		num1 = num2;		//num2에 대입된 11을 다시 num1에 대입
							//num1,num2 모두 11의 값을 가지게 된다.
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("---------------------------");
		
		num1 = 11;			//num1,num2 재 초기화
		num2 = 22;
		
		System.out.println("[스왑 전] " + num1 + " : " + num2);
		
		//스왑 코드
		int temp = num1;	//임시변수 temp 생성하여 num1(11)을 temp에 저장 후 위치 교환
		num1 = num2;
		num2 = temp;
		
		System.out.println("[스왑 후] " + num1 + " : " + num2);
		
		
		
		
	}
}
