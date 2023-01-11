package chapter06;

import java.util.Random;

public class Start {
	
	//private int random = Math.random()*50+1;
	private int random = new Random().nextInt(50)+1;
	private int count = 0;
	private String result = "FAIL";
	//success 면 break;
	
	public String check(int mynumber) {
		count++;		
		if(mynumber > random) {
			System.out.println("DOWN");
		} else if(mynumber < random) {
			System.out.println("UP");
		} else {
			result = "SUCCESS";
			System.out.println(count+"회 만에 정답");
		}
		return result; 
			
	}
	
}
