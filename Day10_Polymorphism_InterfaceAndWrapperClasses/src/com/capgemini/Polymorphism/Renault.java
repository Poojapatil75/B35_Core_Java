package com.capgemini.Polymorphism;

public class Renault {
	public String model;
	
	//Constructor Overloading
	//Parameterized Constructor
	Renault(String model,String engine)
	{
		System.out.println("Model name is "+model +" " +"Model Type is "+engine );
		
		
	}
	//Parameterized Constructor
	Renault(String model)
	{
		System.out.println("Model name is :"+model);
	}
	
	

}
