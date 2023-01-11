package chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	//멤버 변수
	private int num[] = new int [3];
	private String result;
	
	public BaseballGame() {
		int[] numberPool = new int[9];
		outer: for (int i = 0;;) {
			num[i] = new Random().nextInt(9) + 1;
			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					continue outer;
				}
			}
			i++;
		}
	}
	
	public String check() {
		result = "OUT";
		return result;
	}
	
//	public String check() {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		//컴퓨터가 발생한 난수 1개
//		int com1 = 0;
//		int com2 = 0;
//		int com3 = 0;
//		String check = "FAIL";
//		
//		do {
//			//1~9 사이 난수3 발생
//			com1 = new Random().nextInt(9)+1;
//			com2 = new Random().nextInt(9)+1;
//			com3 = new Random().nextInt(9)+1;
//			
//		} while (com1 == com2 || com1 == com3 || com2 == com3);
//		
//		//컴퓨터 준비 완료상태
//		
//		//사용자 입력할 수 
//		int user1 = 0;
//		int user2 = 0;
//		int user3 = 0;
//		int count = 0;
//		
//		while (true) {
//			System.out.println("1에서 9 사이의 수를 입력하세요.");
//			System.out.print("첫번째 수를 입력하세요> ");
//			user1 = scan.nextInt();
//			System.out.print("두번째 수를 입력하세요> ");
//			user2 = scan.nextInt();
//			System.out.print("세번째 수를 입력하세요> ");
//			user3 = scan.nextInt();
//			
//			int strike = 0;
//			int ball = 0;
//			count++;
//			//com1 == user1 이면, 
//			
//			
//			if (com1 == user1) {
//				strike++;
//			} else if (com1 != user1 && (com2 == user1 || com3 == user1)){
//				ball++;
//			}
//			//---------------
//			if (com2 == user2) {
//				strike++;
//			} else if (com2 != user2 && (com1 == user2 || com3 == user2)){
//				ball++;
//			}
//			if (com3 == user3) {
//				strike++;
//			} else if (com3 != user3 && (com1 == user3 || com2 == user3)){
//				ball++;
//			}
//			//---------------
//			if(strike == 3) {
//				System.out.println(count+"회 만에 정답!! = "+com1+", "+com2+", "+com3);
//				check = "WIN";
//				break;				
//			} else {
//				if(strike > 0 || ball > 0) {
//					System.out.println(strike+" Strike, "+ball+" Ball");
//				} else {//다 불일치
//					System.out.println("OUT");
//				}
//			}
//		} return check;
	
}
