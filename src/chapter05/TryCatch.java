package chapter05;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		// 예외처리
		
		int num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
//		int res = num1/num2;
//		System.out.println(res);
		
		try {
			System.out.println(num1/num2); //해당 작업 코드
		} catch (ArithmeticException e) {
			System.out.println("숫자0은 제외하세요."); //에러시 코드
		} //문제가없으면 try 실행 문제있으면 catch 실행
		
		System.out.println("error후 컴파일 => 프로그램 종료");
	}//main

}//class
