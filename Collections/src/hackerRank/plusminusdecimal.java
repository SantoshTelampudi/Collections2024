package hackerRank;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class plusminusdecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int maxinputs = sc.nextInt();
		Integer[] input = new Integer[maxinputs];
		for (int i = 0; i < maxinputs; i++) {
			input[i] = sc.nextInt();
		}
		List<Integer> inp = Arrays.asList(input);
		Result6.plusMinus(inp);

	}

}
class Result6 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    	
    	double count1=0;
    	double count2=0;
    	double count3=0;
    	for(Integer i : arr) {
    		if(i.intValue()>0) {
    			count1++;
    		}
    		else if(i.intValue()==0) {
    			count2++;
    		}
    		else {
    			count3++;
    		}
    	}
    	double size = (double) arr.size();
    	System.out.println(arr.size());
    	System.out.printf("%.6f\n",(count1/size));
    	System.out.printf("%.6f\n",(count2/size));
    	System.out.printf("%.6f",(count3/size));

    }

}
