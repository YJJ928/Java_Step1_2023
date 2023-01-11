package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		
		//몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력받아 총점과 평균을 구하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int i, cnt = 0;
		double sum = 0;
		double avg;
		
		System.out.println("몇명의 성적을 입력받을 예정인가요?");
		int stu = scan.nextInt();
		
		for(i = 1 ; i <= stu ; i++) {
			System.out.print(i+"번째 학생의 점수를 입력하세요 : ");
			int score = scan.nextInt();
			sum += score;
			cnt++;
		}
		avg =  sum/(double)cnt; 
		System.out.println("총점은 "+ sum +" 점 입니다.");
		System.out.println(cnt+" 명의 평균 점수는 "+ avg + " 입니다.");
		
	}

}
