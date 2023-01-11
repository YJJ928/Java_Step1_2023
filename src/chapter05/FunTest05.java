package chapter05;

public class FunTest05 {
	
	public String channel; // 멤버변수
	public int channelInt;
	public int volume;
	
	public FunTest05() {
		//이것이 들어가 있다! 생략가능하다.
	}
	
	public FunTest05(int volume) {
		//마찬가지로 생략 가능
	}
	
	public void channelUp(int volume) {
		System.out.println("소리를 "+volume+" 만큼 올립니다.");
	}
	
	public void channelDown(int volume) {
		System.out.println("소리를 "+volume+" 만큼 내립니다.");
	}
	
	//오버로딩(다형성 만족) -> 메소드명 같고 매개변수 다른것
	public void channelChange(String channel) {
		System.out.println("채널을 "+channel+" 로 바꿉니다.");
	}
	
	public void channelChange(int channelInt) {//메소드 명이 다 달라야 함!but 매개변수 다르면 가능!
		System.out.println("채널을 "+channelInt+" 번으로 바꿉니다.");
	}
// ===================================================================
	public static void main(String[] args) {
		
		FunTest05 ft = new FunTest05();
		ft.channelUp(3);
		ft.channelDown(2);
		ft.channelChange(3);
		ft.channelChange("KBS");
		

	}

}
