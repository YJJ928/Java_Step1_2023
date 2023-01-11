package chapter01;

public class BinaryTest2 {

	public static void main(String[] args) {

		int num = 10;
		int bNum = 0B1000;
		//B: binary의 약자, 2진수 임을 나타냄(0B + ~)
		int oNum = 010;
		// 8진수(OCT)(0 + ~)
		int bNum2 = 0B10000;
		int hNum = 0x10;
		// 16진수(hexa)(0x + ~)
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(bNum2);
		System.out.println(hNum);
	}

}

//첫자소문자+중간단어첫자대문자+~~ : 카멜기법
//첫자대문자+~~ : 파스칼기법