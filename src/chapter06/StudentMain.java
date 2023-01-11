package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student1 = new Student(); 
		//디폴트 생성자 없으면 오버로딩을 먼저 읽어버리므로 에러남
		//에러 제거하려면 디폴트 사용하려면 Student에 디폴트 생성자 반드시 명시
		
		student1.studentName = "김치";
		student1.address = "서울시 종로구";
		
		student1.showStudentInfo();
		System.out.println("----------");
		
		//메소드 이용하여 set
		Student student2 = new Student();
		student2.setStudentName("박수");
		student2.setAddress("경기도 고양시");
		student2.showStudentInfo();
		System.out.println("----------");
	
		Student student3 = new Student("치즈", "서울시 은평구");
		student3.showStudentInfo();
		
		System.out.println("----------");
		System.out.println(student3.studentName);
		
	}

}
