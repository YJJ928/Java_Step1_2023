package chapter03.IF.WHILE;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, cnt = 0, sum = 0;
		double avg;
		// 0 입력하면 종료				
		while(true) {
			System.out.print("숫자입력 : ");
			num = scan.nextInt();
			if (num == 0) {
				break;
			}
			cnt++;
			sum += num;
		}
		avg = (double)(sum/cnt);
		System.out.println("종료");
		System.out.println("입력된 자료 개수 : "+ cnt);
		System.out.println("입력된 자료 합계 : "+ sum);
		System.out.println("입력된 자료 평균 : "+ avg);
		
	}

}
