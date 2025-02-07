package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamEX {
	public static void main(String[] args) {
		
		//키보드 입력스트립 -> 프로그램 -> 모니터 출력스트림
		//----------------------------------------------------------
		
		InputStream is = System.in; //표준 입력 스트림
		OutputStream os = System.out; //표준 출력 스트림
		
		
		byte[] buf = new byte[1024]; //입출력 데이터의 임시 저장소
		int len = -1; //입력 데이터의 길이
		
		try {
		
			//입력 데이터가 EOF가 될 때까지 반복적으로 입력한다
			while( ( len = is.read(buf) ) != -1 ) {
				
				//입력 받은 데이터를 (출력스트림으로) 출력한다
				os.write(buf, 0, len);

				//출력 버퍼 비우기
				os.flush();
				
			}
			
//			//출력 버퍼 비우기
//			os.flush();				//위치를 바꾸었을 때 동작을 생각해보자
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				//입력 스트림 닫기
				if(is!=null)	is.close();
				

			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				//출력 스트림 닫기
				if(os!=null)	os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		
		
		
	}
}
