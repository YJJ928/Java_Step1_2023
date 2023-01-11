package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		
		// 정수를 입력받아 (scanner)입력받은 정수부터 100까지의 합을 출력하세요.
		
		Scanner s = new Scanner(System.in);
		
//		System.out.print("1~50까지의 수를 입력하세요: ");
//		int a = s.nextInt();
//		int sum = 0;
//		int i;
//		for (i = a ; i < 100 ; i++) {
//			sum += i;
//		}
//		System.out.println(a + " 부터 100 까지의 합은 "+ sum + " 입니다.");
		
		//1~10까지 반복하면서 정수를 입력받아(for문안에 직접 입력해가면서) 
		//그 수중에 짝수의 갯수가 몇개인지 출력
		//단 입력받은 수가 0이면 무시
		
		System.out.print("숫자 10번 입력 : ");
		int b, j, cnt = 0; //인수를 세개로......
		
		for (j = 1; j <= 10; j++) {
			b = s.nextInt();
			
			if (b == 0) {
				continue;
			}
			if (b % 2 == 0) {
				cnt++;	// cnt += 1;		
			} 
		}
					
		System.out.println("짝수는 " + cnt + " 개");
				

	}

}
