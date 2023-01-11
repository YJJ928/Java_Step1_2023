package chapter03.IF.SWITCH;

public class SwitchCase06 {

	public static void main(String[] args) {
		//9 ~ 18 시 
		int time = (int)(Math.random()*12+9);
		System.out.println("[현재시간 : "+ time + " 시]");
		System.out.print("할 일 : ");
		
		switch (time) {
		case 9: case 10: case 11: case 13: case 15:
			System.out.println("수업듣기");
			break;
		case 14: case 16: case 17: case 18:
			System.out.println("문제풀기");
			break;
		default:
			System.out.println("자유시간");
			break;
		}
	}

}
