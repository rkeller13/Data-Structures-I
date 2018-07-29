package group1;

import stdlib.StdOut;

public class RuntimeTest {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = i; j < 6; j++) {
				count++;
			}
		}
		StdOut.print(count);
		
	}

}
