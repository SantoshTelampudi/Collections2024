package hackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class getthecountofMaxvaluesBirthDayCake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int maxinputs = sc.nextInt();
		Integer[] input = new Integer[maxinputs];
		for (int i = 0; i < maxinputs; i++) {
			input[i] = sc.nextInt();
		}
		List<Integer> s = Arrays.asList(input);
		int value = SolutionforMaxValue.birthdayCakeCandles(s);

	}

	class SolutionforMaxValue {

		/*
		 * Complete the 'birthdayCakeCandles' function below.
		 *
		 * The function is expected to return an INTEGER. The function accepts
		 * INTEGER_ARRAY candles as parameter.
		 */

		public static int birthdayCakeCandles(List<Integer> candles) {
			// Write your code here
			int max = Collections.max(candles);
			int count = 0;
			for (Integer e : candles) {
				if (e == max) {
					count++;
				}
			}
			return count;
		}

	}

}
