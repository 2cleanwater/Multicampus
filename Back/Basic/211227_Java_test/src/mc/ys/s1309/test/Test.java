package mc.ys.s1309.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i <= 10;i++) {
		if (i%3==0)
		continue;
		System.out.println(i);
		sum += i;
		}
		System.out.println(sum);
	}
}
