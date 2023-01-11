package chapter03.IF;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		
		// gender가 M이면 남성입니다. 그렇지 않으면 여성입니다.
		
		
		char gender;
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력하세요(M/F) : ");
		gender = scan.nextLine().charAt(0);
		if (gender == 'M' || gender == 'm') {
			System.out.println("남성입니다.");
		} else {
			System.out.println("여성입니다.");
		}
		
		System.out.println("--------------");
		System.out.println();
		System.out.print("주문하시겠습니까? (Y/N) : ");
				
		char ch;
		String menu;
		ch = scan.nextLine().charAt(0);
		if (ch == 'Y' || ch == 'y') {
			System.out.print("메뉴를 입력하세요 : ");
			menu = scan.nextLine();
			System.out.println(menu + " 주문이 완료되었습니다.");
		} else if (ch == 'N' || ch == 'n') {
			System.out.println("이용해주셔서 감사합니다.");
		} else {
			System.out.println("잘못된 선택입니다.");
		}
		
	}

}
