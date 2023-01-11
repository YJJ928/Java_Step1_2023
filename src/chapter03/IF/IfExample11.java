package chapter03.IF;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample11 {

	public static void main(String[] args) {
		//데이터 베이스
		
		String ID = "Soldesk";
		int PW = 221227;
		
		//Scanner scan
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID를 입력하세요");
		String inputID = scan.nextLine();
		
		//ID받기 -> ID 맞으면 PW 받기
		
		if (ID.equals(inputID)) {
				System.out.println("PW를 입력하세요");
				String inputPW = scan.nextLine();
				int inputPW2 = Integer.parseInt(inputPW);
				if (inputPW2 == PW) {
					System.out.println("로그인 성공!");
				} else {
					System.out.println("비밀번호가 다릅니다.");
				}
		} else {
			System.out.println("아이디가 다릅니다.");
		} 
					
	}

}
