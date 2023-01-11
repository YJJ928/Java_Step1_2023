package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		int side;
		int height;
		int Area;
		
		side = Integer.parseInt(JOptionPane.showInputDialog("가로길이"));
		height = Integer.parseInt(JOptionPane.showInputDialog("세로길이"));
		
		Encapsulation ec = new Encapsulation();
		
		Area = ec.Cal_Area(side, height);
		System.out.println("사각형의 넓이: "+Area);
		JOptionPane.showMessageDialog(null, "사각형의 넓이: "+Area);
	}

}
