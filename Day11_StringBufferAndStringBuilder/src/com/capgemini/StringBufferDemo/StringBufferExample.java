package com.capgemini.StringBufferDemo;

public class StringBufferExample {

	public static void main(String[] args) {
StringBuffer s=new StringBuffer("Nia Deshmukh");//12
		
		
		//capacity method returns the current capacity
		/*The capacity is the number of character that can be stored 
		(including already written characters), beyond which an allocation will occur*/
		System.out.println(s.capacity());//by default capacity is 16+it will take length of input
		System.out.println(s.length());
		System.out.println(s.append("Shiwa"));
		
		System.out.println(s.insert(2, "Capgemini"));
		System.out.println(s.capacity());//by default capacity is 16+it will take length of input


	}

}


