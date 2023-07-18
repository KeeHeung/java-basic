package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.attribute.standard.Destination;

public class FileCopy {
	public static void main(String[] args) {
		
		//	Quiz.
		
		//	Source.txt 파일의 내용을 읽어들여 Destination.txt 파일로 저장한다
		//	-> 파일복사
		
		//	49,520,698 bytes
		
		//	Source.txt ---> FileCopy ---> Destination.txt
		
		//----------------------------------------------------------------------
		
		//입력 대상 파일 객체
		File quizfile = new File("./src/java13_io/fileStream", "Source.txt");
		System.out.println("[TEST] exist : " + quizfile.exists());
		//출력 대상 파일
		File quizfile2 = new File("./src/java13_io/fileStream", "Destination.txt");
		System.out.println("[TEST] exists : " + quizfile2.exists());		
		
		//파일 입력 관련 변수
		byte[] buf = new byte[49520698]; //입력 데이터 버퍼
		int len = -1; //입력된 데이터의 길이
		
//		//최종 데이터 저장소
//		StringBuilder sb = new StringBuilder();
		
		//파일 입력 스트림 객체
		FileInputStream fis = null;
		//파일 출력 스트림 객체
		FileOutputStream fos = null;
		
		
		try {
			//파일 입력 스트립 생성
			fis = new FileInputStream(quizfile);
			//파일 출력 스트림 생성
			fos = new FileOutputStream(quizfile2);			
			
			//읽어들일 데이터가 존재하면 반복 처리
			while( (len = fis.read(buf)) != -1 ) {
				fos.write(buf, 0, len);
				
				fos.flush();	//버퍼 비우기
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림 닫기
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

		
		
	}
}










