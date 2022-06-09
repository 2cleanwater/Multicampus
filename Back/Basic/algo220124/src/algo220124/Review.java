package algo220124;

import java.util.Random;


public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Review rv = new Review();
		int []a = {5,3,4,1,2};
		rv.sort(a);
	}
	
	public void sum(int a, int b) {
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}
		int total = 0;
		for(int i = a;i<=b;i++) {
			total += i;
		}
		System.out.println(total);
	}

	public void shuffle() {
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		Random rn = new Random();
		for(int i = 0;i<10;i++) {
			int rnumber = rn.nextInt(10);
			int temp = numbers[i];
			numbers[i] = numbers[rnumber];
			numbers[rnumber] = temp;
		}
		for(int i:numbers) {
			System.out.print(i+" ");
		}
		
	}
	
	public void sort(int[] numbers) {
		for(int i = 0;i<numbers.length;i++) {
			for(int j = i+1;j<numbers.length;j++) {
				if(numbers[i]>numbers[j]) {
					int temp = numbers[i];
					numbers[i]=numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for(int i:numbers) {
			System.out.print(i+" ");
		}
	}
	
	public void makeCardV1() {
		int[] spade = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] heart = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] diamond = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] clover = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		int[][] card = {spade,heart,diamond,clover};
		
		int size1 = card.length;
		int size2 = card[0].length;
		System.out.printf("size1 is %d, size2 is %d %n", size1,size2);
		
		int[] oneOfCard = card[0];
		System.out.println(oneOfCard);
		
	}
}
