package chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunTest_Overloading obj = new FunTest_Overloading();
		obj.getResult('T');
		obj.getResult(3);
		obj.getResult("String");
		obj.getResult(6 , "2023");
		
	}

}
