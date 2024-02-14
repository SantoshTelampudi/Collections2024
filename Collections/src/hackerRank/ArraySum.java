package hackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxinputs = sc.nextInt();
		Integer[] input = new Integer[maxinputs];
		for (int i = 0; i < maxinputs; i++) {
			input[i] = sc.nextInt();
		}
		List<Integer> n = Arrays.asList(input);
		int result = Result3.simpleArraySum(n);
	}

}

class Result3 {

	/*
	 * Complete the 'simpleArraySum' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY ar as parameter.
	 */

	public static int simpleArraySum(List<Integer> ar) {

		int s = 0;
		for (Integer l : ar) {
			s = s + l;
		}
		return s;
		// Write your code here

	}

}