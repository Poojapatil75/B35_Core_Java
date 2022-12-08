package com.capgemini.ArraysDemo;

public class Varargs {

	public static void print(int a,int b,String...c)
	//String ...s is variable -argument and it contain 0-n values
	{
		System.out.println(a+" "+b);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"\t");
		}
		
	}

	public static void main(String[] args) {
		//function call
		print(12,56,"Java","Html","Css");

	}

}
