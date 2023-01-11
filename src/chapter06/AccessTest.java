package chapter06;

import java.util.Scanner;

public class AccessTest {
	
	//필드
	private int aa;
	public int bb;
	int cc;
	
	//디폴트 생성자
	
	//AccessTest(): void주면 안됨
	
	//메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Disp() {
		System.out.println("aa값: "+aa+"\nbb값: "+bb+"\ncc값: "+cc);
	}

	public static void main(String[] args) {
		// 객체 obj
//		Scanner scan = new Scanner(System.in);
		AccessTest obj = new AccessTest();
//		System.out.print("aa값> ");
//		obj.aa = scan.nextInt();
//		System.out.print("bb값> ");
//		obj.bb = scan.nextInt();
//		System.out.print("cc값> ");
//		obj.cc = scan.nextInt();
//		
//		obj.Disp();
		
		obj.setAa(3);
		obj.setBb(2);
		obj.setCc(1);
		obj.Disp();

	}

	

}
