package chapter06;

public class Vending {
	
	//멤버변수
	
	private Can can[] = new Can[5];
	//
	private int money;
	//can[0] = new Can("환타",1000); 
	//can[]이 private이어서 에러남...method안에서 초기화 해야 함
	
	//method 생성
	//음료 종류 input하기
	public void init() {
		can[0] = new Can("환타",1000); 
		//public method 만들어서 안에 초기화하면 쓸 수 있다.(에러안남...)
		can[1] = new Can("콜라", 1500);
		can[2] = new Can("사이다", 1300);
		can[3] = new Can("커피", 1200);
		can[4] = new Can("우유", 1100);
	}
	
	// 사용가능한 음료만 보여주기	
	public void showCans(int mymoney) {
		
		money = mymoney;
		
		for(int i = 0 ; i < can.length ; i++) {
			//돈과 가격과 비교 판단
			if(can[i].getPrice() <= money) {
				System.out.println(can[i].getCanName()+"("+can[i].getPrice()+")");
			}
			
		}System.out.println("의 음료가 구매 가능합니다.");
		
	}
	
	public void outCan(String name) {
		for(int i = 0 ; i < can.length ; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName()+"를 선택하였습니다.");
				System.out.println("잔 액: "+(money - can[i].getPrice()));
			}
		} //for
	}//outCan
	
	
}//class
