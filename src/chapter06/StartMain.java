package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Start st = new Start();
		
		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = scan.nextInt();
			String check=st.check(num);
			if(check.equals("SUCCESS")) {
				break;
			}
			
		}
//		int num;
//		do{
//			System.out.print("숫자 입력 : ");
//			num = scan.nextInt();
//		} while(st.check(num).equals("FAIL"));
	}

}
