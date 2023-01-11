package chapter06;

public class Bus {
	
	//멤버변수
	int busNumber;
	int passengerCount;
	int money; // 버스 수익
	
	//free complie 생략
	
	//overloading
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { // 승객이 낸 돈
		this.money += money; // 멤버변수에 올려놓음 //버스의 수입 증가
		passengerCount++;
	}
	
	public void showInfo() { //버스의 정보 출력
		System.out.println(busNumber+"번 버스 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");
	}
}
