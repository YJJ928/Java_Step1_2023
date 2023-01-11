package chapter03.IF.FOR;

public class ForTest04 {

	public static void main(String[] args) {
		// 0 ~ 100까지의 수 중 홀수만 합하기
		
//		int num;
//		int total = 0;
//		
//		for(num = 0 ; num <= 100 ; num++) {
//			if(num % 2 == 0) {
//				continue; // 건너뛰기
//			} else {
//				total += num;
//			}
//			System.out.println(num + " 까지 " + total);
//		}
//		System.out.println("------------");
//		System.out.println(num + " 까지 " + total);
		
		int num;
		int tot=0;
		
		for(num = 1 ; num < 20 ; num++) {
			if(num % 2 == 0) {
				continue; // 건너뛰기
			}
			tot += num;
			System.out.print(num + ", " + tot);
			System.out.println();
		}
		System.out.println("-------");
		System.out.print(num + ", " + tot);
		
		System.out.println();
		System.out.println("===============");
		
		tot=0;
		
		for(num = 1 ; num < 20 ; num++) {
			if(num % 2 != 0) {
				tot += num;
				System.out.print(num + ", " + tot);
				System.out.println();
			}
		}
		System.out.println("-------");
		System.out.print(num + ", " + tot);
	}

}
