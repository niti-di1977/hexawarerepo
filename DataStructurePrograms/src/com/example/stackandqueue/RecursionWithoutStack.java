package com.example.stackandqueue;

public class RecursionWithoutStack {
	
	public static int factorial(int n , int result)
	{
		while(n>0)
		{
			result *= n;
			n--;
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		
		int num =5;
		int fact = factorial(num ,1);
		System.out.println("factorial of " + num + " is : " + fact);
	
	}

}
