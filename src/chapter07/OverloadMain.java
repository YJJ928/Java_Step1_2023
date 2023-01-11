package chapter07;

public class OverloadMain {

	public static void main(String[] args) {
		
		Overload obj1 = new Overload();
		obj1.Disp();
		System.out.println();
		Overload obj2 = new Overload(123, 23, "ㅇㅇㅇ");
		obj2.Disp();
		System.out.println();
		Overload obj3 = new Overload(22,222);
		obj3.Disp();
		System.out.println();

	}

}
