package chapter03.IF;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		//정보처리기사의 각 과목의 정답개수를 int형 타입의 변수 5개를 선언하고 입력받으세요(단 입력은 Scanner클래스 사용)
        //소프트웨어 설계(soft1), 소프트웨어 개발(soft2), 데이터베이스 구축(DB), 프로그램밍언어활용(pro), 정보시스템 구축(os)
		//한 과목이라도 8개 미만, 평균이 60점 미만인 경우 불합격입니다로 출력
		//그렇지 않으면 합격입니다으로 출력
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("소프트웨어 설계 정답 개수");
//		int soft1 = scan.nextInt();
//				
//		if (soft1 >= 8) {
//			System.out.println("소프트웨어 개발 정답 개수");
//			int soft2 = scan.nextInt();
//			if (soft2 >= 8) {
//				System.out.println("데이터베이스 구축 정답 개수");
//				int DB = scan.nextInt();
//				if (DB >= 8) {
//					System.out.println("프로그래밍 언어 활용 정답 개수");
//					int pro = scan.nextInt();
//					if (pro >= 8) {
//						System.out.println("정보시스템 구축 정답 개수");
//						int os = scan.nextInt();
//						if ((soft1 + soft2 + DB + pro + os >= 60)) {
//							System.out.println("합격입니다.");
//						} else {
//							System.out.println("불합격입니다.");
//						}
//					} else {
//						System.out.println("불합격입니다.");
//					}
//				} else {
//					System.out.println("불합격입니다.");
//				}
//			} else {
//				System.out.println("불합격입니다.");
//			}
//		} else {
//			System.out.println("불합격입니다.");
//		}


		System.out.println("소프트웨어 설계 정답 개수");
		int soft1 = scan.nextInt(); //next의 줄을 Int형태로 받겠다.
		System.out.println("소프트웨어 개발 정답 개수");
		int soft2 = scan.nextInt();
		System.out.println("데이터베이스 구축 정답 개수");
		int DB = scan.nextInt();
		System.out.println("프로그래밍 언어 활용 정답 개수");
		int pro = scan.nextInt();
		System.out.println("정보시스템 구축 정답 개수");
		int os = scan.nextInt();
		
		int sum = soft1 + soft2 + DB + pro + os;
		
		if (soft1 > 8 && soft2 > 8 && DB > 8 && pro > 8 && os > 8 && sum >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

	}

}
