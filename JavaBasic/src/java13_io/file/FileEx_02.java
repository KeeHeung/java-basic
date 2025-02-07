package java13_io.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		//절대 경로 지정
		File file1 = new File("C:/Users/heung/git/repository/JavaBasic/src/java13_io/file/", "Hello");
		
		System.out.println( file1 );

		
		System.out.println( file1.length() );
		System.out.println( file1.exists() );
		
		System.out.println("----------------");
		
		//상대경로 지정
		File file2 = new File("./src/java13_io/file/", "Hello");
		
		System.out.println( file2 );
		
		System.out.println( file1.length() );
		System.out.println( file1.exists() );
		
		System.out.println("----------------");
		
		//상대 경로 기준점 == 클래스 패스 == 프로젝트 폴더
		//	C:/Users/heung/git/repository/JavaBasic/

//		File file3 = new File("./src/java10_collection/", "user.properties");
//		File file3 = new File("./src/java13_io/file/../../java10_collection/", "user.properties"); 	//위 코드와 같은 의미
		
		//경로 적어보기
//		File file3 = new File("/경로 적어보기", "Hello");
//		File file3 = new File("/Users/heung/git/repository/JavaBasic/src/java13_io/file/", "Hello");
		
//		File file3 = new File("../JavaBasic/src/java13_io/file/", "Hello");
		
//		File file3 = new File("src/java13_io/file/", "Hello");

		File file3 = new File("../../../git/repository/JavaBasic/src/java13_io/file/", "Hello");
		
		System.out.println( file3.exists() );
		
		
	}
}






