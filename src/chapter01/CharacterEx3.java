package chapter01;

public class CharacterEx3 {

	public static void main(String[] args) {
		
		int a = 65;
		//대문자: 65부터 표현이 됨, 소문자는 97부터 표현됨
		
		System.out.println(a);
		System.out.println((char)a); //명시적 형변환(캐스팅)(ASCII 코드로)
		System.out.println("=================");
		
		int b = 66;
		System.out.println(b);
		System.out.println((char)b); //명시적 형변환(ASCII 코드로)
		System.out.println("=================");
		
		int a2 = 97;
		System.out.println(a2);
		System.out.println((char)a2); //명시적 형변환(ASCII 코드로)
		System.out.println("=================");
		
		int a3 = 99999;
		System.out.println(a3);
		System.out.println((char)a3); //명시적 형변환(ASCII 코드로)
		System.out.println("=================");
	}
	
	

}
