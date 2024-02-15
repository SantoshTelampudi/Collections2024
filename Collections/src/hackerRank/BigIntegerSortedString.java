package hackerRank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BigIntegerSortedString {

	public static void main(String[] args) {
		//new changes added
		Scanner sc = new Scanner(System.in);
		int maxinputs = sc.nextInt();
		List<String> scores = new ArrayList<>();
		for (int i = 0; i < maxinputs; i++) {
			scores.add(sc.next());
		}
		System.out.println(SolutionBigIntegerSortedString.bigSorting(scores));
//new changes added
	}

}

class SolutionBigIntegerSortedString {

	public static List<String> bigSorting(List<String> unsorted) {
		
		unsorted.sort((o1, o2) -> {
			if (o1.length() == o2.length()) {
				return new BigInteger(o1).compareTo(new BigInteger(o2));
			}
			return o1.length() - o2.length();
		});
		return unsorted;

		List<BigInteger> number = new ArrayList<>();
		List<String> s1 = new ArrayList<>();
     	// Collections.sort(unsorted);
		for (String s : unsorted) {
			BigInteger b = new BigInteger(s);
			s1.add(""+b);
		}
		Collections.sort(number);
		Collections.reverse(number);
		return s1;
	}

}
