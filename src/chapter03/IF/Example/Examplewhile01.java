package chapter03.IF.Example;

import java.util.Scanner;

public class Examplewhile01 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0; //초기값 0
		Scanner scan = new Scanner(System.in);
		
		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("번호선택> ");
			int num = scan.nextInt();

			if (num == 4) {
				break;
			} else if (num == 1) {
				System.out.print("예금액> ");
				int mon = scan.nextInt();
				if(mon <= 0) {
					System.out.println("입력금액이 잘못되었습니다.");
				} else {
					balance += mon;
				}
			} else if (num == 2) {
				System.out.print("출금액> ");
				int mon = scan.nextInt();
				
				if ((balance-mon) < 0) {
					System.out.println("잔액이 부족합니다.");
				} else {
				balance -= mon;
				}
			} else if (num == 3) {
				System.out.println("잔고> " + balance);
			} else {
				System.out.println("잘못입력하였습니다.");
			}

		}
		System.out.println("프로그램 종료");

	} // main

} // class
