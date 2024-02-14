package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixsnakeOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int nrows = sc.nextInt();
		int mcolumns = sc.nextInt();
		for (int i = 0; i < nrows; i++) {
			List<String> row = new ArrayList<>();
			for (int j = 0; j < mcolumns; j++) {
				String element = sc.next();
				row.add(element);
			}
			arr.add(row);
		}
		solutionsnakeOperation.solution(nrows, mcolumns, arr);
	}

}

class solutionsnakeOperation {

	public static void solution(int n, int m, List<List<String>> s) {
		int p = m-1;
		for (int i = m - 1; i >= 0; i--) {
			if (p % 2 != 0) {
				for (int j = n - 1; j >= 0; j--) {
					System.out.print(s.get(j).get(i));
					// System.out.println("im in if");
				}
			} else {
				for (int j = 0; j <= n - 1; j++) {
					System.out.print(s.get(j).get(i));
					// System.out.println("im in else");
				}
			}
			p--;
			// System.out.println(i);
		}

	}
}
