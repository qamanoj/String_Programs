package com.corejava.palindrome;

public class Demo 
{
	public static void main(String[] args) 
	{
		String s = "malayalam";
		char[] a= s.toCharArray();
		String s1="";
		for (int i= 0; i<=a.length-1; i++)
		{
			s1=s1+a[a.length-1-i];
		}
		//System.out.println(s1);
		if(s.equals(s1))
		{
			System.out.println(s+" is a palindrome");
		}
		else
		{
			System.out.println(s+"not a palindrome");
		}
	}
}


