package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		
		//10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		int a, cnt3 = 0, cnt5 = 0;
		System.out.println("정수 10개를 입력하세요 : ");
		
		int b;

		for (a = 1; a <= 10 ; a++) {
			b = scan.nextInt();
			if (b % 3 == 0) {
				System.out.println(b + " 은(는) 3의 배수");
				cnt3++;
			}
			if (b % 5 == 0) {
				System.out.println(b + " 은(는) 5의 배수");
				cnt5++;
			}
		System.out.println();
		System.out.println("3의 배수 "+ cnt3+ " 개, 5의 배수" + cnt5+ " 개");
			
		}
		 
	}

}
