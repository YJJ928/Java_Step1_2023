package chapter02;

public class Rela_test {

	public static void main(String[] args) {
		// >, <, >=, <=, ==, !=
		
		char a, b;
		a = 'A'; //65 (ASCIIcode)
		b = 'B'; //66
		
		boolean AL = a>b;
		System.out.println(AL); //F
		
		
		System.out.println(a>b); //F
		System.out.println(a<b); //T
		System.out.println(a==b); //F
		System.out.println(a!=b); //T
		
		int num1 = 5;
		int num2 = 3;
		System.out.println("==========");
		System.out.println(num1>num2); //T
		System.out.println(num1>=num2); //T
		System.out.println(num1<num2); //F 
		System.out.println(num1<=num2); //F
		System.out.println(num1==num2); //F
		System.out.println(num1!=num2); //T
		
		
		
	}

}
