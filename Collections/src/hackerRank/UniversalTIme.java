package hackerRank;

import java.util.Scanner;

public class UniversalTIme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		String s = solutionUniversalTime.timeConversion(time);
		System.out.println(s);
	}

}

class solutionUniversalTime {
	public static String timeConversion(String s) {
		String[] parts = s.split(":");
		int hours = Integer.parseInt(parts[0]);
		int min = Integer.parseInt(parts[1]);
		int seconds = Integer.parseInt(parts[2].substring(0, 2));

		if (s.endsWith("PM") && hours <= 11) {
			hours = hours + 12;
			s = String.format("%02d:%02d:%02d", hours, min, seconds);
			return s;
		} else if (s.endsWith("AM") && hours > 11) {
			hours = 0;
			s = String.format("%02d:%02d:%02d", hours, min, seconds);
			return s;
		} else {
			s = String.format("%02d:%02d:%02d", hours, min, seconds);
			return s;
		}

	}
}