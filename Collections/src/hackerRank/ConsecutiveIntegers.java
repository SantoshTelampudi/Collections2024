package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConsecutiveIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String maxinputs = sc.next();
		int k = Solutionforabove.solution(n, maxinputs);
	}

}

class Solutionforabove {

	public static int solution(int n, String s) {

		char[] s1 = s.toCharArray();
		int[] output;
		List<String> output1 = new ArrayList<>();
		int count2 = 1;
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			String k = "";
			if (count2 <= (s.length() + 1 - n)) {
				for (int j = i; j < s.length(); j++) {
					if (count < n) {
						k = k + "" + s1[j];
						count++;
					}
				}
				output1.add(k);
				System.out.println(output1);
			}
			count2++;
		}
		Collections.sort(output1);
		System.out.println(output1.get(s.length() - n));
		return 0;

	}

}
