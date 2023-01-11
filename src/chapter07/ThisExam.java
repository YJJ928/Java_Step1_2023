package chapter07;

public class ThisExam {

	int day;
	int month;
	int year;
	
	public ThisExam() {}
	
	public ThisExam(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	//getter setter
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	//=========================================
	public static void main(String[] args) {
		ThisExam birth1 = new ThisExam(20, 10, 2020);
		birth1.printThis();
		System.out.println("birth 생년월일 : "+birth1.year+"/"+birth1.month+"/"+birth1.day);
		System.out.println("birth 생년월일 : "+birth1.getYear()+"/"+birth1.getMonth()+"/"+birth1.getDay());
		System.out.println("-----------------");
		ThisExam birth2 = new ThisExam();
		birth2.printThis();
		birth2.setDay(22);
		birth2.setMonth(10);
		birth2.setYear(2022);
		System.out.println("birth2 생년월일 : "+birth2.getYear()+"/"+birth2.getMonth()+"/"+birth2.getDay());				
		

	}

}
