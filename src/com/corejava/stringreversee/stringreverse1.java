package com.corejava.stringreversee;

public class stringreverse1 
{
	public static void main(String[] args) 
	{
		String s="qspiders";
		char a[]=s.toCharArray();
		char a1[]=new char[a.length];
		for (int i = 0; i <=a.length-1; i++) 
		{
			a1[i]=a[a.length-1-i];
		}
		for (int i = 0; i <=a1.length-1; i++)
		{
			System.out.print(a1[i]);
		}
	}
}
