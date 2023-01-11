package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample09 {

	public static void main(String[] args) {
		
		
		// 서버
		String ID = "soldesk";
		
		//내장형 class라서 new로 선언안해도 됨. String: 내장되어있는 인스턴스 변수
		//ID. 하면 이것저것 뜸
		
		int PW = 221227; // 정수형 변수
		
		// PW.해도 아무것도 안나옴 메모리에 없어서
		
		// 고객
		String id = JOptionPane.showInputDialog("아이디를 입력하세요");
		int pw = Integer.parseInt(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
		
		if (ID.equals(id)) {// ID == id
			//비번확인
			if (PW == pw) { //PW.을 쓸수 없어. 정수형 변수라.
				System.out.println(ID+"님 환영합니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		
		
	}

}

