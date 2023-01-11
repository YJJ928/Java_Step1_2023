package chapter06;

public class Student {
	
	//필드
	int studentID; //public
	public String studentName;
	int grade;
	String address;
	
	//디폴트 생성자(free compile)
	public Student() {
		
	}
	//생성자 오버로딩 -> 오버로딩 하면 디폴트 생성자를 반드시 써줘야 함.
	public Student(String studentName, String address) {
		this.studentName = studentName;
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void showStudentInfo() {
		System.out.println(studentName+", "+address);
	}
	
}
