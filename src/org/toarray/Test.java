package org.toarray;

import java.util.*;

public class Test {

public static void main(String[] args) {
	
System.out.println("ArrayList List ........");


//	QUESTION 4:
    List <Integer>l1=new ArrayList<>();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(90);
	l1.add(10);
	l1.add(10);
	l1.add(40);
	l1.add(50);
	System.out.println(l1);
	int length1 = l1.size();
	System.out.println("length of ArrayList= " +length1);
	System.out.println();
	
   
//	QUESTION 4.2:
    System.out.println("LinkedListlist");

	List l2 = new LinkedList();

	l2.add(100);
	l2.add(200);
	l2.add(300);
	l2.add(400);
	l2.add(500);
	l2.add(600);
	l2.add(700);
	int length2 = l2.size();
	System.out.println(l2);
	System.out.println("Length of  LinkedList is = "+length2);
	System.out.println();
	
	
	
//	QUESTION 4.3:
    System.out.println("Vector");
	List<Integer> l3 = new Vector<>();
	l3.add(105);
	l3.add(205);
	l3.add(305);
	l3.add(405);
	l3.add(505);
	l3.add(605);
	l3.add(705);
	l3.add(805);
	int length3 = l3.size();
	System.out.println(l3);
	System.out.println("Vector value Lengthy is= "+length3);
	System.out.println();
	
	
//	QUESTION 4.4:
	System.out.println("LinkedListlist Find the value");
	List l4 = new LinkedList();

	l2.add(100);
	l2.add(200);
	l2.add(300);
	l2.add(400);
	l2.add(500);
	l2.add(600);
	l2.add(700);
	int size = l4.size();
	System.out.println("Length of  LinkedList is = "+size);
	System.out.println();
	
	
	
//	QUESTION 5.1:
	System.out.println("Index of value");
	int v1 = l1.indexOf(10);
	System.out.println("index value is = "+v1);
	System.out.println();
	
	
//	QUESTION 5.2:
	System.out.println("Index of LastIndezOf of Value");
	int v2 = l1.lastIndexOf(10);
	System.out.println("lastIndexOf value of= "+v2);
	System.out.println();
	
	
//	QUESTION 5.3:
	System.out.println("index value of");
	int v4 = l1.indexOf(50);
	System.out.println("index value of= "+v4);
	System.out.println();
	
	
//	QUESTION 5.4:
	System.out.println("index value of");
	int v5 = l1.indexOf(90);
	System.out.println("index value of= "+v5);
	System.out.println();
	
	
	
//	QUESTION 5.5:
	System.out.println("contains of present or not");
	boolean t1 = l1.contains(10);
	System.out.println(t1);
	System.out.println();
	
	
	
//	QUESTION 5.6:
	System.out.println("contains of present or not");
	boolean t2 = l1.contains(70);
	System.out.println(t2);
	System.out.println();


//	QUESTION 6.1:
	System.out.println("present value at 2nd index");
	Integer a1 = l1.get(2);
	System.out.println(a1);
	System.out.println();
	
	
	
//	QUESTION 6.2:
	System.out.println("present value at 4nd index");
	Object a2 = l2.get(4);
	System.out.println(a2);
	System.out.println();
	
	
//	QUESTION 6.3:
	System.out.println("present value at 8nd index");
	Object a3 = l3.get(7);
	System.out.println(a3);
	System.out.println();

	
	
//	QUESTION 6.4:
	System.out.println("Normal for loop");
	for(int i=0;i<l3.size();i++) {
	System.out.println(l3.get(i));
	}
	System.out.println();
	
	
//	QUESTION 6.5:
	System.out.println("Enhanced loop");
	for(Integer x: l3) {
	System.out.println(x);
	}
	System.out.println();
	

//	QUESTION 7.1:
    System.out.println("Remove the value present at 2nd index");
	List l5 = new ArrayList();
	l5.add(10);
	l5.add(20);
	l5.add(30);
	l5.add(40);
	l5.add(50);
	l5.add(60);
	System.out.println("Before");
	System.out.println(l5);
	Object z1 = l5.remove(2);
	
	System.out.println("Affter");
	System.out.println(l5);
	System.out.println();
	
	
//	QUESTION 7.2:
    System.out.println("Remove the value present at 10th index");
	
	List l6 = new ArrayList();
	l6.add(10);
	l6.add(20);
	l6.add(30);
	l6.add(90);
	l6.add(10);
	l6.add(10);
	l6.add(40);
	System.out.println("Before");
	System.out.println(l6);
	Object z2 = l6.remove(0);
	System.out.println("Affter");
	System.out.println(l6);
	System.out.println();
	
	
//	QUESTION 7.3:
    System.out.println("Remove the last value of 10 present");

    List l14 = new ArrayList();
	l14.add(10);
	l14.add(20);
	l14.add(30);
	l14.add(90);
	l14.add(10);
	l14.add(10);
	l14.add(40);
	System.out.println("Before");
	System.out.println(l6);
	Object z3 = l14.remove(5);
	System.out.println("Affter");
	System.out.println(l14);
	System.out.println();
	
	
	
//	QUESTION 8.1:
    System.out.println("add value 50 in index 2nd");

    System.out.println("before");
    System.out.println(l1);

	l1.add(2, 50);
	
	System.out.println("affter");
	System.out.println(l1);
	System.out.println();

	
//	QUESTION 8.2:
	System.out.println("Add a value 70 at the end of the list");
	
	System.out.println("before");
	System.out.println(l1);
		
		System.out.println("affter");
		l1.add(70);
		System.out.println(l1);
		System.out.println();
		
		
//	QUESTION 8.3:
	System.out.println("Add a value 80 at the 8th index ");
		
		
		System.out.println("before");
		System.out.println(l1);

			System.out.println("affter");
			l1.set(8, 80);
			System.out.println(l1);
			System.out.println();
			
			
//	QUESTION 8.4:
	System.out.println("Add a value 100 at the last index of 10");
			
			
			System.out.println("before");
			System.out.println(l1);

				System.out.println("affter");
				l1.add(10, 100);
				System.out.println(l1);
				System.out.println();

				
				
//	QUESTION 9.1:
    System.out.println();
	System.out.println("Replace the value 300 into 350 in the list");
				System.out.println();
				System.out.println("Before");
				System.out.println(l2);
			l2.set(2, 350);
			System.out.println("affter");
			System.out.println(l2);
			
			
//	QUESTION 9.2:
    System.out.println();
	System.out.println(" Replace the value present in 7th index as 90 ");
				System.out.println();
				System.out.println("Before");
				System.out.println(l1);
			l1.set(7, 90);
			System.out.println("affter");
			System.out.println(l1);
			
			
			
//	QUESTION 9.3:
	System.out.println();
	System.out.println("Replace the 10 into 100 in List");
				System.out.println();
				System.out.println("Before");
				System.out.println(l6);
			l6.set(3, 100);
			l6.set(4, 100);



			System.out.println("affter");
			System.out.println(l6);
			


//	QUESTION 10.1:
    System.out.println();System.out.println("common values");
			List l7 = new ArrayList();
			l7.add(30);
			l7.add(40);
			l7.add(50);
			l7.add(60);
			l7.add(80);
			System.out.println("Before");
			System.out.println(l1);
			System.out.println(l7);
			System.out.println("Affter");
			l7.retainAll(l1);
			System.out.println(l7);
			
			
			
//	QUESTION 10.2:
    System.out.println();
    System.out.println("common values");
			   
            List l8 = new ArrayList();
   			l8.add(10);
   			l8.add(20);
   			l8.add(60);
   			l8.add(50);
   			l8.add(40);
   			l8.add(70);
   			l8.add(80);
   			l8.add(90);
   			System.out.println("Before");
   			System.out.println(l1);
   			System.out.println(l8);
   			System.out.println("Affter");
   			l8.retainAll(l1);
   			System.out.println(l8);
			
			
			
//	QUESTION 10.3:
    System.out.println();
               List l10 = new ArrayList();
               l10.add(100);
               l10.add(200);
               l10.add(300);
               l10.add(400);
               l10.add(500);
               l10.add(600);
               l10.add(700);
               l10.add(8000);
      
		               	System.out.println();
		              	System.out.println("common values");
						List l9 = new ArrayList();
						l9.add(10);
						l9.add(20);
						l9.add(30);
						l9.add(40);
						l9.add(50);
						l9.add(60);
						l9.add(70);
						l9.add(80);
						System.out.println("Before");
						System.out.println(l10);
						System.out.println(l9);
						System.out.println("Affter");
						l9.retainAll(l10);
						System.out.println(l9);

						
						
//	QUESTION 11.1:
	System.out.println();System.out.println("Unique Values");
						List l11 = new ArrayList();
						l11.add(30);
						l11.add(40);
						l11.add(50);
						l11.add(60);
						l11.add(80);
						System.out.println("Before");
						System.out.println(l1);
						System.out.println(l11);
						System.out.println("Affter");
						l11.removeAll(l1);
						
						System.out.println(l11);
						
						
						
//	QUESTION 11.2:
	System.out.println();System.out.println("Unique Values");
						List l12 = new ArrayList();
						l12.add(10);
						l12.add(20);
						l12.add(60);
						l12.add(50);
						l12.add(40);
						l12.add(70);
						l12.add(80);
						l12.add(90);
						System.out.println("Before");
						System.out.println(l1);
						System.out.println(l12);
						System.out.println("Affter");
						l12.removeAll(l1);
						
						System.out.println(l12);	
						System.out.println();
					
						
						
//	QUESTION 11.3:
		                List l13 = new ArrayList();
						l13.add(10);
						l13.add(20);
						l13.add(30);
						l13.add(40);
						l13.add(50);
						l13.add(60);
						l13.add(70);
						l13.add(80);
						System.out.println();
						System.out.println("Unique Values");
						System.out.println("Before");
						System.out.println(l13);
						System.out.println(l10);
						System.out.println("Affter");
						l13.removeAll(l10);
						
						System.out.println(l13);	
										
}

}
	
	

	



	
