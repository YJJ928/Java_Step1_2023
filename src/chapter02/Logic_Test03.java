package chapter02;

public class Logic_Test03 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((i = i+2) <10) && ((num1 =num1 + 2)<10); //t && f = f
		System.out.println(i); //4
		System.out.println(num1); //12
		System.out.println(value); //f

//		value = ((i = i+2) >10) && ((num1 =num1 + 2)<10); //f && f = f
//		System.out.println(i); //4
//		System.out.println(num1); //10 --> &&연산에서 앞이 f라 뒤의 계산을 안해서 10으로 존재함!!
//		System.out.println(value); //f
		// 인자가 복잡해질 경우 주의가 필요함!
		
		System.out.println("=================");		
		value = ((i = i+2) <10) || ((num1 =num1 + 2)<10); //t || f = f
		System.out.println(i); //6
		System.out.println(num1); //14
		System.out.println(value); //T
		
	}

}
