package chapter02;

public class Incre_Test01 {

	public static void main(String[] args) {
		
		
	int a, b, c; //동시 선언 가능
	a = 10; 
	b = 20;
	c = 3; //초기화
	
	System.out.println("++a : " + (++a)); //a = a+1 => a+=1
	System.out.println("a++ : " + (a++)); //a = a and a = a+1
	System.out.println("후위연산 : " + (a)); //12
	System.out.println("==================");
	
	System.out.println("c++ : " + (c++)); //3
	System.out.println("후위연산 : " + c); //4
	System.out.println("==================");
	
	System.out.println(++a + b++); //13+20 = 33
	System.out.println(b); //21
	System.out.println("==================");
	
	System.out.println(++a); //14
	System.out.println(b++); //21
	System.out.println(b); //22
	System.out.println(++a + b++); //15 + 22
	
	
	}

}
