package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		StudentInfo studentKim = new StudentInfo();
		
		studentKim.studentID = 33;
		studentKim.grade = 3;
		studentKim.address = "서울시 종로구";
		//private 변수는 불러올 수 없다.//method를 통해서만 불러올 수 있다.
		//그래서 studentinfo에서 getter setter를 생성해줌...
		
		//get set 활성화시키면
		studentKim.setStudentName("홍길등"); //set으로 불러오고
		String name = studentKim.getStudentName();//get으로 갖다넣고?
		
		System.out.println(name);
	}

}
