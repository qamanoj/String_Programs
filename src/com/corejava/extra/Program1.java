package com.corejava.extra;

public class Program1 
{
	public static void main(String[] args)
	{	
		String s="My name is manoj";
		String[] a=s.split(" ");
		String temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		for (int i = 0; i <=a.length-1; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
