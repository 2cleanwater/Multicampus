package algorithmProject2;

import java.util.Scanner;

public class Data {
	public static final int NO   = 1;	// ��ȣ�� �о� ���ϱ��?
	public static final int NAME = 2;	// �̸��� �о� ���ϱ��?

	private Integer no;					// ȸ����ȣ (Ű ��)
	private String  name;				// �̸�
	private Scanner stdIn;

	public Data(Scanner stdIn) {
		this.stdIn = stdIn;
	}
	// Ű ��
	Integer keyCode() {
		return no;
	}

	// ���ڿ��� ��ȯ�մϴ�.
	public String toString() {
		return name;
	}

	// �����͸� �Է��մϴ�.
	void scanData(String guide, int sw) {
		System.out.println(guide);

		if ((sw & NO) == NO) {
			System.out.print("��ǰ ��ȣ �Է£�");
			no = stdIn.nextInt();
		}
		if ((sw & NAME) == NAME) {
			System.out.print("��ǰ�� �Է£�");
			name = stdIn.next();
		}
	}
}