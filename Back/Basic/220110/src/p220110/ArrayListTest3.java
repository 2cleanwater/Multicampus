package p220110;

import java.util.ArrayList;

//AutoBoxing, AutoUnboxing
public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test1() 호출하는 코드 작성
		ArrayListTest3 at = new ArrayListTest3();
		at.test1();
	}
	
	public void test1() {
		System.out.println("ArrayList test!");
		//ArrayList 인스턴스 생성하시오
		ArrayList<Integer> list = new ArrayList<Integer>();
		//create (생성)
		list.add(10); //AutoBoxing
		list.add(2);
		list.add(3);
		//list.add(new String("four"));
		int size = list.size();
		System.out.printf("size = %d %n", size);
		//조회
		int number = list.get(0); //AutoUnboxing

		System.out.println(number);
		//전체조회
		this.print(list);
		//수정
		list.set(0, 1);
		this.print(list);
		//삭제
		int delNumber = list.remove(2);
		System.out.printf("delete Object number = %d %n",delNumber);
		this.print(list);
	}
	
	public void print(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			int temp = list.get(i);
			System.out.printf("the value is %d %n", temp);
		}
		System.out.println();
	}

}
