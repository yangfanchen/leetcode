package recursion;

import java.util.Arrays;


public class binaryNumber {
	static int [] A = new int[2];
	public static void main(String[] args) {
		Binary(2);
	}
	
	static void Binary(int n) {
		if(n < 1) {
			System.out.println(A[0]+"\t"+A[1]);
		}
		else {
			A[n-1] = 0;
			Binary(n-1);
			A[n-1] = 1;
			Binary(n-1);
		}
	}

}
