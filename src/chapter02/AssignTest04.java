package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		// 
		System.out.println("===전위연산===");
		int gameScore = 150;
		//int lastScore = gameScore + 1;
		int lastScore = ++gameScore; //더한 후 대입
		System.out.println(lastScore);
		System.out.println(gameScore);
		
		//int preScore = gameScore - 1;
		int preScore = --gameScore;
		System.out.println(preScore);
		System.out.println(gameScore);
		
		System.out.println("===후위연산===");
		int gameScore1 = 150;
		int lastScore1 = gameScore1++; //더하기 전 대입
		System.out.println(lastScore1);
		System.out.println(gameScore1);
		
		int preScore1 = gameScore1--;
		System.out.println(preScore1);
		System.out.println(gameScore1);

	}

}
