package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer maxinputs = sc.nextInt();
		Integer[] input = new Integer[maxinputs];
		for (int i = 0; i < maxinputs; i++) {
			input[i] = sc.nextInt();
		}
		List<Integer> marks = Arrays.asList(input);
		List<Integer> result = GradingSolution.gradingStudents(marks);
		System.out.println(result);
	}

}

class GradingSolution{
	
    public static List<Integer> gradingStudents(List<Integer> grades) {
    	
    	List<Integer> result = new ArrayList<>();
    	int n1 =5;
    	int n2=0;
    	
    	for(Integer n : grades) {
    		if(((n%5)<=4)&&((n%5)>=3)&&(n>=38)) {
    			
    			n2=0;
    			n2 = n2+5*((n/5)+1);
    			result.add(n2);
    		}
    		else {
    			result.add(n);
    		}
    	}
		return result;
    // Write your code here

    }
	
	
}
