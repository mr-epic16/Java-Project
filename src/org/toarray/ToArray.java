package org.toarray;

public class ToArray {
private static final String Arraylist = null;

public static void main(String[] args) {
	System.out.println("DataType Veriable [] = new datatype[Size]");
	System.out.println();
	System.out.println("sum values");
//	QUESTION 1:
//		-----------
//		Description : Write a Java program to sum values of an array
//		        Input a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//		        Output   = 55

	         int a[] =new int[]{1,2,3,4,5,6,7,8,9,10};
	         int sum1 = 0;
	        
	         for(int i = 0; i<a.length;i++) {
	        	 sum1 = sum1 + a[i];
	        }
	  
	         System.out.println("sum of value= " +sum1);
	         System.out.println();
	        
//	
//	QUESTION 2:
//		------------
//		Description : Write a Java program to calculate the average value of array elements.
//		        Input a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//		        Output   = average = 7.0 

System.out.println("average value");
	int a1 [] =new int[]{1,2,3,4,5,6,7,8,9,10};
	
	int sum = 0;
	for(int i=0; i<a1.length; i++) {
		sum = sum+a1[i];
	}
	double average = sum/a1.length;
	System.out.println("Average = " +average);
	System.out.println();

//		QUESTION 3:
//		------------
//		Description : Write a Java program to remove duplicates from array
//		        Input  a[]= {10,10,20,50,60,80,60,50}
//		        Output a[]= {10,20,50,60,80}
	
	
        
        	
//		QUESTION 4:
//		-------------
//		QUESTION 4.1:
//		-------------
//		Description : Create a new ArrayListlist with values and find the length of it
//		              Input : List = 10,20,30,90,10,10,40,50

        
//		QUESTION 4.2:
//		-------------
//		Description : Create a new LinkedListlist with values and find the length of it
//		              Input : List = 100,200,300,400,500,600,700
//
//		QUESTION 4.3:
//		-------------
//		Description : Create a new vector with values and find the length of it
//		              Input : List = 105,205,305,405,505,605,705,805
//
//		QUESTION 4.4:
//		-------------
//		Description : Create a new LinkedListlist with values and find the size() of it. 
//		              Input : List = 100,200,300,400,500,600,700
//
//		QUESTION 5:
//		------------
//		QUESTION 5.1:
//		--------------
//		Description : Get the first index value of 10 
//		              Input:   List = 10,20,30,90
//
//		QUESTION 5.2:
//		--------------
//		Description : Get the last index value of 10 
//		              Input:   List = 10,20,30,90,10,10,40,50
//
//		QUESTION 5.3:
//		--------------
//		Description : Get the index value of 50 
//		              Input:   List = 10,20,30,90,10,10,40,50
//
//		QUESTION 5.4:
//		--------------
//		Description : Get the index value of 90 
//		              Input:   List = 10,20,30,90,10,10,40,50
//
//		QUESTION 5.5:
//		--------------
//		Description : Get the each index value of 10 present in below list 
//		              Input:   List = 10,20,30,90,10,10,40,50,10
//
//		QUESTION 5.6:
//		--------------
//		Description : Get the each index value of 70 present in below list 
//		              Input:   List = 10,20,30,90,10,10,40,50,10
//
//		QUESTION 6:
//		------------
//		QUESTION 6.1:
//		--------------
//		Description : Get the value present at 2nd index
//		              Input:   List = 10,20,30,40,50,60
//
//		QUESTION 6.2:
//		--------------
//		Description : Get the value present at 4th index
//		              Input:   List = 100,200,300,400,500,600,700
//
//		QUESTION 6.3:
//		--------------
//		Description : Get the value present at 8th index
//		              Input:   List = 105,205,305,405,505,605,705,805
//
//		QUESTION 6.4:
//		--------------
//		Description : Get the each value of list by using normal for loop
//		              Input:   List = 105,205,305,405,505,605,705,805
//
//		QUESTION 6.5:
//		--------------
//		Description : Get the each value of list by using enhanced for loop
//		              Input:   List = 105,205,305,405,505,605,705,805
//
//		QUESTION 7:
//		------------
//		QUESTION 7.1:
//		--------------
//		Description : Remove the value present at 2nd index
//		              Input:   List = 10,20,30,40,50,60
//
//		QUESTION 7.2:
//		--------------
//		Description : Remove the value present at 10th index 
//		              Input:   List = 10,20,30,90,10,10,40
//
//		QUESTION 7.3:
//		--------------
//		Description : Remove the last value of 10 present in the list  
//		              Input:   List = 10,20,30,90,10,10,40
//
//		QUESTION 8:
//		-------------
//		QUESTION 8.1:
//		-------------
//		Description : Add a value 50 in the 2nd index and display the list after adding.
//		              Input : List = 10,20,30,90,10,10,40,50
//
//		QUESTION 8.2:
//		-------------
//		Description : Add a value 70 at the end of the list
//		              Input : List = 10,20,30,90,10,10,40,50
//
//		QUESTION 8.3:
//		-------------
//		Description : Add a value 80 at the 8th index of list
//		              Input : List = 10,20,30,90,10,10,40,50
//
//		QUESTION 8.4:
//		-------------
//		Description : Add a value 100 at the last index of 10 in the list
//		              Input : List = 10,20,30,90,10,10,40,50
//
//		QUESTION 9:
//		-----------
//		QUESTION 9.1:
//		-------------
//		Description : Replace the value 300 into 350 in the list
//		              Input : List = 100,200,300,400,500,600,700
//
//		QUESTION 9.2:
//		--------------
//		Description : Replace the value present in 7th index as 90 
//		              Input:   List = 10,20,30,90,10,10,40,50,10
//
//		QUESTION 9.3:
//		--------------
//		Description : Replace the 10 into 100 in List
//		        Input:   List = 10,20,30,90,10,10,40,50,30
//		        Output:  List = 100,20,30,90,100,100,40,50,30
//
//
//		QUESTION 10:
//		-------------
//		QUESTION 10.1:
//		--------------
//		Description : Create a new ArrayListlists with values and return the common values
//		              Input : List = 10,20,30,90,10,10,40,50
//		              Input : List = 30,40,50,60,80
//
//		QUESTION 10.2:
//		--------------
//		Description : Create a new ArrayListlists with values and return the common values
//		              Input : List = 10,20,30,90,10,10,40,50
//		              Input : List = 10,20,60,50,40,70,80,90
//
//		QUESTION 10.3:
//		--------------
//		Description : Create a new ArrayListlists with values and return the common values
//		              Input : List = 10,20,30,40,50,60,70,80
//		              Input : List = 100,200,300,400,500,600,700,8000
//
//		QUESTION 11:
//		-------------
//		QUESTION 11.1:
//		--------------
//		Description : Create a new ArrayListlists with values and perform removeAll() function
//		              Input : List = 10,20,30,90,10,10,40,50
//		              Input : List = 30,40,50,60,80
//
//		QUESTION 11.2:
//		--------------
//		Description : Create a new ArrayListlists with values and perform removeAll() function
//		              Input : List = 10,20,30,90,10,10,40,50
//		              Input : List = 10,20,60,50,40,70,80,90
//
//		QUESTION 11.3:
//		--------------
//		Description : Create a new ArrayListlists with values and perform removeAll() function
//		              Input : List = 10,20,30,40,50,60,70,80
//		              Input : List = 100,200,300,400,500,600,700,8000
//		        A
//



}
}
