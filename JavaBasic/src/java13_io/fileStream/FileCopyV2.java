package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.attribute.standard.Destination;

public class FileCopyV2 {
	public static void main(String[] args) {
		
		//	Quiz.
		
		//	Source.txt 파일의 내용을 읽어들여 Destination.txt 파일로 저장한다
		//	-> 파일복사
		
		//	49,520,698 bytes
		
		//	Source.txt ---> FileCopy ---> Destination.txt
		
		//----------------------------------------------------------------------
		
		//입력 대상 파일 객체
		File quizfile = new File("./src/java13_io/fileStream/", "Source.txt");
		System.out.println("[TEST] quizfile exist : " + quizfile.exists());
		
		//출력 대상 파일 객체
		File quizfile2 = new File("./src/java13_io/fileStream/", "Destination.txt");
		System.out.println("[TEST] quizfile2 exists : " + quizfile2.exists());		
		
		
		//파일 입력,출력 관련 변수
		byte[] buf = new byte[1024]; //입력 데이터 버퍼(임시 저장소)
		int len = -1; //입력,출력 데이터의 길이
		int total = 0; //총 입출력된 데이터의 길이(크기)
		
//		//최종 데이터 저장소
//		StringBuilder sb = new StringBuilder();

		
		
		//in 스트림에서 더 이상 읽어들일 데이터가 없을 때
		//	-> Source.txt 파일의 오프셋(offset)이 파일의 끝에 도달했을 때
		//	-> End of Stream
		//	-> End of File
		//	-> EOF
		
		//파일 입력,출력 스트림 객체 변수선언과 객체 생성
		try (	FileInputStream in  = new FileInputStream(quizfile);
				FileOutputStream out = new FileOutputStream(quizfile2);	){

			
			//읽어들일 데이터가 존재하면 반복 처리
			//입력스트림 처리
			//while( 반복적으로 read) {
			//	출력 write
			//}
			
			//파일 입력
			while( (len = in.read(buf)) != -1 ) {
				
				//파일 출력
				out.write(buf, 0, len);
				
//				//진행상황 콘솔 출력
//				System.out.print( new String( buf, 0, len) );
				
				//복사된 데이터의 총 길이 계산
				total += len;
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		} finally {
//			try {
//				//출력스트림 닫기
//				if(out!=null)	out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			try {
//				//입력스트림 닫기
//				if(in!=null)	in.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		//총 입출력된 데이터의 길이(크기)
		System.out.println();
		System.out.println(">>" + total + " 바이트 복사 완료");
		
		
	}
}










