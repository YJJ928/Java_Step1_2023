package chapter03.IF.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		
		// scanner 클래스의 인스턴스변수 scan에 값을 입력받음
		// A,a -> 우수고객 / B,b -> 일반회원 / 나머지 -> 고객
		//charAt(0): String -> char 변경할 때 씀
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("등급을 입력하세요(A,B,C): ");
		char grade;
		
		grade = scan.nextLine().charAt(0);  //String으로 받아서 char로 바꾸어 grade에 할당
		//  grade가 가리키고 있는 문자열에서 0번째에 있는 문자를 char타입으로 변환한다
		
		switch (grade) {
		case 'A': case 'a': // case 'A','a':라고 쓰는것도 가능하나 java 14 부터가능함
			System.out.println("우수고객 입니다.");
			break;
		case 'B': case 'b':
			System.out.println("일반고객 입니다.");
			break;
		case 'C': case 'c':
			System.out.println("비회원 입니다.");
			break;
		default:
			System.out.println("잘못된 등급 입니다.");
			break;
		}
				
	}

}
