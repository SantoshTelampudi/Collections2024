package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int maxinputs = sc.nextInt();
		List<Integer> scores = new ArrayList<>();
		for (int i = 0; i < maxinputs; i++) {
			scores.add(sc.nextInt());
		}
		// System.out.println(scores);
		List<Integer> output = SolutionforBreaking.breakingRecords(scores);
		System.out.println(output.get(0) + " " + output.get(1));
	}

}

class SolutionforBreaking {

	public static List<Integer> breakingRecords(List<Integer> scores) {

		int count1 = scores.get(0);
		int count2 = scores.get(0);
		int maxcount = 0;
		int mincount = 0;
		List<Integer> output = new ArrayList<>();
		for (int i = 1; i < scores.size(); i++) {
			if (count1 < scores.get(i)) {
				maxcount++;
				count1 = scores.get(i);
			}
		}
		for (int i = 1; i < scores.size(); i++) {
			if (count2 > scores.get(i)) {
				mincount++;
				count2 = scores.get(i);
			}
		}
		output.add(maxcount);
		output.add(mincount);
		return output;
	}
}