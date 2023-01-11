package chapter06;

import java.util.Calendar;

public class EnumWeekMain {

	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); //인스턴스 객체 생성
		int week = cal.get(Calendar.DAY_OF_WEEK); // 1~7까지 나열
		
		switch (week) {
		case 1:
			System.out.println(week);
			today = Week.SUNDAY;
			break;
		case 2:
			System.out.println(week);
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		default:
			break;
		}
		System.out.println("오늘은 "+today+" 입니다.");
		
		if(today == Week.SUNDAY) {
			System.out.println("백설이와 놉니다.");
		} else {
			System.out.println("강의를 합니다.");
		}
	}

}
