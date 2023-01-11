package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {
	//할일: 메소드 만들고 밑에서 실행할 것임..
	//합계 메소드(함수..)
	//public -> 공통으로 사용하는 것.
	public static void sum(int num1, int num2) {//method 기본 문법
		//public: 접근지정자 //public은 공용으로 사용하는 것(제한 없음)
		  //protected: 패키지 안에서만 공용사용가능하고, 다른패키지에서는 상속을 받아야 가능
		  //private: 제한이 있음. 접근이 안됨. 클래스 안에서만 가능
		//void: 리턴타입// 도출결과를 외부에 주지는 않음.//return 없음
		//sum: 메소드명
//		int num1 = 1;
//		int num2 = 2;
		int total = num1 + num2;
		System.out.println(total);
	}	
		
	//실행 담당
	public static void main(String[] args) {
		// 작업단위를 method 또는 함수로 생각..?
		// main : method
		// 현재 메인 : 실행을 담당하는 것...
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		//sum(); //sum()줄에 static을 추가해야 활성화 됨..
		sum(a,b); // sum()줄에 int num1, int num2를 추가해서 형식을 맞춰줘야 이 형태가 가능해짐.
		//type이랑 개수 맞춰줘야 함.변수명은 안맞춰줘도 됨
	
		
	} //main
	//main을 기준으로 하여 메인 선언 전 또는 후에 정의해도 됨
	//main() ~~ sum()~~ 순서로 써도 되고, sum()~~main()~~순서로 써도 됨..
	//통상 sum()~main()순서로
	
	
	
	
}  // class
