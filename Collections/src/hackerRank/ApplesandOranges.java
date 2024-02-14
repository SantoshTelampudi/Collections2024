package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplesandOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 7;
		int t = 11;
		int a = 5;
		int b = 15;
		Integer[] apple = { -2, 2, 1 };
		Integer[] orange = { 5, -6 };
		List<Integer> apples = Arrays.asList(apple);
		List<Integer> oranges = Arrays.asList(orange);
		SolutionApplesandOranges.countApplesAndOranges(s, t, a, b, apples, oranges);

	}

}

class SolutionApplesandOranges {

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		int p = 0;
		int countapples = 0;
		int countoranges = 0;
		List<Integer> i = new ArrayList<>();
		List<Integer> j = new ArrayList<>();
		for (Integer e : apples) {
			p = 0;
			p = a + p + e;
			i.add(p);
		}
		for (Integer e : oranges) {
			p = 0;
			p = b + p + e;
			j.add(p);
		}
		for (Integer i1 : i) {
			if ((i1 >= s) && (i1 <= t)) {
				countapples++;
			}
		}
		for (Integer i1 : j) {
			if ((i1 >= s) && (i1 <= t)) {
				countoranges++;
			}
		}
		System.out.println(countapples + " " + countoranges);
	}

}