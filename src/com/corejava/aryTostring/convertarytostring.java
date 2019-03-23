package com.corejava.aryTostring;

public class convertarytostring
{
	public static void main(String[] args)
	{
	  char array[]=new char[]{'j','a','v','a'};
	  String s="";
	  for(int i=0;i<=array.length-1;i++)
	  {
		  s=s+array[i];
	  }
	  System.out.println(s);
	}
}
