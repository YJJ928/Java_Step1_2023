package chapter03.IF.FOR;

public class ForTest17 {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			System.out.print("["+i+"단]"+"\t");				
			}
		System.out.println();
		for(int n = 1 ; n <= 9 ; n++) {
			for (int j = 2 ; j <= 9 ; j++) {
				System.out.print(j+"x"+n+"="+(n*j)+"\t");
			}System.out.println();
		}		

	}

}
