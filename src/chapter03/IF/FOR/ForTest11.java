package chapter03.IF.FOR;

public class ForTest11 {

	public static void main(String[] args) {
		
		int i, j;
		for(i = 1; i <= 5 ; i++) {
			for(j = 1; j <= i ; j++) {
				System.out.print(i + "," + j+" / ");
			}//안 for
		}//밖 for

	}

}
