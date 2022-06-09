package algorithmProject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		QuickSort qs = new QuickSort();
		try {
			int[] scores = qs.inputScore(br);
			qs.rank(scores);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Qsort(int[] ar, int left, int right) {
		int pl = left;
		int pr = right;
		int pivot = (left+right)/2;
		while(pl<=pr) {
			while(ar[pl]<ar[pivot]) {
				pl++;
			}
			while(ar[pivot]<ar[pr]) {
				pr--;
			}
			if(pl<=pr) {
				//이 조건을 걸지 않으면 위에 두 while문을 돌고 필수적으로 스왑을 하기 때문
				this.swap(ar,pl++, pr--);
				// 두 숫자를 바꾼 후 다음 인덱스 값을 변경
			}
		}
		if(left<pr) {
			Qsort(ar, left, pr);
		}
		if(pl<right) {
			Qsort(ar, pl, right);
		}	
	}
	
	public void swap(int[] ar, int a, int b) {
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b] = temp; 
	}
	
	public void rank(int[] scores) {
		this.Qsort(scores, 0, scores.length-1);
		System.out.println("\n성적 순으로 정렬");
		for(int i = 0;i<scores.length;i++) {
			System.out.printf("%d등 : %d\n",i+1,scores[scores.length-1-i]);
		}
		
	}
	
	public int[] inputScore(BufferedReader br) throws IOException {
		System.out.print("학생 수 입력 : ");
		String input = br.readLine();
		int stu_num = Integer.valueOf(input);
		int [] scores = new int[stu_num];
		for(int i=0;i<stu_num;i++) {
			System.out.printf("학생 %d 점수 입력 : ",i+1);
			scores[i] = Integer.valueOf(br.readLine());
		}
		br.close();
		return scores;
	}

}
