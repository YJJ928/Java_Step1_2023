package chapter04;

public class Book { 
	//main이 없는 이 부분은 jvm에만 담겨있고 jdk에 컴파일 되지 못한다.
	//그냥 코드로만 들어가 있는 상태. 다른곳에서 사용할 수 있게 하려면 public 붙여주면 된다...
	//그것을 멤버변수라고 함. 멤버변수 밖에서 쓰려면 public 붙여야
	//그리고 get set 설정해서.. get이름으로 밖에서 쓸수있고, set으로 밖에것을 끌어올 수 있다.
	
	public Book() {
		// TODO Auto-generated constructor stub
	} //디폴트 생성자: Book(class와 같은이름) + control + space
	
	public Book(String bookname, String author) {
		this.bookname = bookname; //this 없으면 앞 bookname에 할당
		//this 붙여야 뒷 bookname에 할당
		this.author = author;
	}
	
	public String bookname; // public main에서 참조할 수 있도록 다 열어놓는다.
	public String author; //
	private String password; //private이면 다른곳에서 바로사용x
	
	//마우스우클릭 - source - generate getter and setter로 형성
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// main있으면.. 바깥에서 구성해놓고 
	
	//사용자 정의
	public void showBookinfo() {
		System.out.println("책이름 : "+bookname+ " | 저자 : "+author);
	}
	
	

}
