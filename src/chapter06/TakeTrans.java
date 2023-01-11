package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		
		//학생2명생성
		StdInfo studentJames = new StdInfo("James", 12000);
		StdInfo studentTom = new StdInfo("Tom", 10000);
		StdInfo studentKim = new StdInfo("Kim", 11000);
		
		//버스타기
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		
		//정보확인
		studentJames.showInfo();//지출발생
		bus100.showInfo();//수입증가,인원수증가
		System.out.println("==========");
		
		Bus bus987 = new Bus(987);
		studentTom.takeBus(bus987);
		studentTom.showInfo();
		bus987.showInfo();
		System.out.println("==========");
		
		//지하철타기 
		Subway sub3 = new Subway(3);
		
		//정보확인
		studentKim.takeSubway(sub3);
		studentKim.takeBus(bus100);
		studentKim.showInfo();
		sub3.showInfo();
		bus100.showInfo();
		System.out.println("==========");
		
		
		
	}

}
