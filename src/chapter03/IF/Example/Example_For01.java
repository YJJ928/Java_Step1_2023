package chapter03.IF.Example;

public class Example_For01 {

	public static void main(String[] args) {
		// 1 ~ 100까지의 수 중 3의 배수의 합
		
		int num;
		int sum = 0;
		
		for(num = 1 ; num <= 100 ; num++) {
			if(num % 3 == 0) {
				sum += num;
			} 
		}
		System.out.print("3배수 합: " + sum);
				
	} //main

} //class
