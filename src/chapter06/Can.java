package chapter06;

public class Can {
	
	//필드
	private String canName;
	private int price;
	
	//생성자 오버로딩
	public Can(String canName, int price) { //set
		this.canName = canName;
		this.price = price;
	}

	public String getCanName() { //get만 -> 밖에서 값만 받겠다.
		return canName;
	}

	public int getPrice() { //get만 -> 밖에서 값만 받겠다.
		return price;
	}


}
