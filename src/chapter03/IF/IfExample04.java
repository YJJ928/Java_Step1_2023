package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		
		//전시관의 입장료 미취학 아동 1000원 / 초등학생 2000원 / 중고등학생 3500원 / 성인 5000원
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("나이가 어떻게 되십니까?"));
		String dev;
		int mon;
		//swing 사용
		
		if (age >= 20) {
			dev = "성인";
			mon = 5000;
		} else if (age >= 14 && age < 20) {
			dev = "중고등학생";
			mon = 3500;
		} else if (age >= 8 && age < 14) {
			dev = "초등학생";
			mon = 2000;
		} else {
			dev = "미취학 아동";
			mon = 1000;
		}
		
		System.out.println(dev + " 입니다.");
		System.out.println("입장료는 "+ mon + "원 입니다.");		
		
	}

}
