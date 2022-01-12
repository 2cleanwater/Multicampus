package p220111;

import java.util.Random;

public class YourRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		for(int i=65;i<65+26;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(new Random().nextInt(1000)+1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
