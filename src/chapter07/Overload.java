package chapter07;

public class Overload {
	
	private String name;
	private int age;
	private float h;
	
	public Overload() {
		age = 0;
		h = 0;
		name = "익명"; //this.~~ 쓰는게 가독성이 좋음
	}
	
	public Overload(int a, float hh, String n) {
		age = a;
		h = hh;
		name = n;
	}
	public Overload(int a, float hh) {
		age = a;
		h = hh;
	}
	
	public void Disp() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("키: "+h);
	}
	

}
