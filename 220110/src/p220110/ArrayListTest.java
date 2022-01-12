package p220110;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListTest at = new ArrayListTest();
		at.test1();
	}
	
	public void test1() {
		System.out.println("ArrayList test");
		//어레이리스트의 인스턴스를 만드세요.
		ArrayList list = new ArrayList();
		list.add(new Integer(10));
		//list.add(new valueOf(10));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		//list.add("four");
		// 다른 타입인 string을 넣어도 에러가 나지 않는다. 
		// 하지만 출력할 때 타입이 통일되지 않아 어려움이 있다.
		int size = list.size();
		System.out.printf("size = %d %n",size);
		// 조회
		Integer num = (Integer)list.get(0); // 다향성 2코드
		int number = num.intValue();
		System.out.println(number);	
		//전체 조회
		this.print(list);
		//수정
		list.set(0,new Integer(1));
		this.print(list);
		//삭제
		Integer delNumber = (Integer)list.remove(2);
		System.out.printf("삭제된 오브젝트 넘버는 = %d \n",delNumber);
		this.print(list);
		
		// 중간에 값 추가하기
		//list.add(넣을 위치, 새로운 값 추가)
		
	}
	
	public void print(ArrayList list) {
		for(int i = 0;i<list.size();i++) {
			Integer temp = (Integer)list.get(i);
			System.out.printf("the value is %d %n",temp.intValue());
		}
	}

}
