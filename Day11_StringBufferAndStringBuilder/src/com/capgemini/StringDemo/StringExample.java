package com.capgemini.StringDemo;

public class StringExample {

	public static void main(String[] args) {
		
		String str1="Welcome to Capgemini";
		String str2="Welcome to Capgemini";
		//by using new keyword
		String name=new String("Welcome to Campus Drive of Capgemini");
		String name1=new String("Welcome to Campus Drive of Capgemini");

		System.out.println(str1==str2);
		//we cannot concat any null string
		System.out.println(name==name1);
		System.out.println(name.equals(name1));//true

		System.out.println(name==str1);
		/*before any strings if there is any two number or more than that
		 * then it will perform addition but after any string is there is any numbers
		 * then it performs concatenation.
		 */
		System.out.println(55+50+50+"Hello"+30+60+90);
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter the first-set String");
		
		//by using new keyword
		String str1=s.nextLine();
		String str11=s.nextLine();
		
		//by using new keyword
		/*System.out.println("Enter the Second-set String");
		String str2=new String(s.nextLine());
		String str22=new String(s.nextLine());
		System.out.println(str1);
		
		System.out.println(str2);
		
		//System.out.println(str1==str2);
		System.out.println(str1==str11)*/

		


	}

}
