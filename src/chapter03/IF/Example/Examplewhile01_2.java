package chapter03.IF.Example;

import java.util.Scanner;

public class Examplewhile01_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			
			System.out.print("선택 > ");
			int selection = scan.nextInt();
			
			switch (selection) {
			case 1:
				System.out.print("예금액 > ");
				int deposit = scan.nextInt();
				if (deposit < 0) {
					System.out.println("오류");
					break;
				}
				balance += deposit;
				break;
			case 2:
				System.out.print("출금액 > ");
				int withdrawal = scan.nextInt();
				if (withdrawal < 0) {
					System.out.println("오류");
					break;
				} else if (balance < withdrawal) {
					System.out.println("잔액부족");
					break;
				}
				balance -= withdrawal;
				break;
			case 3:
				System.out.print("잔고 > " + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("오류");
				break;
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}
}