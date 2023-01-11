package chapter02;

public class Logic_Test02 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("=======AND=======");
		boolean flag1 = (num1>10)&&(num2>20);
		System.out.println(flag1); //F&&F = F
		
		boolean flag2 = (num1>10)&&(num2>0);
		System.out.println(flag2); //F&&T = F
		
		boolean flag3 = (num1>0)&&(num2>20);
		System.out.println(flag3); //T&&F = F
		
		boolean flag4 = (num1>0)&&(num2>0);
		System.out.println(flag4); //T&&T = T
		
		
		System.out.println("=======OR=======");
		boolean flag5 = (num1>10)||(num2>20);
		System.out.println(flag5); //F||F = F
		
		boolean flag6 = (num1>10)||(num2>0);
		System.out.println(flag6); //F||T = T
		
		boolean flag7 = (num1>0)||(num2>20);
		System.out.println(flag7); //T||F = T
		
		boolean flag8 = (num1>0)||(num2>0);
		System.out.println(flag8); //T||T = T
		
		System.out.println("=======NOT=======");
		boolean flag = (num1 != num2); //T
		System.out.println(flag);
		
		flag = !(num1>0); //!T = F
		System.out.println(flag); //F
		
		

	}

}
