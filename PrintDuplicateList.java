package Week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateList {
public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than 0
			
		//List<Integer> list1= new ArrayList<Integer>();
		//for(int i=0;i<arr.length;i++) {
	       // list1.add(arr[i]);}
		
		//for (int  count=0;count < arr.length-1;  count++) {
		Set<Integer> numbers=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			boolean duplicate=numbers.add(arr[i]);
			if(duplicate==false) {
				System.out.println(arr[i]);
			}
		}
}
}		
			
			
		
