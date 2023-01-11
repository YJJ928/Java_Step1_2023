package chapter06;

public class TeamGroup {
	
	private TeamMember team[] = new TeamMember[6]; //멤버변수(배열 -> 팀구성원)
	
	//초기화 메소드
	public void init() {
		team[0] = new TeamMember("허초회", "남성");
		team[1] = new TeamMember("윤영훈", "남성");
		team[2] = new TeamMember("전솔민", "남성");
		team[3] = new TeamMember("이재민", "남성");
		team[4] = new TeamMember("김찬희", "남성");
		team[5] = new TeamMember("장여주", "여성");		
	} 
	
	//출력 메소드
	public void Disp() {
		for(int i = 0 ; i < team.length ; i++) {
			System.out.println("팀원명: "+team[i].getName()+", 성별: "+team[i].getGender());
		}
	}
}
