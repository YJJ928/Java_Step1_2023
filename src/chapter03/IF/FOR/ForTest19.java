package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest19 {

	public static void main(String[] args) {
		
		//정수를 입력받아서 입력된 수만큼 ★ 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = scan.nextInt();
		
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("★"+ " ");
			} System.out.println();
		}	

	}

}
