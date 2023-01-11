package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest16 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행을 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("열을 입력하세요 : ");
		int b = scan.nextInt();
		
		for (int j = 1; j <= a; j++) {
			for (int i = 1; i <= b; i++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
		
	}

}
