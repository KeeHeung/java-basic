package java04_control.loop;

public class StarQuiz {
	
	// 	 *
	//  ***
	// *****
	//*******

	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
		for( int i=0;i<5;i++ ) { //i, 0~4, x5
			
			for( int j=0;j<i+1;j++) { //j, 0 ~ i+1, xi
				System.out.print("*");
			}
			
			System.out.println();
		}

		System.out.println("--------------");
		
//		*****
//		****
//		***
//		**
//		*		
		for( int i=0; i<5; i++ ) { 
			
			for( int j=0; j< 5-i; j++) { //j, 0 ~ 4, x5
				System.out.print("*");
			}
			
			System.out.println();
		}		
		
		System.out.println("--------------");
		
//		*
//		***
//		*****
//		*******
		for( int i=0; i<4; i++ ) { 
			
			for( int j=0; j< 2*i+1; j++) { //j, 0 ~ 4, x5
				System.out.print("*");
			}
			
			System.out.println();
		}		

		System.out.println("--------------");
		
//	 	 *
//		***
//	   *****
//	  *******
		for( int i=0; i<4; i++ ) { 
			
			for( int j=0; j< 4-i-1; j++) { 
				System.out.print("&");
			}
			for( int j=0; j< 2*i+1; j++) { 
				System.out.print("*");
			}			
			
			System.out.println();
		}		
		System.out.println("--------------");
		
//		*개수를 원하는 만큼 찍기		
		
		final int LINE = 9;
		
		for( int i=0; i<LINE; i++ ) { 
			
			for( int j=0; j< LINE-i-1; j++) { 
				System.out.print(" ");
			}
			
			for( int j=0; j< 2*i+1; j++) { 
				System.out.print("*");
			}			
			
			System.out.println();
		}		

		
		
		
		
		
	}
}
