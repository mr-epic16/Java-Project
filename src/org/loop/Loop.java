package org.loop;

public class Loop {
	public static void main(String[] args) {
		
		 int input = 100;
	        int sum = 0;
	        
	        for(int i = 1; i <= input; i=i+2)
	        {
	            sum = sum + i;    // LINE A
	            System.out.println("Sum after adding " + i + " is : " + sum); 
	        }
	        
	        System.out.println();
	        System.out.println("Sum of numbers till " + input + " is " + sum); // LINE B
	    
	    }
}