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

class Result1 {

	public static int camelcase(String s) {
		int count = 0;
		// Write your code here
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

				if (Character.isUpperCase(ch)) {
					count++;
				}
			}
		return count;
	}
}

public class camelCase {
	public static void main(String[] args) throws IOException {
		String s = "Hello World";
		int c = Result1.camelcase(s);
		System.out.println(c);
	}
}
