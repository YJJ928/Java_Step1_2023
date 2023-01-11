package chapter07;

public class ConstTest {
	private int aa;
	private int bb;

	
	//constructor generic using field하면
//	public ConstTest(int aa, int bb) {
//		super();
//		this.aa = aa;
//		this.bb = bb;
//	}
	public ConstTest() {
		
	}
	
	//생성자 오버로딩
	public ConstTest(int aa, int bb) {
		this.aa = aa;
		this.bb = bb;
	}
	public static void main(String[] args) {

		ConstTest obj1 = new ConstTest();
		System.out.println(obj1.aa = 10); // 멤버변수가 private이어도 같은 클래스에 메인이 존재하면 사용가능
		System.out.println(obj1.bb = 20);
		System.out.println("-----------");

		ConstTest obj2 = new ConstTest(30, 40);
		System.out.println(obj2.aa);
		System.out.println(obj2.bb);

	}

}
