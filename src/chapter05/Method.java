package chapter05;

import java.util.Scanner;

public class Method {
	
	//멤버변수(=필드)
	
	//생성자 생략
	
	//메소드
	
	void makeBread() {
		System.out.println("빵을 만듭니다.");
	}//메소드1
	void makeBread(int count) {
		for(int i = 0 ; i < count ; i++ ) {
			System.out.println((i+1) + " 번째 빵을 만들었습니다." );
		}System.out.println("요청하신 "+count+"개 빵이 완료되었습니다.");		
	}//메소드2
	void makeBread(int count, String str) {
		for(int i = 0 ; i < count ; i++ ) {
			System.out.println((i+1) + " 번째 "+str+"을(를) 만들었습니다." );
		}System.out.println("요청하신 "+count+"개의 "+str+"이(가) 완료되었습니다.");		
	}//메소드3
	
	void order() {
		
		Scanner scan = new Scanner(System.in);
		
//		while (true) {
//			System.out.print("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료\n선택> ");
//			int num = scan.nextInt();			
//			if(num == 1) {
//				System.out.print("주문할 빵의 개수> ");
//				int order = (int) scan.nextInt();
//				for(int i = 0 ; i < order ; i++ ) {
//					System.out.println((i+1) + " 번째 빵을 만들었습니다." );
//				}System.out.println("요청하신 "+order+"개 빵이 완료되었습니다.");	
//				//메소드 2
//			} else if (num == 2) {
//				System.out.print("주문할 빵의 개수> ");
//				int order = scan.nextInt();
//				System.out.print("주문할 빵의 종류> ");
//				String type = scan.next();
//				for(int i = 0 ; i < order ; i++) {
//					System.out.println((i+1) + " 번째 "+type+"을(를) 만들었습니다." );
//				}System.out.println("요청하신 "+order+"개의 "+type+"이(가) 완료되었습니다.");	
//				//메소드 3
//			} else if (num == 3) {
//				System.out.println("프로그램 종료");
//				break;
//			} else {
//				System.out.println("번호가 잘못되었습니다.");
//			}
//		}
		
		while (true) {
			System.out.print("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료\n선택> ");
			int num = scan.nextInt();			
			if(num == 1) {
				System.out.print("주문할 빵의 개수> ");
				int order = (int) scan.nextInt();
				makeBread(order);
				//메소드 2
			} else if (num == 2) {
				System.out.print("주문할 빵의 개수> ");
				int order = scan.nextInt();
				System.out.print("주문할 빵의 종류> ");
				String type = scan.next(); // nextline()은 문자 받고 엔터라 안읽어짐 그래서 next()로 받음.
				makeBread(order,type);
				//메소드 3
			} else if (num == 3) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("번호가 잘못되었습니다.");
			}
		}
		
	}//order method

}
