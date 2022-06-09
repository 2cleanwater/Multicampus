package my.com.common.code;


//������ ��Ʈ ��ť��Ƽ �� + OAuth2 ������ �����ϴ� ���� �⺻ �Ӽ���

//  enum ������ ������� ����  / class�� ���� �����ȴ�.  
public enum MemberGrade {
	//ME00�� ������ C�̰� ���尡���� 1�� ��� ��������.
	
	// ME00("C", 1)  
	//-> public static final MemberGrade ME00 = new MemberGrade("C",1);
	
	
	//ȸ���� ���	
	ME00("C", "user", 1), 
	ME01("B", "user", 2),
	ME02("A", "user", 3),
	ME03("VIP",  "user", 4),
	
	//������ ��� 
	AD00("super",  "admin", 9999), //���� ������.   
	AD01("member", "admin", 9999), // ȸ�� ������.  
	AD02("board",  "admin", 9999); //�Խ��� ������.  
	
	public final String DESC;
	public final String ROLE;
	public final int EXTENDABLE_CNT;
	
	private MemberGrade(String desc, String role, int extendableCnt) {
		this.DESC = desc;
		this.ROLE = role;
		this.EXTENDABLE_CNT = extendableCnt;
	}	
}
