package hackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompareTriplets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int maxinputsa = sc.nextInt();
		int maxinputsb = sc.nextInt();
		Integer[] inputa = new Integer[maxinputsa];
		Integer[] inputb = new Integer[maxinputsa];
		for (int i = 0; i < maxinputsa; i++) {
			inputa[i] = sc.nextInt();
		}
		for (int i = 0; i < maxinputsb; i++) {
			inputb[i] = sc.nextInt();
		}

		List<Integer> a = Arrays.asList(inputa);
		List<Integer> b = Arrays.asList(inputb);
		List<Integer> c = Result4.compareTriplets(a,b);
		System.out.println(c);
	}

}

class Result4 {

	/*
	 * Complete the 'compareTriplets' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		
		int count1=0;
		int count2=0;
		
		for(int i=0;i<a.size();i++) {
			if(a.get(i)>b.get(i)) {
				count1++;
			}
			else if(a.get(i)==b.get(i)){
				continue;
			}
			else {
				count2++;
			}
		}
		List<Integer> c = Arrays.asList(count1,count2);
		return c;
  
	}

}
