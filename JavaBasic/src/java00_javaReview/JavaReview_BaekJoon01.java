package java00_javaReview;

import java.util.Scanner;

public class JavaReview_BaekJoon01 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a,b,c;
        a=sc.nextLong();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println((a+b)%c);
        System.out.println(((a%b)+(b+c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a&c)*(b%c))%c);        
        
        
	}
}

