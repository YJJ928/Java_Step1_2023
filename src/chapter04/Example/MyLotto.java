package chapter04.Example;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		
		int number;
		int cnt = 0;
		int[] lotto = new int[6];
		
		System.out.println("====이번주 로또 예상번호====");
		number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매 횟수를 입력하세요.(1000원 = 1회) "));
	
//		for(int i = 0 ; i < number ; i++) {
//			System.out.print("["+(cnt+1)+"] ");
//			for(int j = 0 ; j < lotto.length ; j++) {
//				int random = (int)(Math.random()*45 + 1);
//				System.out.print(random + " ");	
//			}
//			System.out.println();
//			cnt++;
//		}
		
//		for(int i = 0 ; i < number ; i++) {
//			System.out.print("["+(cnt+1)+"] ");
//			for(int j = 0 ; j < lotto.length ; j++) {
//				int random = (int)(Math.random()*45 + 1);
//				System.out.print(random + " ");	
//			}
//			System.out.println();
//			cnt++;
//		}
		
//		while (number > cnt) {
//			System.out.print("["+(cnt+1)+"] ");
//			for(int i = 0 ; i < lotto.length ; i++ ) {
//				lotto[i] = (int)(Math.random()*45);
//				System.out.print(lotto[i]+" ");
//			}cnt++;
//			System.out.println();
//		
//			if(number <= cnt) {
//				break;
//			}
//		}
				
//		while (number > cnt) {
//			System.out.print("[" + (cnt + 1) + "] ");
//
//			outer: for (int i = 0; i < lotto.length;) {
//				lotto[i] = new Random().nextInt(45) + 1;
//
//				// 중복값을 비교하는 반복문
//				for (int j = 0; j < i; j++) {
//					if (lotto[i] == lotto[j]) {
//						continue outer; //
//					} // if
//				} // in for
//				System.out.print(lotto[i] + " ");
//				i++;
//			} // out for
//			cnt++;
//			System.out.println();
//		
//		}
		
		while (number > cnt) {
			System.out.print("[" + (cnt + 1) + "] ");
			
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = new Random().nextInt(45) + 1;
				if (number == lotto[i]) {
					i--;					
				} 
				System.out.print(lotto[i]+ " ");
				
			}
			cnt++;
			System.out.println();
		}

	}

}
