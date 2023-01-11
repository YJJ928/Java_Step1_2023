package chapter03.IF.SWITCH;

public class SwitchCase05 {

	public static void main(String[] args) {
		
		System.out.println("주사위 눈의 수 : ");
		int num = (int)((Math.random()*10)+1); // double을 => int로 바꿈
		
		switch (num) {
		case 1: case 2: case 3: case 4: case 5: case 6:
			System.out.println(num + " 점 획득");
			break;
//		case 7: case 8: case 9: case 10:
//			System.out.println(num + " 점 획득");
//			break;
		default:
			System.out.println("꽝");
			break;
		
		}

	}

}
