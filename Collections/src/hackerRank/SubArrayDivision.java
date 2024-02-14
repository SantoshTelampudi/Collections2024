package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArrayDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int maxinputs = sc.nextInt();
		List<Integer> scores = new ArrayList<>();
		for (int i = 0; i < maxinputs; i++) {
			scores.add(sc.nextInt());
		}
		int d = sc.nextInt();
		int m = sc.nextInt();
		int output = SolutionSubArrayDivision.solution(scores, d, m);
		System.out.println(output);
	}

}

class SolutionSubArrayDivision {

	public static int solution(List<Integer> s, int d, int m) {
		int output = 0;
		if (s.get(0) == d) {
			return 1;
		} else {
			try {
				for (int i = 0; i < s.size() - 1; i++) {
					int k = 0;
					for (int j = 0; j < m; j++) {
						System.out.println(s.get(i + j));
						k = k + s.get(i + j);
					}
					if (k == d) {
						System.out.println("equal loop" + k);
						output++;
					}
				}
			} catch (Exception e) {

			}
		}
		return output;

	}
}