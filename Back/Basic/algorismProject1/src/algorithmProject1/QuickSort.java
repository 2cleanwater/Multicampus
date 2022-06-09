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
				//�� ������ ���� ������ ���� �� while���� ���� �ʼ������� ������ �ϱ� ����
				this.swap(ar,pl++, pr--);
				// �� ���ڸ� �ٲ� �� ���� �ε��� ���� ����
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
		System.out.println("\n���� ������ ����");
		for(int i = 0;i<scores.length;i++) {
			System.out.printf("%d�� : %d\n",i+1,scores[scores.length-1-i]);
		}
		
	}
	
	public int[] inputScore(BufferedReader br) throws IOException {
		System.out.print("�л� �� �Է� : ");
		String input = br.readLine();
		int stu_num = Integer.valueOf(input);
		int [] scores = new int[stu_num];
		for(int i=0;i<stu_num;i++) {
			System.out.printf("�л� %d ���� �Է� : ",i+1);
			scores[i] = Integer.valueOf(br.readLine());
		}
		br.close();
		return scores;
	}

}
