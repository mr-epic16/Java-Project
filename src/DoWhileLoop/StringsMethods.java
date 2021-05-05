package DoWhileLoop;

public class StringsMethods {
	
//	QUESTION 1:
//		-----------
//		Description: Find the length of the below string
	
// length method Strings
	public static void main(String[] args) {
		String s1 = "Greenstechnology";
		String s2 ="SeleniumAutomationTool";
		String s3 ="muruga";
		String s4 ="j a v a p r o g r a m";
		String s5 = "9500145322";
		int l1=s1.length();
	     	int l = s2.length();
				int l2 = s3.length();
						int l3 = s4.length();
								int l4 = s5.length();
		System.out.println(l1);
		System.out.println(l);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		
//	}
//
//}
	
		
//-----------------------------------------------------------------------------------------------------
		

		
//	QUESTION 2:
// indexof & lastindexof string methods
//		-----------
//	Description: Find the particular character index  in the given string
	
//	public static void main(String[] args) {
		String s11 = "Greenstechnology";
		String s12 ="SeleniumAutomationTool";
		String s13 ="murugan";
		String s14 ="j a v a p r o g r a m";
		String s15 = "9500148328";
		int ch1 = s11.lastIndexOf('o');
				 int ch2 = s12.indexOf('o');
						 int ch3 = s13.indexOf('n');
								 int ch4 = s14.indexOf(' ');
										 int ch5 = s15.lastIndexOf('8');

										 System.out.println(ch1);
										 System.out.println(ch2);
										 System.out.println(ch3);
										 System.out.println(ch4);
										 System.out.println(ch5);
	
//	}

										 
//-----------------------------------------------------------------------------------------------------------------------------------------------
										 
										 
//Question 3:
//-----------
//Description: Find the particular character in the given string
	
//   public static void main(String[] args) {
	
	   String z1 = "Greenstechnology";
		String z2 ="SeleniumAutomationTool";
		String z3 ="murugan";
		String z4 ="j a v a p r o g r a m";
		String z5 = "9500148378";

		char a1=z1.charAt(9);
		char a2=z2.charAt(13);
		char a3=z3.charAt(4);
		char a4=z4.charAt(8);
		char a5=z5.charAt(8);
		
System.out.println(a1);
System.out.println(a2);
System.out.println(a3);
System.out.println(a4);
System.out.println(a5);
//}


//--------------------------------------------------------------------------------------------------------------------------------------

//	QUESTION 4:
//		-----------
//		Description : Get two input from user and check the equality
//		            : print in the output whether it is Equal or not


// public static void main(String[] args) {
    	String x1= "Java";
	     String x2= "Java";
           boolean b1=x1.equals(x2);
            System.out.println(b1);

              System.out.println();

 String x3= "Java";
    String x4= "java";
       boolean b2=x3.equals(x4);
          System.out.println(b2);
          
                  System.out.println();
                  
          String x6 = "Green Technology";
          String x7 ="GreenTechnology.";
          boolean b3 =x6.equals(x7);
          System.out.println(b3);
          System.out.println("equalsIgnoreCase");
          
//          Example(use equalsIgnoreCase)
          
       boolean b4 = x1.equalsIgnoreCase(x2);
         System.out.println(b4);
         
         boolean b5 = x1.equalsIgnoreCase(x4);
         System.out.println(b5);
         
         boolean b6 = x1.equalsIgnoreCase(x6);
         System.out.println(b6);
         
         String x8 = "Nisha";
         String x9 = "nisha";
       boolean b7 = x8.equalsIgnoreCase(x9);
         System.out.println(b7);
         
//         
//         
//}

         
//-----------------------------------------------------------------------------------------------------------------
         
         
// QUESTION 5:
//	------------
//	QUESTION 5.1:
//	------------
//	Description: Get the email id from the user and verify '@' is present or not?
//	Example:
//	------------
//	Input  = velmurugank451@gmail.com
//	Output = valid email id
     
	String c1 ="velmurugank451@gmail.com";
	boolean n1 = c1.contains("@");
	System.out.println("valid Email id "+n1);
	
//	QUESTION 5.2:
//	------------
//	Description:Get the address from the user and verify "pincode" is present or not?

//	Example:
//	------------
//	Input  = 5-35-2a,venkatesh nivas,Aruppukottai
//	Output = invalid address
     
	String c2 = "5-35-2a,venkatesh nivas,Aruppukottai";
	boolean n2 = c2.contains("pincode");
	System.out.println("Invalid Address "+n2);
	
//	QUESTION 5.3:
//	------------
//	Description:Get the email from the user and verify '@' is present or not and return true or false?
//
//	Example:
//	------------
//	Input  = Nishakerala24@gmail.com
//	Output = True/False 
    
	String c3 = "Nishakerala24@gmail.com";
	boolean n3 = c3.contains("@");
	System.out.println(n3);
	
	
//	QUESTION 5.4:
//	------------
//	Description:Get the phonenumber from the user and verify any character is present or not .
//	            If character is present return invalid number
//
//	Example:
//	------------
//	Input  = 90954a6o78
//	Output = False

   
//-----------------------------------------------------------------------------------------------------------------
	
	
//   QUESTION 6:
//		-----------
//		Description:Get the phonenumber from the user  .
//		            If phonenumber exceeds greater than 10 then return invalid number
//
//		Example:
//		--------
//		Input  = 89034256972365
//		output = invalid
//		Example 2:
//		---------
//		Input  = 9095484678
//		Output = valid 	
  
	
	
//----------------------------------------------------------------------------------------------------------------------
	
	
	
//	QUESTION 7:
//		------------
//		QUESTION 7.1:
//		-------------
//		Description:Given string as "Welcome to java class" and replace java into sql.
//
//		Example:
//		-----------
//		Input  = Welcome to class java
//		output = Welcome to class sql

		String m11 = "Welcome to class java";
		String v = m11.replace("java"," sql");
  System.out.println(v);
		
  System.out.println();

//		QUESTION 7.2:
//		-------------
//		Description:Given string as "Greens Adayar"and replace Adayar into Omr.
//
//		Example:
//		-----------
//		Input  = Greens Adayar
//		Output = Greens Omr

      String m10="Greens Adayar";
      String v1=m10.replace("Adayar", "omr");
      System.out.println(v1);
      System.out.println();

//		QUESTION 7.3:
//		-------------
//		Description: Given String as "Welcome to java class" and Replace space into '#'
//
//		Example:
//		----------
//		input:Welcome to java class
//		output:Welcome#to#java#class

         String m12 = "Welcome to class java";
         String v2 =m12.replace(" ","#");
         System.out.println(v2);
         System.out.println();

//		QUESTION 7.4:
//		------------
//		Description:Get the email from the user and verify "gmail" is present or not.
//		            If present replace that gmail into yahoo
//
//		Example:
//		------------
//		Input  = Nishakerala24@gmail.com
//		Output = Nishakerala24@yahoo.com 

         String m14 = "Nishakerala24@gmail.com";
         String v3 = m14.replace("gmail", "yahoo");
         System.out.println(v3);
         System.out.println();
//		QUESTION 7.5:
//		------------
//		Description:Get the address from the user and verify "pincode" is present or not.
//		            If present replce the pincode with empty space
//
//		Example:
//		------------
//		Input  = 5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101
//		Output = 5-35-2a,venkatesh nivas,Aruppukottai 

        String m15 = "5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
         String v4= m15.replace(",pincode-626101", " ");
	  System.out.println(v4);   
	
      System.out.println();

//-----------------------------------------------------------------------------------------------------
//      QUESTION 8
//      ----------
//      QUESTION 8.1
//      -------------
//      Description:Get the input from the user and print that word in lowercase
//
//      Example:
//      --------
//      Input  = NISHANTHI
//      Output = nishanthi
System.out.println("toLowercase");

      String q ="NISHANTHI";
      System.out.println(q);
      String w = q.toLowerCase();
      System.out.println(w);
      System.out.println();
//      QUESTION 8.2
//      -------------
//      Description:Get the input from the user and print that word in Uppercase
//
//      Example:
//      --------
//      Input  = nishanthi
//      Output = NISHANTHI
      System.out.println("toUppercase");
      String q1 = "nishanthi";
      System.out.println(q1);
      String w1 = q1.toUpperCase();
    		  System.out.println(w1);
    		 
//      QUESTION 8.3
//      ---------------
//      Description:Convert all small letter and into capital letter
//
//      Example:
//      ----------
//      Input  = WelcomE
//      Output = wELCOMe
  
//-------------------------------------------------------------------------------------------------------------------
    		  
    		 
//      QUESTION 8.4
//      --------------
//      Description:Find the number of uppercase count and lowercase count in the given String
//
//      Example:
//      --------
//      Input = WelComeToJava
//      Output:
//      -------
//      UpperCase=4
//      LowerCase=9
//	


    		  System.out.println();
//----------------------------------------------------------------------------------------------------------------------------------
    
    		  
    		  
//    		  QUESTION 9
//    		  ------------
    		  
//    		  QUESTION 9.1
//    		  --------------
//    		  Description: Given String as "Welcome to java class" and verify whether the given string startsWith welcome
//
//    		  Example:
//    		  -----------
//    		  Input  = Welcome to class java
//    		  output = True
              System.out.println("Starts With");
    		 String e = "Welcome to class java";
    		 System.out.println(e);
    		boolean r = e.startsWith("Welcome");
    		 System.out.println(r);
    		 
//
//    		  QUESTION 9.2
//    		  --------------
//    		  Description: Given String as "Hai i am nisha" and verify whether the given string startsWith welcome
//
//    		  Example:
//    		  -----------
//    		  Input  = Hai i am nisha
//    		  output = False

    		 String e1 = "Hai i am nisha";
    		 boolean r1 = e1.startsWith("welcome");

    				 System.out.println(r1);
    				 System.out.println();
//    		  QUESTION 9.3
//    		  --------------
//    		  Description: Given String as "Welcome to java class" and verify whether the given string endsWith class
//
//    		  Example:
//  		  -----------
    				 System.out.println("Ends With");
//    		  Input  = Welcome to java class
//    		  output = True

    				 String e2 = "Welcome to java class";
    				 System.out.println(e2);
    				 boolean r2= e2.endsWith("class");
    				 System.out.println(r2);
//    		  QUESTION 9.4
//    		  --------------
//    		  Description: Given String as "Welcome to java class" and verify whether the given string endsWith java
//
//    		  Example:
//    		  -----------
//    		  Input  = Welcome to java class
//    		  output = False

    				 boolean r3 = e2.endsWith("java");
    				 System.out.println(r3);
    				 System.out.println();
//    		  QUESTION 9.5
//    		  --------------
//    		  Description: Given String as "Welcome to java class" and verify whether the string is empty or not
//
//    		  Example:
//    		  -----------
    				 System.out.println("isEmpty");
//    		  Input  = Welcome to java class
//    		  output = False
//
    				 System.out.println(e2);
    				 boolean r4=e2.isEmpty();
    				 System.out.println(r4);
//    		  QUESTION 9.6
//    		  --------------
//    		  Description: Given String as "" and verify whether the string is empty or not
//
//    		  Example:
//    		  -----------
//    		  Input  = ""
//    		  Output = False    		  
//	
	
    				 String e3 = "";
    				 boolean r5 =e3.isEmpty();
    				 System.out.println(r5);
	
//--------------------------------------------------------------------	
	
//    				 QUESTION 10
//    				 -----------
//    				 Description : Get two input from user and Compare 
//
//    				 Example
//    				 ---------
//    				 String 1 : Nisha
//    				 String 2 : nisha
System.out.println("Compare");
    				 String zx = "Nisha";
    				 String zx1 = "nisha";
    				 int xz = zx.compareTo(zx1);
    				 System.out.println(xz);
    				 System.out.println();
//    				 Example
//    				 ---------
//    				 String 1 : Nia
//    				 String 2 : nisha

    				 String zx2 = "Nia";
    				 String zx3 = "nisha";
    				 int xz1 =zx2.compareTo(zx3);
    				 System.out.println(xz1);
    				 System.out.println();
//    				 QUESTION 11
//    				 ------------
//    				 QUESTION 11.1
//    				 ---------------
//    				 Description : Generate the two literal string and find the identityHashCose()
//
//    				 Example
//    				 ---------
//    				 String 1 : Nisha
//    				 String 2 : Nisha
System.out.println("Literal String");
    				 String as = "Nisha";
    				 String as1 = "Nisha";
    		
    				 System.out.println(System.identityHashCode(as));
    				 System.out.println(System.identityHashCode(as1));
//    				 QUESTION 11.2
//    				 ---------------
//    				 Description : Generate the two non literal string and find the identityHashCose()
//
//    				 Example
//    				 ---------
//    				 String 1 : Nisha
//    				 String 2 : Nisha
    				 System.out.println();
    				 System.out.println("non Literal String");

    				 String as2 = new String("Nisha");
    				 String as3 = new String("Nisha");
    				 
    				 System.out.println(System.identityHashCode(as2));
    				 System.out.println(System.identityHashCode(as3));
//    				 QUESTION 11.3
//    				 ---------------
//    				 Description : Generate the three non literal string and find the identityHashCose()
//
//    				 Example
//    				 ---------
//    				 String 1 : Nisha
//    				 String 2 : Rengan
//    				 String 3 : NishaRengan

System.out.println("three non literal string");
    				 String as4 = new String ("Nisha");
    				 String as5 = new String("Rengan");
    				 String as6 = new String("NishaRegan");
    				 System.out.println(System.identityHashCode(as4));
    				 System.out.println(System.identityHashCode(as5));
    				 System.out.println(System.identityHashCode(as6));
    				 System.out.println();
//    				 QUESTION 11.4
//    				 ---------------
//    				 Description : Generate the three literal string and find the identityHashCose()
//
//    				 Example
//    				 ---------
//    				 String 1 : Nisha
//    				 String 2 : Rengan
//    				 String 3 : NishaRengan

    				 System.out.println("three literal string");
    				 String as7 = "Nisha";
    				 String as8 = "Rengan";
    				 String as9 = "NishaRengan";
    				 System.out.println(System.identityHashCode(as7));
    				 System.out.println(System.identityHashCode(as8));
    				 System.out.println(System.identityHashCode(as9));
    				 System.out.println();
    				 
//    				 QUESTION 12
//    				 ------------
//    				 QUESTION 12.1
//    				 --------------
//    				 Description: Given String as "Welcome to java class" and split it by space.
//
//    				 Example:
//    				 --------
//    				 Input :Welcome to java class 
//    				 Output:
//    				 -------
//    				 Welcome
//    				 to
//    				 java
//    				 class

  System.out.println("Split");
    				 String sp = "Welcome to Java Class";
    				 String[] sp1 =sp.split(" ");
    				for(int i = 0;i<sp1.length;i++) {
    					System.out.println(sp1[i]);
    				}
//    				 QUESTION 12.2
//    				 --------------
//    				 Description: Given String as "Welcome to java class" and split it by l 
//
//    				 Example:
//    				 --------
//    				 Input :Welcome to java class 
//    				 Output:
//    				 -------
//    				 We
//    				 come to java c
//    				 ass
System.out.println();
    				 String[] sp2 =sp.split("l");
     				for(int i = 0;i<sp2.length;i++) {
     					System.out.println(sp2[i]);
     				}
//    				 QUESTION 13
//    				 ------------
//    				 QUESTION 13.1
//    				 --------------
//    				 Description: Given String as "Welcome to java class" and generate a substring.
//
//    				 Example:
//    				 --------
//    				 Input :Welcome to java class 
//    				 Output:
//    				 -------
//    				 Welcome
System.out.println();
     				 String[] sp4 =sp.split("to Java Class");
     				for(int i = 0;i<sp4.length;i++) {
     					System.out.println(sp4[i]);
     				}
     				System.out.println();
     				
//    				 QUESTION 14
//    				 -----------
//    				 Example:
//    				 -----------
//    				 Description: Given String as "Welcome" and the number of consonant count and vowels count
//
//    				 Example:
//    				 ---------
//    				 Input  = Welcome
//    				 output:
//    				 -------
//    				 vowels    = 3
//    				 consonant = 4
//
//    				 QUESTION 15:
//    				 ------------
//    				 Description: Find the count of caps,small,number and special character in given string
//
//    				 Example:
//    				 -----------
//    				 Input : Welcome To Java class @123
//    				 Output
//    				 ------
//    				 caps count  :3
//    				 small count :15
//    				 number count:3
//    				 Special char:5
//
//    				 QUESTION 16
//    				 ------------
//    				 Description: Replace all vowels char into '@'
//
//    				 Example:
//    				 ----------
//    				 Input  = Welcome
//    				 Output = W@lc@m@  
//	

	
	
	
	
	



	}


}
