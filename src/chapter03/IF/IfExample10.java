package chapter03.IF;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample10 {

	public static void main(String[] args) {
		
		//Scanner scan이라는 인스턴스 변수 사용
		Scanner scan = new Scanner(System.in);
		
		//현재 DB에 있는 ID / PW
		String DB_ID = "idid";
		int DB_PW = 1212;
				
		//ID라는 변수로 아이디 받기
		System.out.println("ID를 입력하세요");
		String ID = scan.nextLine();				
	
		//PW라는 변수로 비번 받기(String)	 && PW를 int로 형변환
		System.out.println("비밀번호 입력하세요");
		// int PW = Integer.parseInt(scan.nextLine());
		String PW = scan.nextLine();
		int PW2 = Integer.parseInt(PW);
		
		//중첩질의로 상태 확인하고 안내문과 함께 상태표출(로그인 성공, 비밀번호 다름, 아이디 없음)
//		String Con = (ID.equals(DB_ID)) ? (PW2 == DB_PW) ? (ID+"님 환영합니다!") : ("PW가 올바르지 않습니다.") : ("ID가 올바르지 않습니다.");
//		System.out.println(Con);
		
//		if (ID.equals(DB_ID))  {
//			if (PW2 == DB_PW) {
//				System.out.println(ID + "님 환영합니다");
//			} else {
//				System.out.println("비밀번호가 올바르지 않습니다.");
//			}
//		} else {
//				System.out.println("아이디가 올바르지 않습니다.");
//		}
//		
		if (ID.equals(DB_ID) && (PW2 == DB_PW)) {
			System.out.println(ID + " 님 환영합니다!");
		} else if (ID.equals(DB_ID) && (PW2 != DB_PW)) {
			System.out.println("패스워드가 올바르지 않습니다.");
		} else {
			System.out.println("ID가 올바르지 않습니다.");
		}
		
	
	}

}
