package chapter02;

public class Condition01 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		boolean result;
		
		result = ++a >= b ? true : false;
		
//		       = 이 질문이 ? 참이면 응답 : 거짓이면 응답;
		
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 13;
		char result2;
		result2 = (++n1 == n2 ? 'Y' : 'N');
		System.out.println(result2);
		char result3 = (++n1 == n2 ? 'Y' : 'N');
		System.out.println(result3);
		char result4 = (++n1 == n2 ? 'Y' : 'N');
		System.out.println(result4);
		char result5 = (++n1 == n2 ? 'Y' : 'N');
		System.out.println(result5);
		

	}

}
