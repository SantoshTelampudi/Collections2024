package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DiagnolDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int maxinputs = sc.nextInt();
		for (int i = 0; i < maxinputs; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < maxinputs; j++) {
				int element = sc.nextInt();
				row.add(element);
			}
			arr.add(row);
		}
		//System.out.println(arr.size());

		int result = Result5.diagonalDifference(arr);
	}

}

class Result5 {

	/*
	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static int diagonalDifference(List<List<Integer>> arr) {

		int result1 = 0;
		int result2 = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j) {
					result1 = result1 + (arr.get(i).get(j));
				}
			}
		}
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				if ((i+j) ==(arr.size()-1)) {
					result2 = result2 + (arr.get(i).get(j));
				}
			}
		}
		System.out.println(result1-result2);
		return Math.abs(result1-result2);

	}

}