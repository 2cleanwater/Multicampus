package algorithmProject2;

import java.util.Scanner;

public class TreeMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMain tm = new TreeMain();
		tm.startOfDataManagement();
	}
	
	public void startOfDataManagement() {
		BinTree<Integer, Data> tree = new BinTree<Integer, Data>();
		Data data;								
		Data ptr;								
		
		String menu = "(1) ��ǰ ��� (2) ��ǰ ���� (3) ��ǰ �˻� (4) ��ü��ǰ ��ȸ (5) ����";
		Scanner scan = new Scanner(System.in);
		Data temp = new Data(scan);	
		boolean flag = false;
		while(!flag) {
			System.out.println(menu);
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();
			
			switch(choice) {
				case 1:
					data = new Data(scan);
			 		data.scanData("��ǰ ���", Data.NO | Data.NAME);
			 		tree.add(data.keyCode(), data);
					break;
				case 2:
					temp.scanData("��ǰ ����", Data.NO);
			 		tree.remove(temp.keyCode());
					System.out.println("��ǰ ���� �Ϸ�");
					break;
				case 3:
					temp.scanData("��ǰ �˻�", Data.NO);
			 		ptr = tree.search(temp.keyCode());
			 		if (ptr != null)
						System.out.println("��ǰ�� : " + ptr);
					else
			 			System.out.println("�ش� �����Ͱ� �����ϴ�.");
					break;
				case 4:
					tree.print();
					break;
				case 5:
					System.out.println("�����մϴ�.");
					flag = true;		
			}
		}
		scan.close();
	}

}