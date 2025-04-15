package com.example.stackandqueue;

public class RecursionWithStack {
	
	public static int factorial(int n)
	{
		if (n == 1) return 1;
		
		return n*factorial(n-1); // uses stack memory
	}
	
	public static void main(String[] args)
	{
		
		int num =5;
		int fact = factorial(num);
		System.out.println("factorial of " + num + " is : " + fact);
	
	}

}
