package chapter03.IF.Example;

import java.util.Scanner;

public class Examplewhile03 {

	public static void main(String[] args) {
		
		boolean run = true;
		int num, num2;
		int save = 0;
		int money;
		
		try (Scanner scan = new Scanner(System.in)) {
			while (run) {
				System.out.println("----------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("----------------------------");
				System.out.print("번호를 선택하세요> ");
				num = scan.nextInt();

				if (num == 1) {
					System.out.println("예금을 선택하였습니다.");
					System.out.println("현재 금액 : " + save);
					System.out.print("입금할 금액을 입력하세요> ");
					money = scan.nextInt();
					if (money <= 0) {
						System.out.println("금액을 잘못 입력하였습니다.");
					} else {
						save += money;
					}
				} else if (num == 2) {
					System.out.println("출금을 선택하였습니다.");
					System.out.println("현재 금액 : " + save);
					System.out.print("출금할 금액을 입력하세요> ");
					money = scan.nextInt();
					if (save - money < 0) {
						System.out.println("잔액 부족으로 출금이 불가합니다.");
					} else {
						save -= money;
					}
				} else if (num == 3) {
					System.out.println("현재 잔고는 " + save + " 원 입니다.");
				} else if (num == 4) {
					System.out.println("프로그램을 종료합니다.");
					run = false;
				} else {
					System.out.println("잘못 선택하였습니다.");
				} //1번 if
				System.out.println("----------------");
				System.out.println("1.초기메뉴 | 2.종료");
				System.out.println("----------------");
				System.out.print("번호를 선택하세요> ");
				num2 = scan.nextInt();
				
				if (num2 == 2 && num !=4) {
					run = false;
					System.out.println("프로그램을 종료합니다.");
				} else if (num2 == 1 && num == 4) {
					run = true;
				}
					//2번 if
				
			} // while
		}
		
		//while(조건이참이면){이걸반복해서 실행) if break조건을 줘야 멈춤
		//switch(변수){case: 변수의 조건이 참이면 실행}{~~}

					
	} // main

} // class
