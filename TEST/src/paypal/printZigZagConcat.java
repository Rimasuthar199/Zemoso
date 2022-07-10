package paypal;

import java.util.Arrays;
import java.util.List;

public class printZigZagConcat {
	
	  // Prints concatenation
    // of all rows of str's
    // Zig-Zag fashion
    static void printZigZagConcat(String str, int n)
    {
    	if(n == 1) {
    		System.out.println(str);
    	} else {
    		
    		int len = str.length();
    		String[] arr = new String[n];
    		
    	     char[] data = str.toCharArray();
    	     Arrays.fill(arr, "");
    	     int row = 0;
    	     boolean down = true;
    	     
    	     for (int i = 0; i < len; i++) {
    	    	 
    	    	 arr[row] += (data[i]);
    	    	 
    	    	 if(row == n-1) {
    	    		 down = false;
    	    	 }
				
    	    	 if(row == 0) {
    	    		 down = true;
    	    	 }
    	    	 
    	    	 if(down) {
    	    		 row++;
    	    	 } else {
    	    		 row--;
    	    	 }
			}
    	     for (int i = 0; i < arr.length; i++) {
    				System.out.print(arr[i]);
    			}
    	 
    	}
    	
    	
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        String str = "GEEKSFORGEEKS";
        int n = 3;
        printZigZagConcat(str, n);
    }
}