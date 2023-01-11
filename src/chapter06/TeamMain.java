package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup tg = new TeamGroup();
		TeamMember tm = new TeamMember();
		
		tm.setTeamName("Team Hub");
		System.out.println("팀명: "+tm.getTeamName());
		System.out.println("-----------");
		System.out.println("[팀원 명단]");
		tg.init();
		tg.Disp();

		tm.setmName("허초회");
		tm.setsName("윤영훈");
		tm.setmPhone("010-0000-0000");
		
		System.out.println("[임원정보]");
		System.out.println("팀장 : "+tm.getmName());
		System.out.println("부팀장 : "+tm.getsName());
		System.out.println("팀장전화번호 : "+tm.getmPhone());
		
	}

}
