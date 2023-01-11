package chapter05;

import javax.swing.JOptionPane;

public class FunTest02 {
	
	public FunTest02() {
		// TODO Auto-generated constructor stub
	}
	
	public void sum(int num1, int num2) {//method 기본 문법
		
//		int num1 = 1;
//		int num2 = 2;
		int total = num1 + num2;
		System.out.println("합계 : "+total);
	}	
		
	//실행 담당
	public static void main(String[] args) {
		
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		//위에 static제거하니 main에서 못찾고있음....호출안돼서 에러발생
		//
		// sum(a,b);
		
		FunTest02 Obj = new FunTest02(); // class를 가져와야 함!
		Obj.sum(a, b);
	
		
	} //main	
	
}  // class
