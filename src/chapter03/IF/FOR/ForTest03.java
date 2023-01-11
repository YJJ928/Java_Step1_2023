package chapter03.IF.FOR;

public class ForTest03 {

	public static void main(String[] args) {
		
		//1부터 더했을 때 합이 100 이하 중 가장 큰 i와 그 합.
		//방법1	
//		int i;
//		int sum = 0;
//		
//		for (i = 1 ; i <= 100 ; i++) {
//			sum += i;
//			if (sum < 100) {
//				System.out.println("숫자 " + i + " 까지의 합이 " + sum + " 입니다.");
//			}//if
//		}//for
//		
//		//방법2
//		System.out.println("======================");
//		int j;
//		int sum1 = 0;
//		
//		for (j = 1 ; j <= 100 ; j++) {
//			sum1 += j;
//			if (sum1 > 100) {
//				break;
//			}//if
//			
//		}//for
//		System.out.println("숫자 " + (j-1) + " 까지의 합이 " + (sum1-j) + " 입니다.");
		
		//방법3
		System.out.println("======================");
		int k;
		int sum2 = 0;
		
		for(k = 1 ; sum2 < 100 ; k++) {
			sum2 += k;
			System.out.println("k "+ k +"  sum2 " + sum2);
			}
		System.out.println("숫자 " + (k-1) + " 까지의 합이 " + sum2 + " 입니다.");
		
	}//main

}//class
