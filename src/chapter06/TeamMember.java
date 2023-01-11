package chapter06;

public class TeamMember {
	
	//멤버변수
	public String teamName; //팀명 // public은 생략이 가능함
	public String mName; //팀장명
	public String sName; //부팀장명
	public String mPhone; //팀장폰
	public String name; //팀원명
	public String gender; //성별
	
	public TeamMember() {} // 디폹 생성자
			
	public TeamMember(String name, String gender) {
		this.name = name;
		this.gender = gender;				
	} //생성자 오버로딩(초기화-변수방에 값을 넣는다//위해서..)

	//메소드 통한 초기화
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}
