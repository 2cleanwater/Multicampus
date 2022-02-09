package algo220126;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void test1() {
		
	}
	
	public void qSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(left+right)/2];		
		while(pl<=pr) {
			while(a[pl]<x) {
				pl++;
			}
			
			while(a[pr]>x) {
				pr--;
			}
			
			if(pl<=pr) {
				this.swap(a,pl++,pr--);
			}
		}
		System.out.println(Arrays.toString(a));
		if(left<pr) {
			qSort(a, left, pr);
		}
		if(pl<right) {
			qSort(a, pl, right);
		}
	}
	private void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		//교환로직 작성하세요
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
