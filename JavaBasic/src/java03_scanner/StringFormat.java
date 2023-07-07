package java03_scanner;

public class StringFormat {
	
	public static void main(String[] args) {
		
//			String.format("서식문자를 포함한 문자열", [서식문자를 대체할 데이터]...);
		
			//서식문자 : 변환할 데이터의 형식(데이터타입)을 지정하는 문자
		
			//데이터를 서식문자의 자리로 치환한다
		
			//	ex) String.format("%점 입니다", 100);
		
			// -> 서식문자인 %d 가 100으로 치환된다
		
			// -> "100점 입니다"
		
			//----------------------------------------------------------------------
		
			// **서식문자의 종류
		
			//		%d - 10진수 정수
			//		%f - 실수
			//		%s - 문자열
			//		%c - 단일 문자
		
			// ** % 기호와 형식지정글자 사이에 숫자를 이용하여 자릿수를 지정할 수 있다
		
			//----------------------------------------------------------------------
			
			System.out.println(String.format("%s", "안녕하세요"));
			String testFormat = String.format("%s", "안녕하세요");
			System.out.println(testFormat);
			
			String testFormat2 = String.format("%.2s", "안녕하세요");
			System.out.println(testFormat2);
			
			String text2 = String.format("총점 %d점", 0x123);	//0으로 시작하는 숫자는 8,16진수 등으로 인식한다, %d는 10진수로 변환출력
			System.out.println(text2);
			
			System.out.println( String.format("%s %d","HiHiHi",768) );
			
			//전체 문자열을 9자리로 구성해서 서식화한다
			//소수부분 4자리를 고정으로 사용한다
			//실수일 경우 .(소수점) 도 한 자리 차지한다
			//소수부, 소수점 빼고 나머지는 정수가 차지한다
			System.out.println( String.format("%9.4f", 123.45));

			//소수부분 6자리 유지 (7번째 반올림)
			System.out.println( String.format("%.6f", 1.234567890) );
			
			//----------------------------------------------------------------------
			
//			System.out.print( String.format( , ));
//			System.out.printf( , );
			
			// printf메소드를 사용할 떄 String.format과 같은 사용방법을 적용한다
			
			System.out.printf("총점 %d점\n", 345);
//			System.out.println();	// <- 개행코드사용, format을 사용할때는 \n 또는 개행코드가 필요하다
			
			String name = "Alice";
			System.out.printf("안녕하세요, %.2s님", name);
			System.out.println();
			
			
	}

}
