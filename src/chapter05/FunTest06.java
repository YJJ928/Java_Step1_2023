package chapter05;

public class FunTest06 {
	
	public String channel;
	public int chaanelInt;
	public int volume; // heap 메모리 사용한다. class....
	
	//생성자 생략
//	public FunTest06() {
//		
//	}
	
	// void 외에 모든 타입의 메소드는 반드시 return값을 만든다!
	public int channelUp(int volume) {//void대신 int 넣었다. 에러난다. return 필요
		this.volume = volume; //this.volume은 heap메모리.. 
		// stack 메모리에 있는 메모리를 heap메모리에 올려주는것
		System.out.println("소리를 높이겠습니다.");
		return volume+2; // stack memory 사용한다.
	}
	
//	public void channelUp(int volume) {//void대신 int 넣었다. 에러난다. return 필요
//		this.volume = volume; //this.volume은 heap메모리.. 
//		// stack 메모리에 있는 메모리를 heap메모리에 올려주는것
//		System.out.println("소리를 내리겠습니다.");
//		return volume+2; // void는 return 작성하면 에러
//	}
	

	public static void main(String[] args) {
		
		//방법 1
		//System.out.println("소리를 "+pp.channelUp(5)+"만큼 올립니다.");
		
		
		FunTest06 pp = new FunTest06();
		int volume = pp.channelUp(5);
		System.out.println("소리를 "+volume+"만큼 올립니다.");
		System.out.println(pp.channelUp(3));
		
	}

}
