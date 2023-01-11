package chapter03.IF.WHILE;

import java.util.Scanner;

public class WhileTest08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		String menu = "";
		
		
		while (true) {
			System.out.print("1.입력하기\n2.출력하기\n3.삭제하기\n4.끝내기\n");
			System.out.print("작업할 번호를 선택하세요.> ");
			num = scan.nextInt();

			switch (num) {
			case 1:
				menu = "1.입력하기";
				break;
			case 2:
				menu = "2.출력하기";
				break;
			case 3:
				menu = "3.삭제하기";
				break;
			case 4:
				menu = "4.끝내기";
				break;
			default:
				menu = "잘못입력";
				break;
			}// switch

			if (num == 4) {
					break;
			}
		}System.out.println("끝");
		
	} 
		
}


