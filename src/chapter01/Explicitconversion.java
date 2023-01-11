package chapter01;

public class Explicitconversion {

	public static void main(String[] args) {
		// 캐스팅 문법(명시적 형변환)
		
		int iNum = 1000;
		byte bNum = (byte)iNum; //byte: -128 ~ 127까지 가능
		
		System.out.println(iNum);
		System.out.println(bNum); //유실된 결과값(손실)
		
		double dNum1 = 1.9; //8byte
		float fNum1 = 0.9f; //4byte
		
		int iNum2 = (int)(dNum1+fNum1);
		int iNum3 = (int)dNum1 + (int)fNum1;
		System.out.println("================");
		System.out.println(iNum2); //소수점 절사, 1.9 + 0.9 = 2.8 -> 2
		System.out.println(iNum3); //1 + 0 = 1
		
	}

}
