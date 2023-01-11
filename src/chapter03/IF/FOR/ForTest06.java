package chapter03.IF.FOR;

public class ForTest06 {

	public static void main(String[] args) {
		
		int i; //4 byte
		char a = 'A'; //ASCII CODE: 65 // 2byte
		
//		i=a; //a=i는 불가능, 큰걸 작은거에 할당 못함. 강제로 형변환 하여야 함...
		//String -> char : charAt(0)
		//
		
		for(i = a ; i <= 'Z'; i++) {
			System.out.printf("%c ", i); //"출력 서식",출력할 내용, 줄바꿈을 하려면 지시자 '%n'을 넣어
		}
		
	}

}
