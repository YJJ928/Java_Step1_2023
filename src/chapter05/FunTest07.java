package chapter05;

import java.util.Scanner;

public class FunTest07 {
	
	public FunTest07() {
		// TODO Auto-generated constructor stub
	}
	
//	public static String Edustep(int edu) {
//		String step; //stack memory
//		
//		if(edu == 1) {
//			step = "1단계";
//		} else if (edu == 2) {
//			step = "2단계";
//		} else if (edu == 3) {
//			step = "3단계";
//		} else {
//			step = "등급외";
//		}
//		return step;
//	}
//
//	public static void main(String[] args) {
//		//Edustep에서 sys~~를 안했으므로 값을 받아서 print해 줘야 함..
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("스터디 단계를 입력하세요 : ");
//		int number = scan.nextInt();
//		//return값 있는경우
////		Edustep(number); //그냥 리턴만...값 print를 안해줌
//		String step = Edustep(number);
//		System.out.println("현재 수업단계는 "+step+"입니다.");
		
		
	//return값 있는경우
		public static void Edustep(int step) {
			if(step == 1) {
				System.out.println(step+"단계입니다.");
			} else if (step == 2) {
				System.out.println(step+"단계입니다.");
			} else if (step == 3) {
				System.out.println(step+"단계입니다.");
			} else {
				System.out.println(step+"단계입니다.");
			}
			
		}
		public static void main(String[] args) {
			//Edustep에서 sys~~를 안했으므로 값을 받아서 print해 줘야 함..
			Scanner scan = new Scanner(System.in);
			
			System.out.print("스터디 단계를 입력하세요 : ");
			int number = scan.nextInt();
			Edustep(number);//EdU~~에서 print니까 바로 print해줌
	}

}
