package chapter05;

import java.util.Scanner;

import com.sun.source.tree.WhileLoopTree;

public class Method2 {

	int cnt, num;
	boolean run = true;
	String str = "";
	Method br = new Method();

	Scanner scan = new Scanner(System.in);
		
	void order2() {

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");
			num = scan.nextInt();

			switch (num) {
			case 1:
				{System.out.print("주문할 빵의 개수> ");
				int order = (int) scan.nextInt();
				br.makeBread(order);}
				break;
			case 2:
				{System.out.print("주문할 빵의 개수> ");
				int order = scan.nextInt();
				System.out.print("주문할 빵의 종류> ");
				String type = scan.next(); // nextline()은 문자 받고 엔터라 안읽어짐 그래서 next()로 받음.
				br.makeBread(order,type);}
				break;
			case 3:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("잘못된 입력값입니다.");
				break;
			}
		}

	}

}
