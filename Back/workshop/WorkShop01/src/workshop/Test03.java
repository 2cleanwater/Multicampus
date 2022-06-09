package workshop;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2 = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		int sum = 0;
		int count = 0;
		for(int k=0;k<arr2.length;k++) {
			for(int i=0;i<arr2[k].length;i++) {
				sum = sum + arr2[k][i];
				count++;
			}
		}
		double avg = sum / (count+0.0);
		System.out.println("total="+sum);
		System.out.println("average="+avg);
	}

}
