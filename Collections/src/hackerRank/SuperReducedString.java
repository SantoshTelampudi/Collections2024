package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'superReducedString' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String superReducedString(String s) {

		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		String s1 = "";
		int i = 0;
		while (i < ch.length) {
			try {
				if (ch[i] == ch[i + 1]) {
					// i++;
					i = i + 2;
					continue;
				} else {

					s1 = s1 + ch[i];

					i++;
				}
			} catch (Exception e) {
				if (i == ch.length - 1) {
					s1 = s1 + ch[i];
					i++;
				}
			}
		}
		if (s1.isEmpty()) {
			s1 = "Empty String";
		} else {
			System.out.println(s1);
		}
		return s1;
	}

}

public class SuperReducedString {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String s1 = Result.superReducedString(s);
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String result = Result.superReducedString(s);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
	}
}
