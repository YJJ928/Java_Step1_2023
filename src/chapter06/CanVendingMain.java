package chapter06;

import java.util.Scanner;

public class CanVendingMain {

	public static void main(String[] args) {
		
		String select = "";
		int mon = 0;
		Scanner scan = new Scanner(System.in);
		
		Vending vd = new Vending();
		
		vd.init();//음료준비!!!!!-> 이걸 해야 can[]가 초기화 됨
		
		//돈 -> 가능한 음료
		System.out.print("주입한 돈은 얼마인가요> ");
		
		mon = scan.nextInt(); //돈 투입
		vd.showCans(mon);
		
		//
		System.out.print("음료를 선택하세요.");
		select = scan.next(); //음료 
		vd.outCan(select);
		
	}

}
