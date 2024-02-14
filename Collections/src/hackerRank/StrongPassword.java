package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int maxinputs = sc.nextInt();
		String input = sc.next();
		int s = Result7.minimumNumber(maxinputs, input);
		System.out.println(s);
	}

}

class Result7 {

	/*
	 * Complete the 'minimumNumber' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. STRING password
	 */

	public static int minimumNumber(int n, String password) {
		List<String> regs = new ArrayList<>();
		regs.add("[a-z]");
		regs.add("[A-Z]");
		regs.add("[0-9]");
		regs.add("[!@#$%^&*()\\-+]");

		int req = 0;

		for (String r : regs) {
			if (!password.matches(".*" + r + ".*")) {
				req++;
			}
		}

		if (n >= 6 || n + req >= 6) {
			return req;
		}

		return 6 - n;

	}

	// Return the minimum number of characters to make the password strong

}
