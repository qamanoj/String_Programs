package com.corejava.aryTostring;

public class convertarytostringinreverse 
{
	public static void main(String[] args)
	{
		char array[]=new char[]{'j','a','v','a'};
		String s="";
		for(int i=0;i<=array.length-1;i++)
		{
			s=s+array[array.length-1-i];
		}
		System.out.println(s);
	}
}
