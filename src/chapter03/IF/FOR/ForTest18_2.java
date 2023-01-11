package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest18_2 {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수를 입력하세요. : ");
//		int num = scan.nextInt();
//
//		for (int i = 1; i <= num; i++) {
//			for (int j = num; j >= i; j--) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("★");
//			}
//			System.out.println();
		
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("> ");
//		int n = scan.nextInt();
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n - (i + 1); j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("★");
//			}
//			System.out.println();
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수를 입력하세요. : ");
//		int n = scan.nextInt();
//		
//		for(int i = 0; i<n; i++) { //한줄 띄기
//			for(int j=0; j<=n-1-i; j++)	{ //공백찍기
//				System.out.print(" ");
//			}
//			for(int j=0; j<2*i+1; j++)	{ //별찍기
//				System.out.print("★");
//			}
//			System.out.println();
//		} scan.close(); //scanner leak 해결
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int n = scan.nextInt();
		int i, j;
		for (i = 1 ; i < n ; i++) {
			for(j = 1 ; j < n-i ; j++) {
				System.out.print(" "); //3 2 1
			}
			for(j = 1 ; j < i ; j++) {
				System.out.print("★");
			}System.out.println(); //1 2 3
		}
		
		scan.close(); //scanner leak 해결
		
	}

}
