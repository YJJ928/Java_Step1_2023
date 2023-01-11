package chapter06;

public class StdInfo {
	
	//필드
	public String studentName;
	public int grade;
	public int money;
	
	//free compile 생략
	
	//생성자 오버로드
	public StdInfo(String studentName, int money) {
		this.studentName = studentName;
		this.money = money; //set을 하는 것임
	}
	//버스
	public void takeBus(Bus bus) {//takeBus의 매개변수로 Bus(class) method가 통째로 올 수 있음
		bus.take(1000);
		this.money -= 1000; //학생의 지출
	}
	//지하철
	public void takeSubway(Subway subway) {//takeBus의 매개변수로 Bus(class) method가 통째로 올 수 있음
		subway.take(1500);
		this.money -= 1500; //학생의 지출
	}
	
	//남은 잔액
	public void showInfo() {
		System.out.println(studentName+"님의 남은 잔액은 "+money+"원 입니다.");
	}
	
}
