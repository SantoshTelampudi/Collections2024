package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int maxinputs = sc.nextInt();
		Integer[] input = new Integer[maxinputs];
		for (int i = 0; i < maxinputs; i++) {
			input[i] = sc.nextInt();
		}
       List<Integer> s = Arrays.asList(input);
       Result8.miniMaxSum(s);
	}

}
class Result8 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    	Collections.sort(arr);
    	long min=0;
    	long max=0;
    	for(int i=0;i<arr.size()-1;i++) {
    		min=(min+arr.get(i));
    	}
        for(int j=1;j<arr.size();j++) {
        	max=max+arr.get(j);
        }
        System.out.println(min);
        System.out.println(max);
    }
}