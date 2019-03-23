package com.corejava.extra;

public class StrintToInt 
{
	public static void main(String[] args)
	{
		String s="25";

		int a=Integer.parseInt(s);
		System.out.println(a);
		
		System.out.println("******");
		
		int itest=Integer.valueOf(s);
		System.out.println(itest);

		System.out.println("*******");

		Integer i=Integer.valueOf(s);
		System.out.println(i);

		System.out.println("*****");
		
		Integer ii=new Integer(s);
		System.out.println(ii);


	}
}
