package algo220126;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibon(10));
	}
	
	public static int fibon(int number) {
	      // TODO Auto-generated method stub
	      if (number <= 1) {
	         return number;
	      }
	      int fib =1;
	      int prev =1;
	      
	      for(int i =2;i<number;++i ) {
	         int temp = fib;
	         fib += prev;
	         prev = temp;
	      }
	      return fib;
	   }

}
