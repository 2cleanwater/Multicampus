package my.com.common.code;

public enum ErrorCode {
	DATABASE_ACCESS_ERROR("�����ͺ��̽��� ��� �� ������ �߻�"), 
	VALIDATOR_FAIL_ERROR("�������� ����� ������."),
	MAIL_SEND_FAIL_ERROR("�̸��� �߼� �� ����."), 
	HTTP_CONNECT_ERROR("HTTP ��� �� ����."),
	AUTHENTICATION_FAILED_ERROR("��ȿ���� ���� ����."), 
	UNAUTHORIZED_PAGE_ERROR("���� ������ ���� ������."),
	FAILED_FILE_UPLOAD_ERROR("���Ͼ��ε忡 ����."), 
	REDIRECT("");
	

	public final String MESSAGE;
	public String URL;

	private ErrorCode(String msg) {
		this.MESSAGE = msg;
		this.URL = "/";
	}

	private ErrorCode(String msg, String url) {
		this.MESSAGE = msg;
		this.URL = url;
	}

	public ErrorCode setURL(String uRL) {
		URL = uRL;
		return this;
	}
}
