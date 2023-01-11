package chapter03.IF;

public class IfExample01 {

	public static void main(String[] args) {
		
		int age = 6;
		
		if(age >= 8) {
			
			System.out.println("학교에 다닙니다."); //true일 때
			
		} //if 
		else {
			System.out.println("학교에 다니지 않습니다."); //false일 때 
		}
		//String str = (age >= 8) ? "학교에O" : "학교에X";
	} //main

} //class


