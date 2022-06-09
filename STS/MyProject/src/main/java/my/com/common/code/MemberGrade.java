package my.com.common.code;


public enum MemberGrade {
	
	ME00("C", "user", 1),
	ME01("B", "user", 2),
	ME02("A", "user", 3),
	ME03("VIP",  "user", 4),
	
	AD00("super",  "admin", 9999), 
	AD01("member", "admin", 9999), 
	AD02("board",  "admin", 9999); 
	
	public final String DESC;
	public final String ROLE;
	public final int EXTENDABLE_CNT;
	
	private MemberGrade(String desc, String role, int extendableCnt) {
		this.DESC = desc;
		this.ROLE = role;
		this.EXTENDABLE_CNT = extendableCnt;
	}	
}
