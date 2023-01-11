package chapter03.IF.WHILE;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class WhileTest07 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		int num = 1;
//		int sum = 0;
//		
//		do {
//			sum+=num;
//			num++;
//			
//		} while (num<=10);
//		System.out.println("1부터 10까지의 합은 "+sum);
		
		int num1;
		int num2;
		int cnt = 0;
		
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("OTP USER"));
			if(num1 == num2) {
				System.out.println("인증 성공!");
				break;
			} else {
				System.out.println("다시 입력하세요.");
				cnt++;
			}			
			
		} while (num1 != num2 && cnt < 3);
		if (cnt >= 3) {
			System.out.println("입력횟수 3회를 초과하였습니다.");
		}
	}
	

}
