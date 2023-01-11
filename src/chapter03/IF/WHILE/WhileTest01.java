package chapter03.IF.WHILE;

public class WhileTest01 {

	public static void main(String[] args) {
		
//		while (조건)
//			while문 조건이 맞을 경우 반복하여 수행
//		}
		
		while(true) {
			int num = (int)(Math.random()*6 + 1);
			System.out.println("주사위의 눈 : "+ num);
			
			if(num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
