package chapter04.Example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		//학생수를 입력받아, 점수를 입력하고 점수리스트를 출력하고 총점과 평균을 구하는 
		
		boolean run = true;
		int num;	
		int stu = 0;
		int score[] = null;
		int sum = 0;
		double avg = 0;
		int max = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.print("----------------------------------------------\n선택> ");
			num = scan.nextInt();

			if (num == 1) {
				System.out.print("학생수> ");
				stu = scan.nextInt();
				if (stu < 0) {
					System.out.println("정확한 학생수를 입력하세요");
				} else {
					score = new int[stu];
				}
//				for(int i = 0 ; i < stu ; i++) {
//					System.out.println(score[i]);
//				}
			} else if (num == 2) {
				if (stu == 0) {
					System.out.println("학생수를 먼저 입력해주세요");
				} else {
					System.out.println("점수를입력하세요");
					for (int i = 0; i < stu; i++) {
						System.out.print("score[" + (i + 1) + "] ");
						score[i] = scan.nextInt();
						if (score[i] < 0) {
							System.out.println("음수를 입력하였습니다.");
						} else {
							sum += score[i];
							if (max < score[i]) {
								max = score[i];
							}
							avg = sum / (double)stu;
						}
					}
				}

			} else if (num == 3) {
				for (int i = 0; i < stu; i++) {
					System.out.println("score[" + i + "] : " + score[i]);
				}
			} else if (num == 4) {
				System.out.println("최고점수 : " + max+" 점");
				System.out.println("총점 : " + sum+" 점");
				System.out.println(String.format("평균 : "+"%.2f",avg)+" 점");
			} else if (num == 5) {
				System.out.println("프로그램을 종료합니다.");
//				run = false;
				break;
			} else {
				System.out.println("번호가 잘못되었습니다.");
			}

		} // while
		scan.close();
	}

}
