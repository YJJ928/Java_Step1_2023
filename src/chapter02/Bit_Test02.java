package chapter02;

public class Bit_Test02 {

	public static void main(String[] args) {
		
		int num = 0B00000101; //5
		System.out.println(num);
		
		System.out.println(num << 2); //num을 왼쪽으로 2씩 이동 = 증가 //20
//		0B 00000101
//		0B 00001010
//		0B 00010100
		
		System.out.println(0B00010100); //20
		
		System.out.println(num >> 2); //1
		
//		0B 00000101
//		0B 00000010
//		0B 00000001
		
		//암호같은거 만들 때....
		
		int a, b, c;
		a = 5;
		b = 2;
		c = a>>b; // 5>>2
		System.out.println(c);
		
		c = a<<b; // 5<<2
		System.out.println(c);		
		
	}

}

