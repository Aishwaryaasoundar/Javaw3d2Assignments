package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindthesecondLargest {

	



// Here is the input
int[] data = {3,2,11,4,6,7};


/*
 Pseudo Code:
 1) Arrange the array in ascending order
 2) Pick the 2nd element from the last and print it
 */
public static void main(String[] args) {
	//List<Integer> lst = new ArrayList<Integer>() ;
	List<Integer> list = Arrays.asList(3,2,11,4,6,7);  
	Collections.sort(list, Collections.reverseOrder());  
	System.out.println(list.get(1));
	
	
}
}