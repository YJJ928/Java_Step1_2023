package chapter06;

import javax.swing.JOptionPane;

public class SungJuk {
	
	//JVM 
	//필드 또는 멤버변수
	//private : class에서만 쓸 수 있다.
	private String std_num;
	private String std_name;
	private int java, oracle, spring;
	
	//디폴트 생성자(생략가능)
	
	//메서드
	public void Sum() {
		int total = java+oracle+spring; //지역변수
		System.out.println("총합: "+total);
	}
	
	public void Avg() {
		int avg = (java+oracle+spring)/3;
		System.out.println("평균: "+avg);
	}
	

	public static void main(String[] args) {
		
		SungJuk rec = new SungJuk(); // Sungjuk class안에 있는 모든 변수를 다 사용
		rec.std_num = JOptionPane.showInputDialog("학번");
		rec.std_name = JOptionPane.showInputDialog("이름");
		rec.java = Integer.parseInt(JOptionPane.showInputDialog("java점수"));
		rec.oracle = Integer.parseInt(JOptionPane.showInputDialog("oracle점수"));
		rec.spring = Integer.parseInt(JOptionPane.showInputDialog("spring점수"));
		
		System.out.println(rec.std_num+" | "+rec.std_name);
		rec.Sum();
		rec.Avg();
		
	}

}
