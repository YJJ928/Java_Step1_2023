package chapter03.IF;

import java.util.Scanner;
		//입력한걸 스캔뜬다..?
public class IfExample07 {

	public static void main(String[] args) {
		
		//입력 scanner 클래스 초기화 -> 인스턴스 변수방 선언
		
		Scanner scan = new Scanner(System.in);
		//num1을 출력, 한 번만 불러오면 됨, scanner의 기능을 다 쓸 수 있음
		
		System.out.println("1. 첫 번째 수 : ");
		
		// Class 
		// Scanner라는 타입에 scan이라는 변수방 만듬
		
		double num1 = Double.parseDouble(scan.nextLine());
		//형변환 (double) 못씀....왜? lang만 먹음??음..
		
		System.out.println("첫 번째 입력 받은 수 출력 : "+ num1);
		System.out.println( );
		System.out.println("2. 두 번째 수 : ");
		double num2 = Double.parseDouble(scan.nextLine());
		
		System.out.println("두 번째 입력 받은 수 출력 : " + num2);
		System.out.println( );
		
		if(num2 != 0.0) {
			System.out.println("나눈 값 : " + (num1 / num2));
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
				
	}

}
