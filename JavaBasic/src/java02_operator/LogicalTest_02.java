package java02_operator;

public class LogicalTest_02 {
	public static void main(String[] args) {
		
		int a = 5, b = 6, c = 10;

		boolean res1;
		res1 =  a < b || --a > c++;
		System.out.println(res1);
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);

		
		boolean res2;
		res2 = c<b++ && c-->++a;
		System.out.println(res2);
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		
		//논리연산자의 단축연산(shortcut)
		
		// AND연산은 왼쪽 피연산자가 false라면 오른쪽 항의 연산을 수행하지 않는다
		// OR연산은 왼쪾 피연한자가 true라면 오른쪽 항의 연산을 수행하지 않는다

	}
}












