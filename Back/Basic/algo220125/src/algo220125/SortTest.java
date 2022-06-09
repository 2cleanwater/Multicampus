package algo220125;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortTest st = new SortTest();
		st.test1();
	}
	
	
	public void test1() {
		int[] numbers = {5,3,8,1,2,7};
		this.bubbleSort(numbers);
	}
	
	public void bubbleSort(int[] numbers) {
		
		//자기 옆의 원소와 비교하는 코드 작성
		for(int k=0;k<numbers.length;k++) {
			for(int i=0;i<numbers.length-1;i++) {
				if(numbers[i]>numbers[i+1]) {
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
				}	
			}
			System.out.println(Arrays.toString(numbers));
		}
		
		
	}

}
