package com.corejava.jjaavvaa;

public class avaj 
{
	public static void main(String[] args) 
	{
		String s="java";
		char a[]=s.toCharArray();
		String s1="";
		for (int i = 0; i <=a.length-1; i++) 
		{
			s1=s1+a[a.length-1-i]+a[a.length-1-i];
		}
		System.out.println(s1);
	}
}
