package com.corejava.stringreversee;

public class StringReverse3 
{
	public static void main(String[] args)
	{
		String s="manoj";
		StringBuffer s1=new StringBuffer(s);
		System.out.println(s1.reverse());

		System.out.println("*********");

		String rev="";
		for (int i =s.length()-1; i>=0; i--) 
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
