package chapter03.IF;

import javax.swing.JOptionPane;
//javax.swing.
//외부 메소드 or 클래스..

public class IfExample02 {

	public static void main(String[] args) {
		
		//String  "10"+ 2 = 102 (문자로인식) /// 10 + 2 = 12 만들고싶다면..
		//String -> int 바꾸는것: Integer.parseInt
		//java.lang.String ~> java.lang에서 주는 String기능?
		
		int dat;
		dat = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요.")); 
		//int로 선언했는데 String으로 작성함 -> 에러 -> integer~~로 강제변환(명시적 변환)
		
		//10 배수를 판단하세요.
		//조건: dat에 있는 값을 10으로 나눈 나머지가 0인가?
		if(dat % 10 == 0) 
			System.out.println(dat + "은(는) 10의 배수입니다.");
		else 
			System.out.println(dat + "은(는) 10의 배수가 아닙니다.");
			
	}

}
