package com.capgemini.Polymorphism;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		//Object Creation
		
				MethodOverloadingDiffDataType m=new MethodOverloadingDiffDataType();
				//Method Calling
				m.addition(12, 23);
				m.addition(45, 5);

				//Object Creation
				MethodOverloadingDiffDataType m1=new MethodOverloadingDiffDataType();
				//Method Calling
				m1.addition(45, 12);
				m1.addition(45f, 45);
			}

		}

	
	


