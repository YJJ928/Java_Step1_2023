package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample08 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("입력1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("입력2"));
		
		// num1이 크면 'num1이 큽니다.'
		// num2가 크면 'num2가 큽니다.'
		// 두 수는 같습니다.
		
		if (num1 > num2) {
			System.out.println("입력1이 큽니다.");
		} else if (num1 < num2) {
			System.out.println("입력2가 큽니다.");
		} else {
			System.out.println("두 수는 같습니다.");
		}
				
	}

}

