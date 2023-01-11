package chapter04;

import javax.swing.JOptionPane;

public class TwoDemension02 {

	public static void main(String[] args) {
		
		int JavaScore[][] = new int[2][3];
		int i, j;
		for(i = 0 ; i < JavaScore.length ; i++) {
			for(j = 0 ; j < JavaScore[i].length ; j++) {
				JavaScore[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Javascore"));
				System.out.print(JavaScore[i][j]+" \t");
			}
			System.out.println();
		}

	}

}
