package chapter05;

import javax.swing.JOptionPane;

public class FunTest04 {
	
	public static void Disp(String B[]) {
		String res = "";
		
		for(int i = 0 ; i < B.length ; i++) {
			res += B[i]+" ";
		}
		
		System.out.print(res+" ");
		
//		for(String str : A) {
//			res += str +" ";
//		}
//		System.out.print(res+" ");
//		JOptionPane.showMessageDialog(null, "배열의 원소값\n"+res);
//		 //메세지 창 띄워줌..
		
	}

	public static void main(String[] args) {
		
		String str[] = {"Java", "Oracle", "Jsp", "Html5, Css, Js, Jq", "SprintBoot", "PythonCamp"};
					
		Disp(str);		

	}

}
