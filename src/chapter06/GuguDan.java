package chapter06;

public class GuguDan {
	
	//멤버변수
	
	//생성자 생략
	
	//메서드
	public void showTable(int num) {
		System.out.println(num+"단");
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}

}
