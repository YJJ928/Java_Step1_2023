package chapter02;

public class Example01 {

	public static void main(String[] args) {
		
//		Q1 Soldesk 과수원
//		배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개이다
//		과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고, 시간당(24) 전체 과일의 평균 생산갯수를 출력하시오
//		(단, 평균값을 담는 데이터 타입은 float으로 정의한다)
		
		int pear = 5; // 변수 방 선언
		int apple = 7;
		int orange = 5;
		
		int total = (pear + apple + orange);
		float avgHr = ((pear + apple + orange) / 24f); //f붙여줘야
		// float avgD = ((pear + apple + orange) / 3f );

		System.out.println("Soldesk과수원에서 하루에 생산되는 총 과일의 갯수는 "+ total +" 개 이며, 시간 평균 "+ avgHr + " 개가 생산됩니다.");
		// System.out.println("Soldesk과수원에서 하루에 생산되는 총 과일의 갯수는 "+ total +" 개 이며, 하루 평균 "+ avgD + " 개가 생산됩니다.");
		System.out.println("===============");
		
		
//		Example02
//		원의 넓이를 구하시오(반지름*반지름*3.14)
//		/반지름 : 10, 3.14는 double로 정의하여 구하시오
//		반지름 변수방 num1 / 3.14 변수방 pi /넓이 변수방 result
		
		int num1 = 10;
		double pi = 3.14;
		double result = (num1*num1*pi);
		System.out.println("원의 넓이는 " + result + " cm2 입니다.");
		System.out.println("===============");
		//int => double 바꿀 때: Double.parseDouble
		//String => int 바꿀 때: Integer.parseInt
		
		int num2 = 10;
		int num3 = 3;
		int num4 = 14;
		double result2 = num2*num2*Double.parseDouble(num3+"."+num4);
		System.out.println(result2);
		
//		Example03
//		삼항연산자를 이용하여 score1이 60점 보다 크거나 같으면 합격 그렇지 않으면 불합격으로 반환 하시오
//		삼항연산자를 이용하여 score2가 90보다 크면 'A'이고 score가 80보다 크면 'B' 그 이하는 모두 'C'로 간주한다
		
		int score1, score2;
		
		score1 = 75; //임의로 작성
		score2 = 80; //임의로 작성
		
		String scoreA, scoreB;
		
		scoreA = ((score1 >= 60) ? "합격" : "불합격");
		
		scoreB = ((score2 > 90) ? "A" : (score2 > 80 && score2 <= 90) ? "B" : "C");
		
		System.out.println("score1은 "+ score1+" 점으로 " + scoreA + " 입니다.");
		System.out.println("score2는 "+ score2+" 점으로 " + scoreB + " 입니다.");
	
	}

}
