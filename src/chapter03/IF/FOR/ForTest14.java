package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단을 입력하세요: ");
		int dan = scan.nextInt();
		
		for(int n = 1 ; n < 10 ; n++) {
			System.out.println(dan + " x "+ n +" = "+(dan*n));
		}
					
	}

}
