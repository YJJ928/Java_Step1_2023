package chapter03.IF.SWITCH;

public class SwitchCase01 {
	
	public static void main(String[] args) {
		
		int ranking = 1;
		char medalColor ;
		
		switch (ranking) { //조건
		case 1: 
			medalColor = 'G';//조건(ranking)의 값만 써줌			
			break; //ranking이라는 조건이 case 다음 문에 부합하면 break한다
			//break를 걸지 않으면 아래 case까지 읽어버린다(break없을 때 까지)
		case 2: 
			medalColor = 'S';			
			break;
		case 3: 
			medalColor = 'B';			
			break;
		default: //나머지 다
			medalColor = 'A';	
			break; //default는 break 안 써도 됨
		} //switch
		
		System.out.println(ranking + "등 메달은 "+ medalColor+"입니다.");
		
	}

}
