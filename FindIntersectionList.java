package Week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList 
{
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (should match item in both arrays)
	 */
	public static void main(String[] args) 
	{
	//List<Integer> array=new List<Integer>() ; 
	/*List<Integer> lst1= new ArrayList<Integer>() ;
	lst1.add(3);
	lst1.add(2);
	lst1.add(11);
	lst1.add(4);
	lst1.add(6);
	lst1.add(7);
	
	List<Integer> lst2= new ArrayList<Integer>() ;
	lst2.add(1);
	lst2.add(2);
	lst2.add(8);
	lst2.add(4);
	lst2.add(9);
	lst2.add(7);
	
	List<Integer> lst3 = new ArrayList<Integer>() ;
	
	
	for(int i=0;i<lst1.size();i++)
	{
		for(int j=0;j<lst2.size();j++)
		{
			if(lst1.get(i)==lst2.get(j))
			{
				System.out.println(lst1.get(i));	
			}
				
		}

	}*/
		   int[] a= {3,2,11,4,6,7};
		    
		    int[] b= {1,2,4,8,9,7};
		    
		    List<Integer> list1= new ArrayList<Integer>();//3,2,11,4,6,7
		    
		    List<Integer> list2= new ArrayList<Integer>();// 1,2,4,8,9,7
		    
		    for(int i=0;i<a.length;i++) {
		        list1.add(a[i]);
		        list2.add(b[i]);
		    }
		    //a[i]
		    for(int j=0;j<list1.size();j++) {
		        //b[i]
		        for(int k=0;k<list2.size();k++) {
		            if(list1.get(j)==list2.get(k)) {
		                System.out.println(list1.get(j));
		            }
		        }
		    }
		    
 }
}

