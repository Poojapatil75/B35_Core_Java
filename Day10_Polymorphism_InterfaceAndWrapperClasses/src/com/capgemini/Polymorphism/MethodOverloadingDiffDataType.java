package com.capgemini.Polymorphism;

public class MethodOverloadingDiffDataType {
	
	public void addition( int x,int y)
	{
		System.out.println("The addition of x and y is :"+(x+y));
	}

	public void addition(float x,int y)
	{
		System.out.println("The addition of x and y is :"+(x+y));
	}

}



