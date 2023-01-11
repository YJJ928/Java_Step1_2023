package chapter03.IF.FOR;

public class ForTest13 {

	public static void main(String[] args) {
		//구구단
		
		for(int i = 2 ; i < 10 ; i++) {
			for(int j = 1 ; j < 10 ; j++) { // i = 2 , j = 1~9 ,... 반복
				System.out.println(i + " x "+ j +" = "+(i*j));
			}
			System.out.println("------------");
		}

	}

}
