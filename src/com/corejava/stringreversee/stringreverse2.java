package com.corejava.stringreversee;

public class stringreverse2 
{
	public static void main(String[] args) 
	{
		String s="qspiders";
		char[] a=s.toCharArray();
		for (int i = 0; i <=a.length/2-1; i++) 
		{
            char temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
		}
		for (int i = 0; i <=a.length-1; i++)
		{
		 System.out.print(a[i]);	
		}
	}
}
