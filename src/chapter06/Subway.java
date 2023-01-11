package chapter06;

public class Subway {
	
	//멤버변수
	public int lineNumber;
	int passengerCount;
	int money; // 지하철 수익
	
	//free complie 생략
	
	//overloading
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { // 승객이 낸 돈
		this.money += money; // 멤버변수에 올려놓음 //지하철의 수입 증가
		passengerCount++;
	}
	
	public void showInfo() { //버스의 정보 출력
		System.out.println(lineNumber+"호선 지하철 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");
	}
	
	
}
